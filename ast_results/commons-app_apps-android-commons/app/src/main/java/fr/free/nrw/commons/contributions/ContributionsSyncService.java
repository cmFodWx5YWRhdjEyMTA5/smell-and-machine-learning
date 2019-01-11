// isComment
package fr.free.nrw.commons.contributions;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class isClassOrIsInterface extends Service {

    private static final Object isVariable = new Object();

    private static ContributionsSyncAdapter isVariable = null;

    @Override
    public void isMethod() {
        super.isMethod();
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new ContributionsSyncAdapter(this, true);
            }
        }
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
