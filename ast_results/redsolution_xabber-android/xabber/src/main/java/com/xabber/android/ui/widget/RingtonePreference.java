// isComment
package com.xabber.android.ui.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends android.preference.RingtonePreference {

    private Uri isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected Uri isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Uri isParameter) {
        isNameExpr = isNameExpr;
    }

    public Uri isMethod() {
        return isNameExpr;
    }

    public void isMethod(Uri isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
