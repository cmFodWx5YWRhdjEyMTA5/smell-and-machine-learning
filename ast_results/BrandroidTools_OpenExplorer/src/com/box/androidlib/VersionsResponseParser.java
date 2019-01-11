// isComment
package com.box.androidlib;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultResponseParser {

    /**
     * isComment
     */
    private final ArrayList<Version> isVariable = new ArrayList<Version>();

    /**
     * isComment
     */
    private Version isVariable = null;

    @Override
    public void isMethod() throws SAXException {
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter, final Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = new Version();
        }
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr);
        } else if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            }
        }
    }

    /**
     * isComment
     */
    public ArrayList<Version> isMethod() {
        return isNameExpr;
    }
}
