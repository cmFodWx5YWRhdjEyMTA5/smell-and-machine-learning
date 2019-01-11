// isComment
package com.madgag.agit.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import roboguice.inject.ContextScope;

@Singleton
class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    private static final String isVariable = "isStringConstant";

    @Inject
    ContextScope isVariable;

    @Inject
    SyncCampaignFactory isVariable;

    private SyncCampaign isVariable = null;

    @Inject
    public isConstructor(Context isParameter) {
        super(isNameExpr, true);
    }

    @Override
    public void isMethod(Account isParameter, Bundle isParameter, String isParameter, ContentProviderClient isParameter, SyncResult isParameter) {
        isMethod();
        isNameExpr.isMethod(isMethod());
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        } finally {
            isNameExpr.isMethod(isMethod());
        }
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
