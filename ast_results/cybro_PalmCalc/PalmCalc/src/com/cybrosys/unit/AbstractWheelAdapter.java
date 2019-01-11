// isComment
package com.cybrosys.unit;

import java.util.LinkedList;
import java.util.List;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements WheelViewAdapter {

    // isComment
    private List<DataSetObserver> isVariable;

    @Override
    public View isMethod(View isParameter, ViewGroup isParameter) {
        return null;
    }

    @Override
    public void isMethod(DataSetObserver isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new LinkedList<DataSetObserver>();
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(DataSetObserver isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    protected void isMethod() {
        if (isNameExpr != null) {
            for (DataSetObserver isVariable : isNameExpr) {
                isNameExpr.isMethod();
            }
        }
    }

    /**
     * isComment
     */
    protected void isMethod() {
        if (isNameExpr != null) {
            for (DataSetObserver isVariable : isNameExpr) {
                isNameExpr.isMethod();
            }
        }
    }
}
