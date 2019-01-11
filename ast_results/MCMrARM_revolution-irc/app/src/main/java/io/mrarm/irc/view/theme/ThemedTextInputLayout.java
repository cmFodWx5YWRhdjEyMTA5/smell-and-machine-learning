// isComment
package io.mrarm.irc.view.theme;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import io.mrarm.irc.util.ThemeHelper;

public class isClassOrIsInterface extends TextInputLayout {

    private static Field isVariable;

    private static Method isVariable;

    public isConstructor(Context isParameter) {
        this(isNameExpr, null);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        this(isNameExpr, isNameExpr, isIntegerConstant);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr.isMethod(isNameExpr))
            isMethod(this, isNameExpr.isMethod(isNameExpr));
    }

    // isComment
    public static void isMethod(TextInputLayout isParameter, int isParameter) {
        try {
            if (isNameExpr == null) {
                isNameExpr = TextInputLayout.class.isMethod("isStringConstant");
                isNameExpr.isMethod(true);
            }
            ColorStateList isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr == null) {
                isNameExpr = TextInputLayout.class.isMethod("isStringConstant", boolean.class);
                isNameExpr.isMethod(true);
            }
            isNameExpr.isMethod(isNameExpr, true);
        } catch (Throwable isParameter) {
        }
    }
}
