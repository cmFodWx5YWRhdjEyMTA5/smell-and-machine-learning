// isComment
package org.sagemath.droid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.sagemath.droid.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends Fragment {

    private boolean isVariable;

    private ViewGroup isVariable;

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = true;
        this.isFieldAccessExpr = (ViewGroup) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = true;
        return isNameExpr;
    }

    protected ViewGroup isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        if (isNameExpr == isNameExpr) {
            return;
        }
        isNameExpr = isNameExpr;
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}
