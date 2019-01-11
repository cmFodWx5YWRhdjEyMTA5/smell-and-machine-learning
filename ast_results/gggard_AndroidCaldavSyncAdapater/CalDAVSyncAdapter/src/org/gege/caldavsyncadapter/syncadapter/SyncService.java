// isComment
package org.gege.caldavsyncadapter.syncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class isClassOrIsInterface extends Service {

    private static final Object isVariable = new Object();

    private static SyncAdapter isVariable = null;

    @Override
    public void isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new SyncAdapter(isMethod(), true);
            }
        }
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
