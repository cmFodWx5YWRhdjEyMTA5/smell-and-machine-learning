// isComment
package org.voidsink.anewjkuapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.voidsink.anewjkuapp.KusssSyncAdapter;

public class isClassOrIsInterface extends Service {

    // isComment
    private static KusssSyncAdapter isVariable = null;

    // isComment
    private static final Object isVariable = new Object();

    /*isComment*/
    @Override
    public void isMethod() {
        /*isComment*/
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new KusssSyncAdapter(isMethod(), true);
            }
        }
    }

    /**
     * isComment
     */
    @Override
    public IBinder isMethod(Intent isParameter) {
        /*isComment*/
        return isNameExpr.isMethod();
    }
}
