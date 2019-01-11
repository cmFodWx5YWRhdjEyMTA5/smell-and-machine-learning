// isComment
package org.voidsink.anewjkuapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.voidsink.anewjkuapp.KusssCalendarSyncAdapter;

public class isClassOrIsInterface extends Service {

    // isComment
    private static KusssCalendarSyncAdapter isVariable = null;

    // isComment
    private static final Object isVariable = new Object();

    /*isComment*/
    @Override
    public void isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new KusssCalendarSyncAdapter(isMethod(), true);
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
