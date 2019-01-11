// isComment
package com.dougkeen.bart.controls;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.dougkeen.bart.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends LinearLayoutCompat implements Checkable {

    private boolean isVariable;

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
    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
        int isVariable = isMethod() ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isMethod(!isMethod());
    }
}
