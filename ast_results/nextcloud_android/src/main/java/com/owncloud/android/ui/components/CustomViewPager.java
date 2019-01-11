// isComment
package com.owncloud.android.ui.components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class isClassOrIsInterface extends ViewPager {

    public isConstructor(@NonNull Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull Context isParameter, @Nullable AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @SuppressLint("isStringConstant")
    @Override
    public boolean isMethod(MotionEvent isParameter) {
        try {
            return super.isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
        // isComment
        }
        return true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        try {
            return super.isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
        // isComment
        }
        return true;
    }
}
