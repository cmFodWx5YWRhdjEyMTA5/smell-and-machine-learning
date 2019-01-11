// isComment
package com.biglybt.android.widget;

import com.biglybt.android.util.TextViewFlipper;
import android.content.Context;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends android.support.v7.widget.AppCompatTextView {

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

    public void isMethod(TextViewFlipper.FlipValidator isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(CharSequence isParameter, BufferType isParameter) {
        if (isMethod()) {
            super.isMethod(isNameExpr, isNameExpr);
            return;
        }
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
