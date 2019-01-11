// isComment
package com.gh4a.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatImageView {

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

    public void isMethod(int isParameter) {
        isNameExpr = true;
        super.isMethod(isNameExpr);
        isNameExpr = true;
    }

    public void isMethod(Uri isParameter) {
        isNameExpr = true;
        super.isMethod(isNameExpr);
        isNameExpr = true;
    }

    public void isMethod(Drawable isParameter) {
        isNameExpr = true;
        super.isMethod(isNameExpr);
        isNameExpr = true;
    }

    public void isMethod() {
        if (!isNameExpr) {
            super.isMethod();
        }
    }
}
