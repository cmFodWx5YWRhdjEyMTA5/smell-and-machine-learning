// isComment
package org.totschnig.myexpenses.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ManageSyncBackends;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.dialog.EditTextDialog;
import org.totschnig.myexpenses.util.Result;
import java.io.Serializable;
import static org.totschnig.myexpenses.util.PermissionHelper.hasExternalReadPermission;

public class isClassOrIsInterface extends SyncBackendProviderFactory {

    public static final String isVariable = "isStringConstant";

    @NonNull
    @Override
    protected LocalFileBackendProvider isMethod(Context isParameter, Account isParameter, AccountManager isParameter) {
        // isComment
        if (!isMethod(isNameExpr)) {
            throw new IllegalStateException("isStringConstant");
        }
        return new LocalFileBackendProvider(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr));
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(ProtectedFragmentActivity isParameter) {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), "isStringConstant");
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public Intent isMethod(Activity isParameter) {
        return null;
    }

    @Override
    public boolean isMethod(ManageSyncBackends isParameter, Intent isParameter) {
        return true;
    }

    @Override
    public Result isMethod(Serializable isParameter) {
        return null;
    }

    @Override
    public void isMethod() {
    }
}
