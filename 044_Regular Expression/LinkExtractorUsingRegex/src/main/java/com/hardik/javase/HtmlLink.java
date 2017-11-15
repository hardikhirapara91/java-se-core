package com.hardik.javase;

/**
 * HTML Link
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class HtmlLink {

	private String htmlLink;
	private String htmlLinkAttr;

	public String getHtmlLink() {
		return htmlLink;
	}

	public void setHtmlLink(String htmlLink) {
		this.htmlLink = this.replaceInvalidChars(htmlLink);
	}

	public String getHtmlLinkAttr() {
		return htmlLinkAttr;
	}

	public void setHtmlLinkAttr(String htmlLinkAttr) {
		this.htmlLinkAttr = htmlLinkAttr;
	}

	@Override
	public String toString() {
		return "HTML Link [htmlLink=" + getHtmlLink() + ", htmlLinkAttr=" + getHtmlLinkAttr() + "]";
	}

	// PRIVATE METHODS
	private String replaceInvalidChars(String input) {
		input = input.replaceAll("'", "");
		input = input.replaceAll("\"", "");
		return input;
	}
}
