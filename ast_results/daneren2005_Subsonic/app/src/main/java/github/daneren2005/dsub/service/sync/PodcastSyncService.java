// isComment
package github.daneren2005.dsub.service.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class isClassOrIsInterface extends Service {

    private static PodcastSyncAdapter isVariable;

    private static final Object isVariable = new Object();

    @Override
    public void isMethod() {
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new PodcastSyncAdapter(isMethod(), true);
            }
        }
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
