// isComment
package com.ichi2.compat;

import android.annotation.TargetApi;
import android.text.Html;
import android.text.Spanned;

@TargetApi(isIntegerConstant)
public class isClassOrIsInterface extends CompatV23 implements Compat {

    public Spanned isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
