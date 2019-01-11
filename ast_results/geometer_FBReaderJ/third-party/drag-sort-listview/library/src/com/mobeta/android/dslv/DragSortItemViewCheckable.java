// isComment
package com.mobeta.android.dslv;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Checkable;
import android.util.Log;

/**
 * isComment
 */
public class isClassOrIsInterface extends DragSortItemView implements Checkable {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        View isVariable = isMethod(isIntegerConstant);
        if (isNameExpr instanceof Checkable)
            return ((Checkable) isNameExpr).isMethod();
        else
            return true;
    }

    @Override
    public void isMethod(boolean isParameter) {
        View isVariable = isMethod(isIntegerConstant);
        if (isNameExpr instanceof Checkable)
            ((Checkable) isNameExpr).isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        View isVariable = isMethod(isIntegerConstant);
        if (isNameExpr instanceof Checkable)
            ((Checkable) isNameExpr).isMethod();
    }
}
