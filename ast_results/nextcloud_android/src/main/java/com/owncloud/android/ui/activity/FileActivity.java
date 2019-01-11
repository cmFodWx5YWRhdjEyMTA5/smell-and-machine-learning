// isComment
package com.owncloud.android.ui.activity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.owncloud.android.MainApp;
import com.owncloud.android.R;
import com.owncloud.android.authentication.AuthenticatorActivity;
import com.owncloud.android.datamodel.ArbitraryDataProvider;
import com.owncloud.android.datamodel.OCFile;
import com.owncloud.android.files.services.FileDownloader;
import com.owncloud.android.files.services.FileDownloader.FileDownloaderBinder;
import com.owncloud.android.files.services.FileUploader;
import com.owncloud.android.files.services.FileUploader.FileUploaderBinder;
import com.owncloud.android.lib.common.OwnCloudAccount;
import com.owncloud.android.lib.common.OwnCloudClient;
import com.owncloud.android.lib.common.OwnCloudClientManagerFactory;
import com.owncloud.android.lib.common.OwnCloudCredentials;
import com.owncloud.android.lib.common.network.CertificateCombinedException;
import com.owncloud.android.lib.common.operations.OnRemoteOperationListener;
import com.owncloud.android.lib.common.operations.RemoteOperation;
import com.owncloud.android.lib.common.operations.RemoteOperationResult;
import com.owncloud.android.lib.common.operations.RemoteOperationResult.ResultCode;
import com.owncloud.android.lib.common.utils.Log_OC;
import com.owncloud.android.operations.CreateShareWithShareeOperation;
import com.owncloud.android.operations.GetSharesForFileOperation;
import com.owncloud.android.operations.SynchronizeFileOperation;
import com.owncloud.android.operations.SynchronizeFolderOperation;
import com.owncloud.android.operations.UnshareOperation;
import com.owncloud.android.operations.UpdateSharePermissionsOperation;
import com.owncloud.android.operations.UpdateShareViaLinkOperation;
import com.owncloud.android.services.OperationsService;
import com.owncloud.android.services.OperationsService.OperationsServiceBinder;
import com.owncloud.android.ui.asynctasks.LoadingVersionNumberTask;
import com.owncloud.android.ui.dialog.ConfirmationDialogFragment;
import com.owncloud.android.ui.dialog.LoadingDialog;
import com.owncloud.android.ui.dialog.SslUntrustedCertDialog;
import com.owncloud.android.ui.helpers.FileOperationsHelper;
import com.owncloud.android.utils.DisplayUtils;
import com.owncloud.android.utils.ErrorMessageAdapter;
import com.owncloud.android.utils.FilesSyncHelper;
import com.owncloud.android.utils.ThemeUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends DrawerActivity implements OnRemoteOperationListener, ComponentsGetter, SslUntrustedCertDialog.OnSslUntrustedCertListener, LoadingVersionNumberTask.VersionDevInterface {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = FileActivity.class.isMethod();

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isNameExpr;

    protected static final long isVariable = isIntegerConstant;

    /*isComment*/
    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private OCFile isVariable;

    /**
     * isComment
     */
    private boolean isVariable;

    /**
     * isComment
     */
    private Handler isVariable;

    private FileOperationsHelper isVariable;

    private ServiceConnection isVariable;

    private OperationsServiceBinder isVariable;

    private boolean isVariable;

    protected FileDownloaderBinder isVariable;

    protected FileUploaderBinder isVariable;

    private ServiceConnection isVariable;

    private ServiceConnection isVariable;

    @Override
    public void isMethod(boolean isParameter) {
        // isComment
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = new Handler();
        isNameExpr = new FileOperationsHelper(this);
        Account isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isMethod(), isNameExpr.isMethod(isNameExpr), this);
        } else {
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, true);
        }
        isMethod(isNameExpr, isNameExpr != null);
        isNameExpr = new OperationsServiceConnection();
        isMethod(new Intent(this, OperationsService.class), isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = isMethod();
        if (isNameExpr != null) {
            isMethod(new Intent(this, FileDownloader.class), isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        isNameExpr = isMethod();
        if (isNameExpr != null) {
            isMethod(new Intent(this, FileUploader.class), isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod(true);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = true;
        if (isNameExpr != null) {
            isMethod();
        }
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
        isNameExpr = true;
        super.isMethod();
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isMethod(isNameExpr);
            isNameExpr = null;
        }
        if (isNameExpr != null) {
            isMethod(isNameExpr);
            isNameExpr = null;
        }
        if (isNameExpr != null) {
            isMethod(isNameExpr);
            isNameExpr = null;
        }
        super.isMethod();
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        if (isMethod() != null && isMethod().isMethod() != null) {
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr, isMethod().isMethod().isMethod());
        }
    }

    /**
     * isComment
     */
    public OCFile isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(OCFile isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return isNameExpr;
    }

    public OperationsServiceBinder isMethod() {
        return isNameExpr;
    }

    protected ServiceConnection isMethod() {
        return null;
    }

    public OnRemoteOperationListener isMethod() {
        return this;
    }

    public Handler isMethod() {
        return isNameExpr;
    }

    public FileOperationsHelper isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(RemoteOperation isParameter, RemoteOperationResult isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod();
        if (!isNameExpr.isMethod() && (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || (isNameExpr.isMethod() && isNameExpr.isMethod() instanceof AuthenticatorException))) {
            isMethod(this);
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr, isNameExpr, isMethod()));
            }
        } else if (!isNameExpr.isMethod() && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            isMethod(isNameExpr);
        } else if (isNameExpr == null || isNameExpr instanceof CreateShareWithShareeOperation || isNameExpr instanceof UnshareOperation || isNameExpr instanceof SynchronizeFolderOperation || isNameExpr instanceof UpdateShareViaLinkOperation || isNameExpr instanceof UpdateSharePermissionsOperation) {
            if (isNameExpr.isMethod()) {
                isMethod();
            } else if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr, isNameExpr, isMethod()));
            }
        } else if (isNameExpr instanceof SynchronizeFileOperation) {
            isMethod((SynchronizeFileOperation) isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof GetSharesForFileOperation) {
            if (isNameExpr.isMethod() || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isMethod();
            } else {
                isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr, isNameExpr, isMethod()));
            }
        }
    }

    /**
     * isComment
     */
    protected void isMethod(Context isParameter) {
        isMethod(isNameExpr, null);
    }

    /**
     * isComment
     */
    protected void isMethod(Context isParameter, Account isParameter) {
        try {
            // isComment
            if (isNameExpr == null) {
                isNameExpr = isMethod();
            }
            OwnCloudClient isVariable;
            OwnCloudAccount isVariable = new OwnCloudAccount(isNameExpr, isNameExpr);
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
            if (isNameExpr != null) {
                OwnCloudCredentials isVariable = isNameExpr.isMethod();
                if (isNameExpr != null) {
                    AccountManager isVariable = isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
                    } else {
                        isNameExpr.isMethod(isNameExpr);
                    }
                }
            }
            // isComment
            Intent isVariable = new Intent(this, AuthenticatorActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr, isNameExpr);
        } catch (com.owncloud.android.lib.common.accounts.AccountUtils.AccountNotFoundException isParameter) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    /**
     * isComment
     */
    public void isMethod(RemoteOperationResult isParameter) {
        // isComment
        FragmentManager isVariable = isMethod();
        SslUntrustedCertDialog isVariable = (SslUntrustedCertDialog) isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod((CertificateCombinedException) isNameExpr.isMethod());
            FragmentTransaction isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    private void isMethod(SynchronizeFileOperation isParameter, RemoteOperationResult isParameter) {
        OCFile isVariable = isNameExpr.isMethod();
        if (!isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                Intent isVariable = new Intent(this, ConflictsResolveActivity.class);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
                isMethod(isNameExpr);
            }
        } else {
            if (!isNameExpr.isMethod()) {
                isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr, isNameExpr, isMethod()));
            }
            isMethod();
        }
    }

    protected void isMethod() {
        OCFile isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr = isMethod().isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        // isComment
        isMethod();
        // isComment
        Fragment isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            LoadingDialog isVariable = isNameExpr.isMethod(isNameExpr);
            FragmentManager isVariable = isMethod();
            FragmentTransaction isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    public void isMethod() {
        Fragment isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            LoadingDialog isVariable = (LoadingDialog) isNameExpr;
            isNameExpr.isMethod();
        }
    }

    private void isMethod() {
        isNameExpr.isMethod(this, isNameExpr);
        long isVariable = isNameExpr.isMethod();
        if (isNameExpr <= isNameExpr.isFieldAccessExpr) {
            boolean isVariable = isNameExpr.isMethod((int) isNameExpr, this);
            if (!isNameExpr) {
                isMethod();
            }
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface implements ServiceConnection {

        @Override
        public void isMethod(ComponentName isParameter, IBinder isParameter) {
            if (isNameExpr.isMethod(new ComponentName(isNameExpr.this, OperationsService.class))) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                isNameExpr = (OperationsServiceBinder) isNameExpr;
                /*isComment*/
                if (isNameExpr) {
                    isMethod();
                }
            } else {
                return;
            }
        }

        @Override
        public void isMethod(ComponentName isParameter) {
            if (isNameExpr.isMethod(new ComponentName(isNameExpr.this, OperationsService.class))) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                isNameExpr = null;
            // isComment
            }
        }
    }

    @Override
    public FileDownloaderBinder isMethod() {
        return isNameExpr;
    }

    @Override
    public FileUploaderBinder isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        Intent isVariable = new Intent(this, FileDisplayActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod(true);
    }

    protected OCFile isMethod() {
        OCFile isVariable = isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isMethod()) {
                return isNameExpr;
            } else if (isMethod() != null) {
                String isVariable = isNameExpr.isMethod();
                return isMethod().isMethod(isNameExpr);
            }
        }
        return null;
    }

    /*isComment*/
    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    public void isMethod() {
        ConfirmationDialogFragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new String[] {}, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, -isIntegerConstant, -isIntegerConstant);
        isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    @Override
    public void isMethod() {
    // isComment
    }

    public void isMethod(View isParameter, Context isParameter) {
        if (isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
            ArbitraryDataProvider isVariable = new ArbitraryDataProvider(isMethod());
            int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            if (isNameExpr > isIntegerConstant || isNameExpr == -isIntegerConstant) {
                isMethod(this, isNameExpr);
            }
        }
    }

    @Override
    public void isMethod(Integer isParameter) {
        isMethod(this, isNameExpr, true);
    }

    public static void isMethod(LoadingVersionNumberTask.VersionDevInterface isParameter, Context isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        LoadingVersionNumberTask isVariable = new LoadingVersionNumberTask(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static void isMethod(Activity isParameter, Integer isParameter, boolean isParameter) {
        Integer isVariable = -isIntegerConstant;
        try {
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isIntegerConstant).isFieldAccessExpr;
        } catch (PackageManager.NameNotFoundException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
        }
        if (isNameExpr == -isIntegerConstant || isNameExpr == -isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr > isNameExpr) {
            if (isNameExpr) {
                String isVariable = (String) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr + "isStringConstant";
                Uri isVariable = isNameExpr.isMethod(isNameExpr);
                Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isParameter -> {
                    String isVariable = (String) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr + "isStringConstant";
                    Uri isVariable = isNameExpr.isMethod(isNameExpr);
                    Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }).isMethod();
            }
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
    }
}
