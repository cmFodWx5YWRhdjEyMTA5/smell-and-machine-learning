// isComment
package org.jf.Penroser;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

public class isClassOrIsInterface extends BackupAgentHelper {

    @Override
    public void isMethod() {
        isMethod("isStringConstant", new SharedPreferencesBackupHelper(this, "isStringConstant"));
    }
}
