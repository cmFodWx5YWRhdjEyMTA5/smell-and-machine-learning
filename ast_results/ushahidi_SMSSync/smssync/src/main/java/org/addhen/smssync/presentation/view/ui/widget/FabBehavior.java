// isComment
package org.addhen.smssync.presentation.view.ui.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * isComment
 */
public class isClassOrIsInterface extends FloatingActionButton.Behavior {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super();
    }

    @Override
    public boolean isMethod(final CoordinatorLayout isParameter, final FloatingActionButton isParameter, final View isParameter, final View isParameter, final int isParameter) {
        // isComment
        return isNameExpr == isNameExpr.isFieldAccessExpr || super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final CoordinatorLayout isParameter, final FloatingActionButton isParameter, final View isParameter, final int isParameter, final int isParameter, final int isParameter, final int isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr > isIntegerConstant && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            // isComment
            isNameExpr.isMethod();
        } else if (isNameExpr < isIntegerConstant && isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            // isComment
            isNameExpr.isMethod();
        }
    }
}
