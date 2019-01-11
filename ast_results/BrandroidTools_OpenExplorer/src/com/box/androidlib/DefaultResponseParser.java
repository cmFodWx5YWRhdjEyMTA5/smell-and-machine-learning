// isComment
package com.box.androidlib;

import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultHandler {

    /**
     * isComment
     */
    protected final Stack<String> isVariable = new Stack<String>();

    /**
     * isComment
     */
    protected String isVariable = "isStringConstant";

    /**
     * isComment
     */
    protected StringBuilder isVariable = new StringBuilder();

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(final String isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter, final Attributes isParameter) throws SAXException {
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter) throws SAXException {
        isNameExpr.isMethod();
        if (isNameExpr.isMethod("isStringConstant") && isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod().isMethod("isStringConstant")) {
            // isComment
            // isComment
            // isComment
            // isComment
            isNameExpr = isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod(final char[] isParameter, final int isParameter, final int isParameter) throws SAXException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
