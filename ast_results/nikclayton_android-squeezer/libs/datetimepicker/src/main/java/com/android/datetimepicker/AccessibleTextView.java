// isComment
package com.android.datetimepicker;

import android.content.Context;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;

/**
 * isComment
 */
public class isClassOrIsInterface extends android.support.v7.widget.AppCompatTextView {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod(this, new AccessibilityDelegateCompat() {

            @Override
            public void isMethod(View isParameter, AccessibilityEvent isParameter) {
                super.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(Button.class.isMethod());
            }

            @Override
            public void isMethod(View isParameter, AccessibilityNodeInfoCompat isParameter) {
                super.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(Button.class.isMethod());
            }
        });
    }
}
