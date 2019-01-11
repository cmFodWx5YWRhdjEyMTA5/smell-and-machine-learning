// isComment
package com.owncloud.android.syncadapter;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import com.owncloud.android.datamodel.FileDataStorageManager;
import com.owncloud.android.lib.common.OwnCloudAccount;
import com.owncloud.android.lib.common.OwnCloudClient;
import com.owncloud.android.lib.common.OwnCloudClientManagerFactory;
import com.owncloud.android.lib.common.accounts.AccountUtils.AccountNotFoundException;
import java.io.IOException;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    private AccountManager isVariable;

    private Account isVariable;

    private ContentProviderClient isVariable;

    private FileDataStorageManager isVariable;

    private OwnCloudClient isVariable;

    public isConstructor(Context isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
        this.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public isConstructor(Context isParameter, boolean isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public AccountManager isMethod() {
        return isNameExpr;
    }

    public void isMethod(AccountManager isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Account isMethod() {
        return isNameExpr;
    }

    public void isMethod(Account isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public ContentProviderClient isMethod() {
        return isNameExpr;
    }

    public void isMethod(ContentProviderClient isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(FileDataStorageManager isParameter) {
        isNameExpr = isNameExpr;
    }

    public FileDataStorageManager isMethod() {
        return isNameExpr;
    }

    protected void isMethod() throws OperationCanceledException, AuthenticatorException, IOException, AccountNotFoundException {
        OwnCloudAccount isVariable = new OwnCloudAccount(isNameExpr, isMethod());
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr, isMethod());
    }

    protected OwnCloudClient isMethod() {
        return isNameExpr;
    }
}
