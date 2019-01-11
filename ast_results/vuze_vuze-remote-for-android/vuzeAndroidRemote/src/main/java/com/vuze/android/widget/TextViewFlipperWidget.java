// isComment
package com.vuze.android.widget;

import com.vuze.android.util.TextViewFlipper;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * isComment
 */
public class isClassOrIsInterface extends TextView {

    private TextViewFlipper isVariable;

    private TextViewFlipper.FlipValidator isVariable;

    // isComment
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

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(TextViewFlipper.FlipValidator isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(CharSequence isParameter, BufferType isParameter) {
        if (isNameExpr) {
            isNameExpr = true;
            super.isMethod(isNameExpr, isNameExpr);
            return;
        }
        isNameExpr = true;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        }
        if (!isNameExpr.isMethod(this, isNameExpr, true, isNameExpr)) {
            isNameExpr = true;
        }
    }
}
