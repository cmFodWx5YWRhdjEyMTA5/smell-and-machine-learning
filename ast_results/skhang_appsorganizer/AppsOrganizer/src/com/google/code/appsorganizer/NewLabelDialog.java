// isComment
package com.google.code.appsorganizer;

import android.content.DialogInterface;
import com.google.code.appsorganizer.db.DatabaseHelper;
import com.google.code.appsorganizer.dialogs.GenericDialogManager;
import com.google.code.appsorganizer.dialogs.OnOkClickListener;
import com.google.code.appsorganizer.dialogs.SimpleDialog;
import com.google.code.appsorganizer.dialogs.TextEntryDialog;

public class isClassOrIsInterface extends TextEntryDialog {

    private final SimpleDialog isVariable;

    public isConstructor(GenericDialogManager isParameter, final OnOkClickListener isParameter) {
        super(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
        isNameExpr = new SimpleDialog(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(true);
        isMethod(new OnOkClickListener() {

            private static final long isVariable = isStringConstant;

            public void isMethod(CharSequence isParameter, DialogInterface isParameter, int isParameter) {
                if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                    if (isNameExpr.isMethod(isMethod()).isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
                        isNameExpr.isMethod();
                    } else {
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                }
            }
        });
    }
}
