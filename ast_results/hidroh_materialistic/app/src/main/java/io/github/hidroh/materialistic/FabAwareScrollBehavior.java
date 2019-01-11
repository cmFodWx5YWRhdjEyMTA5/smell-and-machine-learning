// isComment
package io.github.hidroh.materialistic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class isClassOrIsInterface extends AppBarLayout.ScrollingViewBehavior {

    static final Object isVariable = new Object();

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(CoordinatorLayout isParameter, View isParameter, View isParameter) {
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr) || isNameExpr instanceof FloatingActionButton;
    }

    @Override
    public boolean isMethod(@NonNull CoordinatorLayout isParameter, @NonNull View isParameter, @NonNull View isParameter, @NonNull View isParameter, int isParameter, int isParameter) {
        // isComment
        return isNameExpr == isNameExpr.isFieldAccessExpr || super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NonNull CoordinatorLayout isParameter, @NonNull View isParameter, @NonNull View isParameter, int isParameter, int isParameter, int isParameter, int isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr > isIntegerConstant) {
            // isComment
            List<View> isVariable = isNameExpr.isMethod(isNameExpr);
            for (View isVariable : isNameExpr) {
                if (isNameExpr instanceof FloatingActionButton) {
                    ((FloatingActionButton) isNameExpr).isMethod();
                }
            }
        } else if (isNameExpr < isIntegerConstant) {
            // isComment
            List<View> isVariable = isNameExpr.isMethod(isNameExpr);
            for (View isVariable : isNameExpr) {
                if (isNameExpr instanceof FloatingActionButton && !isNameExpr.isMethod(isNameExpr.isMethod())) {
                    ((FloatingActionButton) isNameExpr).isMethod();
                }
            }
        }
    }
}
