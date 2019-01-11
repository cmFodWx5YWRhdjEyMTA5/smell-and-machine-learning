// isComment
package org.openintents.util;

import android.text.method.ReplacementTransformationMethod;

public class isClassOrIsInterface extends ReplacementTransformationMethod {

    private static char[] isVariable = new char[] { 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant' };

    private static char[] isVariable = new char[] { 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant' };

    private static UpperCaseTransformationMethod isVariable;

    public static UpperCaseTransformationMethod isMethod() {
        if (isNameExpr != null) {
            return isNameExpr;
        }
        isNameExpr = new UpperCaseTransformationMethod();
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected char[] isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected char[] isMethod() {
        return isNameExpr;
    }
}
