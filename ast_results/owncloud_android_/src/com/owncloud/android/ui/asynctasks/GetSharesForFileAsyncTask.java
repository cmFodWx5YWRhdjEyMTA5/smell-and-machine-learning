// isComment
package com.owncloud.android.ui.asynctasks;

import android.accounts.Account;
import android.os.AsyncTask;
import android.util.Pair;
import com.owncloud.android.MainApp;
import com.owncloud.android.datamodel.FileDataStorageManager;
import com.owncloud.android.datamodel.OCFile;
import com.owncloud.android.lib.common.OwnCloudAccount;
import com.owncloud.android.lib.common.OwnCloudClient;
import com.owncloud.android.lib.common.OwnCloudClientManagerFactory;
import com.owncloud.android.lib.common.operations.OnRemoteOperationListener;
import com.owncloud.android.lib.common.operations.RemoteOperation;
import com.owncloud.android.lib.common.operations.RemoteOperationResult;
import com.owncloud.android.lib.common.utils.Log_OC;
import com.owncloud.android.operations.GetSharesForFileOperation;
import java.lang.ref.WeakReference;

/**
 * isComment
 */
public class isClassOrIsInterface extends AsyncTask<Object, Void, Pair<RemoteOperation, RemoteOperationResult>> {

    private final String isVariable = GetSharesForFileAsyncTask.class.isMethod();

    private final WeakReference<OnRemoteOperationListener> isVariable;

    public isConstructor(OnRemoteOperationListener isParameter) {
        isNameExpr = new WeakReference<>(isNameExpr);
    }

    @Override
    protected Pair<RemoteOperation, RemoteOperationResult> isMethod(Object... isParameter) {
        GetSharesForFileOperation isVariable = null;
        RemoteOperationResult isVariable = null;
        if (isNameExpr != null && isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            OCFile isVariable = (OCFile) isNameExpr[isIntegerConstant];
            Account isVariable = (Account) isNameExpr[isIntegerConstant];
            FileDataStorageManager isVariable = (FileDataStorageManager) isNameExpr[isIntegerConstant];
            try {
                // isComment
                isNameExpr = new GetSharesForFileOperation(isNameExpr.isMethod(), true, true);
                OwnCloudAccount isVariable = new OwnCloudAccount(isNameExpr, isNameExpr.isMethod());
                OwnCloudClient isVariable = isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod());
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            } catch (Exception isParameter) {
                isNameExpr = new RemoteOperationResult<>(isNameExpr);
                isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            }
        } else {
            isNameExpr = new RemoteOperationResult<>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return new Pair(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Pair<RemoteOperation, RemoteOperationResult> isParameter) {
        // isComment
        if (isNameExpr != null && !isMethod()) {
            OnRemoteOperationListener isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            }
        }
    }
}
