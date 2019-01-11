// isComment
package net.osmand.plus;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import net.osmand.plus.mapmarkers.MapMarkersDbHelper;
import net.osmand.plus.osmedit.OsmBugsDbHelper;
import java.io.IOException;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends BackupAgentHelper {

    @Override
    public void isMethod() {
        // isComment
        List<ApplicationMode> isVariable = isNameExpr.isMethod();
        String[] isVariable = new String[isNameExpr.isMethod() + isIntegerConstant];
        isNameExpr[isIntegerConstant] = isNameExpr.isMethod(null);
        int isVariable = isIntegerConstant;
        for (ApplicationMode isVariable : isNameExpr) {
            isNameExpr[isNameExpr++] = isNameExpr.isMethod(isNameExpr);
        }
        SharedPreferencesBackupHelper isVariable = new SharedPreferencesBackupHelper(this, isNameExpr);
        isMethod("isStringConstant", isNameExpr);
        FileBackupHelper isVariable = new FileBackupHelper(this, isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Override
    public void isMethod(BackupDataInput isParameter, int isParameter, ParcelFileDescriptor isParameter) throws IOException {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(null), isNameExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant).isMethod();
    }
}
