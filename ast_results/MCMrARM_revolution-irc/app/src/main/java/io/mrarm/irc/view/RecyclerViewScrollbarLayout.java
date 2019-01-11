// isComment
package io.mrarm.irc.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class isClassOrIsInterface extends FrameLayout {

    private RecyclerViewScrollbar isVariable;

    private RecyclerView isVariable;

    public isConstructor(@NonNull Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull Context isParameter, @Nullable AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(@NonNull Context isParameter, @Nullable AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(View isParameter, int isParameter, ViewGroup.LayoutParams isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr instanceof RecyclerViewScrollbar) {
            isNameExpr = (RecyclerViewScrollbar) isNameExpr;
            FrameLayout.LayoutParams isVariable = (FrameLayout.LayoutParams) isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        } else if (isNameExpr instanceof RecyclerView) {
            isNameExpr = (RecyclerView) isNameExpr;
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
        }
    }
}
