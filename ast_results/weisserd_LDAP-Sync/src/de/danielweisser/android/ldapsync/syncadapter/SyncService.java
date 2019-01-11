// isComment
package de.danielweisser.android.ldapsync.syncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * isComment
 */
public class isClassOrIsInterface extends Service {

    private static final String isVariable = "isStringConstant";

    private static final Object isVariable = new Object();

    private static SyncAdapter isVariable = null;

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new SyncAdapter(isMethod(), true);
            }
        }
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        return isNameExpr.isMethod();
    }
}
