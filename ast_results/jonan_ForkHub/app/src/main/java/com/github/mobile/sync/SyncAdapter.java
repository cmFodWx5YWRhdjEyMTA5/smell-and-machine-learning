// isComment
package com.github.mobile.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.github.mobile.accounts.AccountScope;
import com.github.mobile.sync.SyncCampaign.Factory;
import com.google.inject.Inject;
import roboguice.inject.ContextScope;
import roboguice.inject.ContextSingleton;

/**
 * isComment
 */
@ContextSingleton
public class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    @Inject
    private ContextScope isVariable;

    @Inject
    private AccountScope isVariable;

    @Inject
    private Factory isVariable;

    private SyncCampaign isVariable = null;

    /**
     * isComment
     */
    @Inject
    public isConstructor(final Context isParameter) {
        super(isNameExpr, true);
    }

    @Override
    public void isMethod(final Account isParameter, final Bundle isParameter, final String isParameter, final ContentProviderClient isParameter, final SyncResult isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isMethod()));
        try {
            isNameExpr.isMethod(isMethod());
            try {
                isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
            } finally {
                isNameExpr.isMethod(isMethod());
            }
        } finally {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    private void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }
}
