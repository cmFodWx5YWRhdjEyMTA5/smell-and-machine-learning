// isComment
package com.dozuki.ifixit.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dozuki.ifixit.R;

public class isClassOrIsInterface extends BaseFragment {

    public static String isVariable = "isStringConstant";

    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        Bundle isVariable = this.isMethod();
        String isVariable;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        return isNameExpr;
    }
}
