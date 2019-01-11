// isComment
package com.box.androidlib;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultResponseParser {

    /**
     * isComment
     */
    private User isVariable;

    /**
     * isComment
     */
    private String isVariable;

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter, final Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = new User();
        }
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    public User isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }
}
