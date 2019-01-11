// isComment
package org.sufficientlysecure.keychain.matcher;

import android.content.Context;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface {

    public static TypeSafeMatcher<View> isMethod(final int isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public boolean isMethod(View isParameter) {
                Context isVariable = isNameExpr.isMethod();
                if (isNameExpr instanceof EditText) {
                    CharSequence isVariable = ((EditText) isNameExpr).isMethod();
                    return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                }
                return true;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
            }
        };
    }

    public static TypeSafeMatcher<View> isMethod(final Class<? extends TransformationMethod> isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public boolean isMethod(View isParameter) {
                if (isNameExpr instanceof EditText) {
                    TransformationMethod isVariable = ((EditText) isNameExpr).isMethod();
                    return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
                }
                return true;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
            }
        };
    }
}
