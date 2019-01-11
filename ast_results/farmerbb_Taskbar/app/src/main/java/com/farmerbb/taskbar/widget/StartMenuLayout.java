// isComment
package com.farmerbb.taskbar.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;

public class isClassOrIsInterface extends LinearLayout {

    private boolean isVariable = true;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod() {
        isNameExpr = true;
    }

    @Override
    public boolean isMethod(KeyEvent isParameter) {
        if (isNameExpr && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isMethod()).isMethod(new Intent("isStringConstant"));
            return true;
        }
        return super.isMethod(isNameExpr);
    }
}
