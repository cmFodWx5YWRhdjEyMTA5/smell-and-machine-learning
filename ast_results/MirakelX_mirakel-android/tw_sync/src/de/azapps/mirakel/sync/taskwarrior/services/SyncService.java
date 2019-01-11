// isComment
package de.azapps.mirakel.sync.taskwarrior.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * isComment
 */
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
    public IBinder isMethod(final Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
