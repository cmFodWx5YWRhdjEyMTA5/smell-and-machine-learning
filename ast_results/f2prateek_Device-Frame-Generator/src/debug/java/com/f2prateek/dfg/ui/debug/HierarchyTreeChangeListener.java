// isComment
package com.f2prateek.dfg.ui.debug;

import android.view.View;
import android.view.ViewGroup;

/**
 * isComment
 */
public final class isClassOrIsInterface implements ViewGroup.OnHierarchyChangeListener {

    /**
     * isComment
     */
    public static HierarchyTreeChangeListener isMethod(ViewGroup.OnHierarchyChangeListener isParameter) {
        return new HierarchyTreeChangeListener(isNameExpr);
    }

    private final ViewGroup.OnHierarchyChangeListener isVariable;

    private isConstructor(ViewGroup.OnHierarchyChangeListener isParameter) {
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(View isParameter, View isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr instanceof ViewGroup) {
            ViewGroup isVariable = (ViewGroup) isNameExpr;
            isNameExpr.isMethod(this);
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            }
        }
    }

    @Override
    public void isMethod(View isParameter, View isParameter) {
        if (isNameExpr instanceof ViewGroup) {
            ViewGroup isVariable = (ViewGroup) isNameExpr;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            }
            isNameExpr.isMethod(null);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
