// isComment
package org.wordpress.android.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import org.wordpress.android.R;

public class isClassOrIsInterface extends LinkMovementMethod {

    protected static WPLinkMovementMethod isVariable;

    public static WPLinkMovementMethod isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new WPLinkMovementMethod();
        }
        return isNameExpr;
    }

    @Override
    public boolean isMethod(TextView isParameter, Spannable isParameter, MotionEvent isParameter) {
        try {
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (ActivityNotFoundException isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            // isComment
            isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
            return true;
        }
    }

    private static String isMethod(Spannable isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        URLSpan[] isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(), URLSpan.class);
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            return null;
        }
        // isComment
        String isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant].isMethod());
        if (isNameExpr.isMethod(isNameExpr).isMethod() == null) {
            return "isStringConstant" + isNameExpr.isMethod();
        }
        return isNameExpr.isMethod();
    }

    private static void isMethod(Context isParameter, String isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        try {
            Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
            isNameExpr.isMethod(isNameExpr);
        } catch (ActivityNotFoundException isParameter) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }
}
