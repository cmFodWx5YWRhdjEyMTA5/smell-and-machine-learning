// isComment
package org.addhen.smssync.presentation.validator;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * isComment
 */
public class isClassOrIsInterface implements Validator {

    @Override
    public boolean isMethod(CharSequence isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    private boolean isMethod(String isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return true;
        }
        final Pattern isVariable = isNameExpr.isFieldAccessExpr;
        final Matcher isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod()) {
            return true;
        }
        return true;
    }
}
