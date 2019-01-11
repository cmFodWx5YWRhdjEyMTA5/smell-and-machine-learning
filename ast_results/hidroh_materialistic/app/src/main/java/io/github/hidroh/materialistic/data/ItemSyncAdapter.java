// isComment
package io.github.hidroh.materialistic.data;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

/**
 * isComment
 */
class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    private final RestServiceFactory isVariable;

    private final ReadabilityClient isVariable;

    isConstructor(Context isParameter, RestServiceFactory isParameter, ReadabilityClient isParameter) {
        super(isNameExpr, true);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod(Account isParameter, Bundle isParameter, String isParameter, ContentProviderClient isParameter, SyncResult isParameter) {
        isMethod().isMethod(new SyncDelegate.Job(isNameExpr));
    }

    @VisibleForTesting
    @NonNull
    SyncDelegate isMethod() {
        return new SyncDelegate(isMethod(), isNameExpr, isNameExpr);
    }
}
