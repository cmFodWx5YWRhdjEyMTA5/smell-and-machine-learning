// isComment
package de.markusfisch.android.shadereditor.fragment;

import de.markusfisch.android.shadereditor.app.ShaderEditorApp;
import de.markusfisch.android.shadereditor.adapter.ShaderSpinnerAdapter;
import de.markusfisch.android.shadereditor.database.Database;
import de.markusfisch.android.shadereditor.preference.Preferences;
import de.markusfisch.android.shadereditor.R;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.preference.ListPreferenceDialogFragmentCompat;

public class isClassOrIsInterface extends ListPreferenceDialogFragmentCompat {

    private ShaderSpinnerAdapter isVariable;

    public static ShaderListPreferenceDialogFragment isMethod(String isParameter) {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        ShaderListPreferenceDialogFragment isVariable = new ShaderListPreferenceDialogFragment();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod();
    }

    @Override
    public void isMethod(boolean isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(AlertDialog.Builder isParameter) {
        // isComment
        // isComment
        // isComment
        final String isVariable = isMethod().isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr = isMethod(isNameExpr);
        }
        isNameExpr = new ShaderSpinnerAdapter(isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant, new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                } else {
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                }
                isNameExpr.this.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod();
            }
        });
        isNameExpr.isMethod(null, null);
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(null);
            isNameExpr = null;
        }
    }

    private Cursor isMethod(Cursor isParameter) {
        MatrixCursor isVariable = null;
        try {
            isNameExpr = new MatrixCursor(new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr });
            isNameExpr.isMethod(new Object[] { isIntegerConstant, null, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null });
            return new MergeCursor(new Cursor[] { isNameExpr, isNameExpr });
        } finally {
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
        }
    }
}
