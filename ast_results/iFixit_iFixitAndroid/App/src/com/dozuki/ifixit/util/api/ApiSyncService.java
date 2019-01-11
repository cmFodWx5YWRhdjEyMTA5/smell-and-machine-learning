// isComment
package com.dozuki.ifixit.util.api;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * isComment
 */
public class isClassOrIsInterface extends Service {

    private static ApiSyncAdapter isVariable = null;

    private static final Object isVariable = new Object();

    @Override
    public void isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new ApiSyncAdapter(isMethod(), true);
            }
        }
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
