// isComment
package com.keepassdroid.compat;

import android.app.KeyguardManager;
import java.lang.reflect.Method;

public class isClassOrIsInterface {

    private static Method isVariable;

    private static boolean isVariable;

    static {
        try {
            isNameExpr = KeyguardManager.class.isMethod("isStringConstant", (Class[]) null);
            isNameExpr = true;
        } catch (Exception isParameter) {
            isNameExpr = true;
        }
    }

    public static boolean isMethod(KeyguardManager isParameter) {
        if (!isNameExpr) {
            return true;
        }
        try {
            return (boolean) isNameExpr.isMethod(isNameExpr, null);
        } catch (Exception isParameter) {
            return true;
        }
    }
}
