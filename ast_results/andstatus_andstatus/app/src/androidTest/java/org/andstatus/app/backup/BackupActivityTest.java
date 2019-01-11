// isComment
package org.andstatus.app.backup;

import android.Manifest;
import android.support.test.rule.GrantPermissionRule;
import org.andstatus.app.context.ActivityTest;
import org.andstatus.app.data.DbUtils;
import org.junit.Rule;
import org.junit.Test;

public class isClassOrIsInterface extends ActivityTest<BackupActivity> {

    @Rule
    public GrantPermissionRule isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    @Override
    protected Class<BackupActivity> isMethod() {
        return BackupActivity.class;
    }

    @Test
    public void isMethod() throws InterruptedException {
        final String isVariable = "isStringConstant";
        isMethod();
        isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }
}
