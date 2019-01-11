// isComment
package com.github.pockethub.android.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * isComment
 */
@Singleton
public class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    @Inject
    protected SyncCampaignFactory isVariable;

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
        isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }
}
