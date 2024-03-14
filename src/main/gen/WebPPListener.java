// Generated from /home/islan/IdeaProjects/WebPP/src/main/WebPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebPPParser}.
 */
public interface WebPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebPPParser#webppFile}.
	 * @param ctx the parse tree
	 */
	void enterWebppFile(WebPPParser.WebppFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#webppFile}.
	 * @param ctx the parse tree
	 */
	void exitWebppFile(WebPPParser.WebppFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(WebPPParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(WebPPParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#doctypeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeAnnotation(WebPPParser.DoctypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#doctypeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeAnnotation(WebPPParser.DoctypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(WebPPParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(WebPPParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#langAttribute}.
	 * @param ctx the parse tree
	 */
	void enterLangAttribute(WebPPParser.LangAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#langAttribute}.
	 * @param ctx the parse tree
	 */
	void exitLangAttribute(WebPPParser.LangAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterHeadElement(WebPPParser.HeadElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitHeadElement(WebPPParser.HeadElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#metaElement}.
	 * @param ctx the parse tree
	 */
	void enterMetaElement(WebPPParser.MetaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#metaElement}.
	 * @param ctx the parse tree
	 */
	void exitMetaElement(WebPPParser.MetaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#charsetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterCharsetAttribute(WebPPParser.CharsetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#charsetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitCharsetAttribute(WebPPParser.CharsetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#nameContentAttributes}.
	 * @param ctx the parse tree
	 */
	void enterNameContentAttributes(WebPPParser.NameContentAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#nameContentAttributes}.
	 * @param ctx the parse tree
	 */
	void exitNameContentAttributes(WebPPParser.NameContentAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#nameValuePair}.
	 * @param ctx the parse tree
	 */
	void enterNameValuePair(WebPPParser.NameValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#nameValuePair}.
	 * @param ctx the parse tree
	 */
	void exitNameValuePair(WebPPParser.NameValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterTitleElement(WebPPParser.TitleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitTitleElement(WebPPParser.TitleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterBodyElement(WebPPParser.BodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitBodyElement(WebPPParser.BodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#pElement}.
	 * @param ctx the parse tree
	 */
	void enterPElement(WebPPParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#pElement}.
	 * @param ctx the parse tree
	 */
	void exitPElement(WebPPParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#h1Element}.
	 * @param ctx the parse tree
	 */
	void enterH1Element(WebPPParser.H1ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#h1Element}.
	 * @param ctx the parse tree
	 */
	void exitH1Element(WebPPParser.H1ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void enterH2Element(WebPPParser.H2ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void exitH2Element(WebPPParser.H2ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#h3Element}.
	 * @param ctx the parse tree
	 */
	void enterH3Element(WebPPParser.H3ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#h3Element}.
	 * @param ctx the parse tree
	 */
	void exitH3Element(WebPPParser.H3ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#h4Element}.
	 * @param ctx the parse tree
	 */
	void enterH4Element(WebPPParser.H4ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#h4Element}.
	 * @param ctx the parse tree
	 */
	void exitH4Element(WebPPParser.H4ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#h5Element}.
	 * @param ctx the parse tree
	 */
	void enterH5Element(WebPPParser.H5ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#h5Element}.
	 * @param ctx the parse tree
	 */
	void exitH5Element(WebPPParser.H5ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#h6Element}.
	 * @param ctx the parse tree
	 */
	void enterH6Element(WebPPParser.H6ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#h6Element}.
	 * @param ctx the parse tree
	 */
	void exitH6Element(WebPPParser.H6ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#ulElement}.
	 * @param ctx the parse tree
	 */
	void enterUlElement(WebPPParser.UlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#ulElement}.
	 * @param ctx the parse tree
	 */
	void exitUlElement(WebPPParser.UlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#aElement}.
	 * @param ctx the parse tree
	 */
	void enterAElement(WebPPParser.AElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#aElement}.
	 * @param ctx the parse tree
	 */
	void exitAElement(WebPPParser.AElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#hrefAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHrefAttribute(WebPPParser.HrefAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#hrefAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHrefAttribute(WebPPParser.HrefAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#abbrElement}.
	 * @param ctx the parse tree
	 */
	void enterAbbrElement(WebPPParser.AbbrElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#abbrElement}.
	 * @param ctx the parse tree
	 */
	void exitAbbrElement(WebPPParser.AbbrElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#titleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTitleAttribute(WebPPParser.TitleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#titleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTitleAttribute(WebPPParser.TitleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#audioElement}.
	 * @param ctx the parse tree
	 */
	void enterAudioElement(WebPPParser.AudioElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#audioElement}.
	 * @param ctx the parse tree
	 */
	void exitAudioElement(WebPPParser.AudioElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(WebPPParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(WebPPParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#srcValuePair}.
	 * @param ctx the parse tree
	 */
	void enterSrcValuePair(WebPPParser.SrcValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#srcValuePair}.
	 * @param ctx the parse tree
	 */
	void exitSrcValuePair(WebPPParser.SrcValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#hrElement}.
	 * @param ctx the parse tree
	 */
	void enterHrElement(WebPPParser.HrElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#hrElement}.
	 * @param ctx the parse tree
	 */
	void exitHrElement(WebPPParser.HrElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#dialogElement}.
	 * @param ctx the parse tree
	 */
	void enterDialogElement(WebPPParser.DialogElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#dialogElement}.
	 * @param ctx the parse tree
	 */
	void exitDialogElement(WebPPParser.DialogElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#liElement}.
	 * @param ctx the parse tree
	 */
	void enterLiElement(WebPPParser.LiElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#liElement}.
	 * @param ctx the parse tree
	 */
	void exitLiElement(WebPPParser.LiElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebPPParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(WebPPParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebPPParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(WebPPParser.CommentsContext ctx);
}