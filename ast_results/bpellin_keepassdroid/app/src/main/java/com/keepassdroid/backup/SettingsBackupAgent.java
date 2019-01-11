// isComment
package com.keepassdroid.backup;

import android.annotation.SuppressLint;
import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

@SuppressLint("isStringConstant")
public class isClassOrIsInterface extends BackupAgentHelper {

    private static final String isVariable = "isStringConstant";

    @Override
    public void isMethod() {
        String isVariable = this.isMethod() + "isStringConstant";
        SharedPreferencesBackupHelper isVariable = new SharedPreferencesBackupHelper(this, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }
}
