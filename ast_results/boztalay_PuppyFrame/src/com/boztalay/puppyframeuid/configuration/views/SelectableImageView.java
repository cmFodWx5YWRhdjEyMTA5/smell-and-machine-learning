// isComment
package com.boztalay.puppyframeuid.configuration.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.boztalay.puppyframeuid.R;

public class isClassOrIsInterface extends ImageView {

    private boolean isVariable;

    public isConstructor(Context isParameter) {
        this(isNameExpr, null);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        this(isNameExpr, isNameExpr, isIntegerConstant);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = true;
    }

    public void isMethod() {
        isMethod(!isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr) {
            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else {
            isMethod(isIntegerConstant);
        }
    }
}
