// Generated from /home/islan/IdeaProjects/WebPP/src/main/WebPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebPPParser#webppFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebppFile(WebPPParser.WebppFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(WebPPParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#doctypeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeAnnotation(WebPPParser.DoctypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(WebPPParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#langAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLangAttribute(WebPPParser.LangAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadElement(WebPPParser.HeadElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#metaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaElement(WebPPParser.MetaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#charsetAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetAttribute(WebPPParser.CharsetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#nameContentAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameContentAttributes(WebPPParser.NameContentAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#nameValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValuePair(WebPPParser.NameValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleElement(WebPPParser.TitleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyElement(WebPPParser.BodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#pElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(WebPPParser.PElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#h1Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Element(WebPPParser.H1ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#h2Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Element(WebPPParser.H2ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#h3Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3Element(WebPPParser.H3ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#h4Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4Element(WebPPParser.H4ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#h5Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5Element(WebPPParser.H5ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#h6Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6Element(WebPPParser.H6ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#ulElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUlElement(WebPPParser.UlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#aElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAElement(WebPPParser.AElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#hrefAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrefAttribute(WebPPParser.HrefAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#abbrElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrElement(WebPPParser.AbbrElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#titleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleAttribute(WebPPParser.TitleAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#audioElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudioElement(WebPPParser.AudioElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(WebPPParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#srcValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcValuePair(WebPPParser.SrcValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#hrElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrElement(WebPPParser.HrElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#dialogElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogElement(WebPPParser.DialogElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#liElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiElement(WebPPParser.LiElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebPPParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(WebPPParser.CommentsContext ctx);
}