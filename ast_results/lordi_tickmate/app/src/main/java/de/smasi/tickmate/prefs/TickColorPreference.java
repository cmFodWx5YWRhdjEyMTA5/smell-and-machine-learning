// isComment
package de.smasi.tickmate.prefs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import de.smasi.tickmate.R;
import de.smasi.tickmate.TickColor;
import de.smasi.tickmate.views.TickColorListAdapter;

public class isClassOrIsInterface extends EditTextPreference {

    private static final String isVariable = "isStringConstant";

    public void isMethod(TickColor isParameter) {
        isMethod(isNameExpr.isMethod(isMethod()));
        isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod()));
    }

    public int isMethod() {
        return isNameExpr.isMethod(isMethod(), isIntegerConstant);
    }

    @Override
    protected void isMethod(View isParameter) {
        super.isMethod(isNameExpr);
        GridView isVariable = (GridView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new TickColorListAdapter(isMethod()));
        isNameExpr.isMethod(new OnItemClickListener() {

            @Override
            public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
                isMethod(isNameExpr.isMethod(isNameExpr));
                isMethod().isMethod();
            }
        });
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
