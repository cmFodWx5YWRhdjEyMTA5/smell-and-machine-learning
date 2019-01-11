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
    private final ArrayList<Collaboration> isVariable = new ArrayList<Collaboration>();

    /**
     * isComment
     */
    private Collaboration isVariable;

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter, final Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = new Collaboration();
        }
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = null;
        } else if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    public ArrayList<Collaboration> isMethod() {
        return isNameExpr;
    }
}
