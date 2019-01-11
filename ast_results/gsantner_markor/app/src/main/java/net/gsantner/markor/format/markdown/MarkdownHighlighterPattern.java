// isComment
package net.gsantner.markor.format.markdown;

import java.util.regex.Pattern;

public enum MarkdownHighlighterPattern {

    BOLD(isNameExpr.isMethod("isStringConstant")),
    ITALICS(isNameExpr.isMethod("isStringConstant")),
    HEADER(isNameExpr.isMethod("isStringConstant")),
    LINK(isNameExpr.isMethod("isStringConstant")),
    LIST_UNORDERED(isNameExpr.isMethod("isStringConstant")),
    LIST_ORDERED(isNameExpr.isMethod("isStringConstant")),
    QUOTATION(isNameExpr.isMethod("isStringConstant")),
    STRIKETHROUGH(isNameExpr.isMethod("isStringConstant")),
    CODE(isNameExpr.isMethod("isStringConstant")),
    DOUBLESPACE_LINE_ENDING(isNameExpr.isMethod("isStringConstant"));

    public final Pattern isVariable;

    isConstructor(Pattern isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
