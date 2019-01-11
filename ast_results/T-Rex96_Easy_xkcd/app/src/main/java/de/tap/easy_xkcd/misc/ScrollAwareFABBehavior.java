// isComment
package de.tap.easy_xkcd.misc;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.core.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

public class isClassOrIsInterface extends FloatingActionButton.Behavior {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super();
    }

    @Override
    public boolean isMethod(CoordinatorLayout isParameter, FloatingActionButton isParameter, View isParameter, View isParameter, int isParameter) {
        return isNameExpr == isNameExpr.isFieldAccessExpr || super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(CoordinatorLayout isParameter, FloatingActionButton isParameter, View isParameter, int isParameter, int isParameter, int isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr > isIntegerConstant && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod();
        } else if (isNameExpr < isIntegerConstant && isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}
