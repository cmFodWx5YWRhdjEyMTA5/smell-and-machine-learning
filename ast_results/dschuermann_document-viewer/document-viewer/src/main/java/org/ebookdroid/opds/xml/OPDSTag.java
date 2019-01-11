// isComment
package org.ebookdroid.opds.xml;

import org.emdev.common.xml.tags.XmlTag;

public enum OPDSTag {

    /**
     * isComment
     */
    UNKNOWN("isStringConstant", isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    CONTENT("isStringConstant", isNameExpr.isFieldAccessExpr, true, true, "isStringConstant"),
    /**
     * isComment
     */
    LINK("isStringConstant", isNameExpr.isFieldAccessExpr, true, true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"),
    /**
     * isComment
     */
    ENTRY("isStringConstant", isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    ID("isStringConstant", isNameExpr.isFieldAccessExpr, true, true),
    /**
     * isComment
     */
    TITLE("isStringConstant", isNameExpr.isFieldAccessExpr, true, true);

    public final XmlTag isVariable;

    private isConstructor(final String isParameter, final byte isParameter, final boolean isParameter, final boolean isParameter, final String... isParameter) {
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
