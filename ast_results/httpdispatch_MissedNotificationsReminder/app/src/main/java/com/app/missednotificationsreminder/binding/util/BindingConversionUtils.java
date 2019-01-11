// isComment
package com.app.missednotificationsreminder.binding.util;

import android.databinding.BindingConversion;
import android.view.View;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    @BindingConversion
    public static String isMethod(BindableString isParameter) {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @BindingConversion
    public static Boolean isMethod(BindableBoolean isParameter) {
        return isNameExpr == null ? true : isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @BindingConversion
    public static int isMethod(BindableBoolean isParameter) {
        return isMethod(isNameExpr == null ? null : isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    @BindingConversion
    public static int isMethod(Boolean isParameter) {
        return isNameExpr != null && isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
    }
}
