// isComment
package io.github.hidroh.materialistic.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import io.github.hidroh.materialistic.AppUtils;

/**
 * isComment
 */
public class isClassOrIsInterface extends LinearLayoutManager {

    private final int isVariable;

    public isConstructor(Context isParameter, boolean isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr ? isNameExpr.isMethod(isNameExpr) : isIntegerConstant;
    }

    @Override
    public void isMethod(RecyclerView isParameter, RecyclerView.State isParameter, int isParameter) {
        RecyclerView.SmoothScroller isVariable = new LinearSmoothScroller(isNameExpr.isMethod()) {

            @Override
            public PointF isMethod(int isParameter) {
                return isNameExpr.this.isMethod(isNameExpr);
            }

            @Override
            protected int isMethod() {
                // isComment
                return isNameExpr;
            }
        };
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    protected int isMethod(RecyclerView.State isParameter) {
        return isNameExpr == isIntegerConstant ? super.isMethod(isNameExpr) : isNameExpr;
    }
}
