// isComment
package org.osmdroid.util;

import java.util.HashMap;
import java.util.Map;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private static final long[] isVariable = new long[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };

    private long[] isVariable = isNameExpr;

    private final Map<String, Delay> isVariable = new HashMap<>();

    public void isMethod(final String isParameter) {
        Delay isVariable;
        synchronized (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr == null) {
            isNameExpr = new Delay(isNameExpr);
            synchronized (isNameExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        } else {
            isNameExpr.isMethod();
        }
    }

    public Delay isMethod(final String isParameter) {
        synchronized (isNameExpr) {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    public boolean isMethod(final String isParameter) {
        final Delay isVariable;
        synchronized (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public void isMethod() {
        synchronized (isNameExpr) {
            isNameExpr.isMethod();
        }
    }

    public void isMethod(final long[] isParameter) {
        isNameExpr = isNameExpr;
    }
}
