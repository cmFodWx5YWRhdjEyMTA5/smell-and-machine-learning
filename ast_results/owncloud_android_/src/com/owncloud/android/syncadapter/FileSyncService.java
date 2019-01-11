// isComment
package com.owncloud.android.syncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * isComment
 */
public class isClassOrIsInterface extends Service {

    // isComment
    private static FileSyncAdapter isVariable = null;

    // isComment
    private static final Object isVariable = new Object();

    /*isComment*/
    @Override
    public void isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new FileSyncAdapter(isMethod(), true);
            }
        }
    }

    /*isComment*/
    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
