// isComment
package com.android.calendar;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public class isClassOrIsInterface extends BackupAgentHelper {

    static final String isVariable = "isStringConstant";

    @Override
    public void isMethod() {
        isMethod(isNameExpr, new SharedPreferencesBackupHelper(this, isNameExpr.isFieldAccessExpr));
    }

    @Override
    public void isMethod(BackupDataInput isParameter, int isParameter, ParcelFileDescriptor isParameter) throws IOException {
        // isComment
        final Editor isVariable = isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
