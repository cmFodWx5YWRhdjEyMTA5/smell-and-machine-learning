// isComment
package org.tint.ui.preferences;

import org.tint.R;
import org.tint.utils.ApplicationUtils;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;

public class isClassOrIsInterface extends DialogPreference {

    private WebView isVariable;

    private String isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    protected View isMethod() {
        LayoutInflater isVariable = (LayoutInflater) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
    }

    @Override
    protected void isMethod(View isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", null);
    }

    @Override
    protected void isMethod(Builder isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(null, null);
    }

    private void isMethod(AttributeSet isParameter) {
        if (isNameExpr != null) {
            TypedArray isVariable = isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, -isIntegerConstant);
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr);
            } else {
                isNameExpr = "isStringConstant";
            }
            isNameExpr.isMethod();
        }
    }
}
