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
    private final ArrayList<Tag> isVariable = new ArrayList<Tag>();

    /**
     * isComment
     */
    private Tag isVariable;

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter, final Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = new Tag();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        }
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    public ArrayList<Tag> isMethod() {
        return isNameExpr;
    }
}
