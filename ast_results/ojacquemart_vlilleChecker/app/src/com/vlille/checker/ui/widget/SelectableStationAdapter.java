// isComment
package com.vlille.checker.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vlille.checker.R;
import com.vlille.checker.model.Station;
import java.util.List;

public class isClassOrIsInterface extends ArrayAdapter<Station> {

    private List<Station> isVariable;

    public isConstructor(Context isParameter, int isParameter, List<Station> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(final int isParameter, View isParameter, final ViewGroup isParameter) {
        if (isNameExpr == null) {
            LayoutInflater isVariable = (LayoutInflater) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        }
        Station isVariable = isNameExpr.isMethod(isNameExpr);
        CheckBox isVariable = (CheckBox) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }
}
