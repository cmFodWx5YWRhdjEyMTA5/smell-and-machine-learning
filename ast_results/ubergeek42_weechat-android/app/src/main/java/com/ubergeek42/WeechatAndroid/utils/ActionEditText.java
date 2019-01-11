// isComment
package com.ubergeek42.WeechatAndroid.utils;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class isClassOrIsInterface extends AppCompatEditText {

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
    public InputConnection isMethod(EditorInfo isParameter) {
        InputConnection isVariable = super.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr &= ~isNameExpr.isFieldAccessExpr;
        return isNameExpr;
    }
}
