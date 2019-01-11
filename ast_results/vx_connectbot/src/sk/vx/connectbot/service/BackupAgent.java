// isComment
package sk.vx.connectbot.service;

import java.io.IOException;
import sk.vx.connectbot.util.HostDatabase;
import sk.vx.connectbot.util.PreferenceConstants;
import sk.vx.connectbot.util.PubkeyDatabase;
import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.os.ParcelFileDescriptor;
import android.util.Log;

/**
 * isComment
 */
public class isClassOrIsInterface extends BackupAgentHelper {

    @Override
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        SharedPreferencesBackupHelper isVariable = new SharedPreferencesBackupHelper(this, isMethod() + "isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        FileBackupHelper isVariable = new FileBackupHelper(this, "isStringConstant" + isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        FileBackupHelper isVariable = new FileBackupHelper(this, "isStringConstant" + isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public void isMethod(ParcelFileDescriptor isParameter, BackupDataOutput isParameter, ParcelFileDescriptor isParameter) throws IOException {
        synchronized (isNameExpr.isFieldAccessExpr) {
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    @Override
    public void isMethod(BackupDataInput isParameter, int isParameter, ParcelFileDescriptor isParameter) throws IOException {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        synchronized (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod("isStringConstant", "isStringConstant");
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
