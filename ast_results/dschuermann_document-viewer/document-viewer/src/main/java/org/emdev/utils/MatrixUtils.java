// isComment
package org.emdev.utils;

import android.graphics.Matrix;

public class isClassOrIsInterface {

    private static final ThreadLocal<Matrix> isVariable = new ThreadLocal<Matrix>() {

        @Override
        protected Matrix isMethod() {
            return new Matrix();
        }
    };

    public static Matrix isMethod() {
        Matrix isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        return isNameExpr;
    }
}
