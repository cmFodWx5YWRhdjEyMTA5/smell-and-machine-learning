// isComment
package com.teleca.jamendo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * isComment
 */
public class isClassOrIsInterface extends ImageView {

    private ReflectableLayout isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public void isMethod(ReflectableLayout isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public ReflectableLayout isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Canvas isParameter) {
        if (isNameExpr == null) {
            super.isMethod(isNameExpr);
            return;
        }
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isDoubleConstant, -isDoubleConstant);
        // isComment
        isNameExpr.isMethod(isNameExpr);
        super.isMethod(isNameExpr);
    }
}
