// isComment
package com.xabber.android.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.xabber.android.R;
import com.xabber.android.data.SettingsManager;
import com.xabber.android.ui.preferences.DebugSettings;

public class isClassOrIsInterface extends DialogFragment implements DialogInterface.OnClickListener {

    public static DialogFragment isMethod() {
        return new CrashReportDialog();
    }

    @Override
    public Dialog isMethod(Bundle isParameter) {
        return new AlertDialog.Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, this).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, this).isMethod(true).isMethod();
    }

    @Override
    public void isMethod(DialogInterface isParameter, int isParameter) {
        isNameExpr.isMethod();
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod(new Intent(isMethod(), DebugSettings.class));
        }
    }
}
