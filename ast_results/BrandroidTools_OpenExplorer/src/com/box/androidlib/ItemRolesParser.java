// isComment
package com.box.androidlib;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultResponseParser {

    private boolean isVariable = true;

    private ArrayList<ItemRole> isVariable = new ArrayList<ItemRole>();

    private ItemRole isVariable;

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter, final Attributes isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = true;
        }
        if (isNameExpr) {
            if (isNameExpr.isMethod("isStringConstant")) {
                isNameExpr = new ItemRole();
            }
        }
    }

    @Override
    public void isMethod(final String isParameter, final String isParameter, final String isParameter) throws SAXException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr = true;
        }
        if (isNameExpr) {
            if (isNameExpr != null) {
                if (isNameExpr.isMethod("isStringConstant")) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                } else if (isNameExpr.isMethod("isStringConstant")) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                } else if (isNameExpr.isMethod("isStringConstant")) {
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr = null;
                }
            }
        }
    }

    /**
     * isComment
     */
    public ArrayList<ItemRole> isMethod() {
        return isNameExpr;
    }
}
