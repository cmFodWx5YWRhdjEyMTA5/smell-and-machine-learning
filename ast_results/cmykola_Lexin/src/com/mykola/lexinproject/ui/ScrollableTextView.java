// isComment
package com.mykola.lexinproject.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class isClassOrIsInterface extends TextView {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(CharSequence isParameter, BufferType isParameter) {
        try {
            super.isMethod(isIntegerConstant, isIntegerConstant);
            super.isMethod(isNameExpr, isNameExpr);
        } catch (IndexOutOfBoundsException isParameter) {
            if (isNameExpr instanceof SpannedString) {
                SpannableString isVariable = new SpannableString(isNameExpr);
                StyleSpan[] isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(), StyleSpan.class);
                for (StyleSpan isVariable : isNameExpr) isNameExpr.isMethod(isNameExpr);
                super.isMethod(isIntegerConstant, isIntegerConstant);
                super.isMethod(isNameExpr, isNameExpr);
            }
        }
    }
}
