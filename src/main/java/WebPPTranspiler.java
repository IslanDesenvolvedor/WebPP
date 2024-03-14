import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WebPPTranspiler extends WebPPBaseVisitor<Void> {

    private BufferedWriter writer;

    public WebPPTranspiler(String outputFileName) {
        try {
            writer = new BufferedWriter(new FileWriter(outputFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Void visitInterfaceDeclaration(WebPPParser.InterfaceDeclarationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitDoctypeAnnotation(WebPPParser.DoctypeAnnotationContext ctx) {
        writeHtml("<!DOCTYPE " + ctx.STRING().getText().replace("\"", "") + ">");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitHtmlElement(WebPPParser.HtmlElementContext ctx) {
        writeHtml("<html lang=" + ctx.langAttribute().STRING().getText() + ">");
        visitChildren(ctx);
        writeHtml("</html>");
        return null;
    }

    @Override
    public Void visitHeadElement(WebPPParser.HeadElementContext ctx) {
        writeHtml("<head>");
        visitChildren(ctx);
        writeHtml("</head>");
        return null;
    }

    @Override
    public Void visitCharsetAttribute(WebPPParser.CharsetAttributeContext ctx) {
        writeHtml("   <meta charset=" + ctx.STRING().getText() + ">");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitNameContentAttributes(WebPPParser.NameContentAttributesContext ctx) {
        for (WebPPParser.NameValuePairContext pair : ctx.nameValuePair()) {
            String itemName = pair.STRING(0).getText();
            String itemContent = pair.STRING(1).getText();

            writeHtml("   <meta name=" + itemName + " content=" + itemContent + ">");
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitTitleElement(WebPPParser.TitleElementContext ctx) {
        writeHtml("   <title>" + ctx.STRING().getText().replace("\"", "") + "</title>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitBodyElement(WebPPParser.BodyElementContext ctx) {
        writeHtml("<body>");
        visitChildren(ctx);
        writeHtml("</body>");
        return null;
    }

    @Override
    public Void visitPElement(WebPPParser.PElementContext ctx) {
        writeHtml("   <p>" + ctx.STRING().getText().replace("\"", "") + "</p>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitH1Element(WebPPParser.H1ElementContext ctx) {
        writeHtml("   <h1>" + ctx.STRING().getText().replace("\"", "") + "</h1>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitH2Element(WebPPParser.H2ElementContext ctx) {
        writeHtml("   <h2>" + ctx.STRING().getText().replace("\"", "") + "</h2>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitH3Element(WebPPParser.H3ElementContext ctx) {
        writeHtml("   <h3>" + ctx.STRING().getText().replace("\"", "") + "</h3>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitH4Element(WebPPParser.H4ElementContext ctx) {
        writeHtml("   <h4>" + ctx.STRING().getText().replace("\"", "") + "</h4>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitH5Element(WebPPParser.H5ElementContext ctx) {
        writeHtml("   <h5>" + ctx.STRING().getText().replace("\"", "") + "</h5>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitH6Element(WebPPParser.H6ElementContext ctx) {
        writeHtml("   <h6>" + ctx.STRING().getText().replace("\"", "") + "</h6>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitUlElement(WebPPParser.UlElementContext ctx) {
        writeHtml("   <ul>");
        visitChildren(ctx);
        writeHtml("   </ul>");
        return null;
    }

    @Override
    public Void visitAElement(WebPPParser.AElementContext ctx) {
        writeHtml("   <a href=" + ctx.hrefAttribute().STRING().getText() + ">" +
                ctx.STRING().getText().replace("\"", "") + "</a>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitAbbrElement(WebPPParser.AbbrElementContext ctx) {
        writeHtml("   <abbr title=" + ctx.titleAttribute().STRING().getText() + ">" +
                ctx.STRING().getText().replace("\"", "") + "</abbr>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitLiElement(WebPPParser.LiElementContext ctx) {
        for (TerminalNode item : ctx.STRING()) {
            writeHtml("      <li>" + item.getText().replace("\"", "") + "</li>");
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitAudioElement(WebPPParser.AudioElementContext ctx) {
        writeHtml("<audio " + ctx.ID().getText() + ">");
        visitChildren(ctx);
        writeHtml("</audio>");
        return null;
    }

    @Override
    public Void visitSourceElement(WebPPParser.SourceElementContext ctx) {
        for (WebPPParser.SrcValuePairContext pair : ctx.srcValuePair()) {
            String itemSrc = pair.STRING(0).getText();
            String itemType = pair.STRING(1).getText();

            writeHtml("   <source src=" + itemSrc + " type=" + itemType + ">");
        }

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitHrElement(WebPPParser.HrElementContext ctx) {
        writeHtml("   <hr>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitDialogElement(WebPPParser.DialogElementContext ctx) {
        writeHtml("   <dialog " + ctx.ID().getText() + ">" +
                ctx.STRING().getText().replace("\"", "") + "</dialog>");
        visitChildren(ctx);
        return null;
    }

    private void writeHtml(String content) {
        try {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeWriter() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
