// isComment
package com.github.wdkapps.fillup;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public class isClassOrIsInterface extends Format {

    // isComment
    private static final long isVariable = isStringConstant;

    // isComment
    private Map<Long, String> isVariable = new HashMap<Long, String>();

    // isComment
    private boolean isVariable = true;

    /**
     * isComment
     */
    public void isMethod() {
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(Long isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public StringBuffer isMethod(Object isParameter, StringBuffer isParameter, FieldPosition isParameter) {
        String isVariable = null;
        if (isNameExpr instanceof Double) {
            Long isVariable = isNameExpr.isMethod((Double) isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            if (isNameExpr && !isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
            }
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public Object isMethod(String isParameter, ParsePosition isParameter) {
        throw new UnsupportedOperationException("isStringConstant");
    }

    /**
     * isComment
     */
    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
