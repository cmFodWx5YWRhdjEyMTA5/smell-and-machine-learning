// isComment
package github.daneren2005.dsub.util;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import java.io.IOError;
import java.io.IOException;
import github.daneren2005.dsub.util.Constants;

public class isClassOrIsInterface extends BackupAgentHelper {

    @Override
    public void isMethod() {
        super.isMethod();
        SharedPreferencesBackupHelper isVariable = new SharedPreferencesBackupHelper(this, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Override
    public void isMethod(BackupDataInput isParameter, int isParameter, ParcelFileDescriptor isParameter) throws IOException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        SharedPreferences.Editor isVariable = isNameExpr.isMethod(this).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }
}
