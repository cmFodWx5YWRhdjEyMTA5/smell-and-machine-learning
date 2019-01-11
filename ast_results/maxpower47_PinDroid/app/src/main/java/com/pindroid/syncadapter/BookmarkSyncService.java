// isComment
package com.pindroid.syncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * isComment
 */
public class isClassOrIsInterface extends Service {

    private static final Object isVariable = new Object();

    private static BookmarkSyncAdapter isVariable = null;

    /*isComment*/
    @Override
    public void isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new BookmarkSyncAdapter(isMethod(), true);
            }
        }
    }

    /*isComment*/
    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
