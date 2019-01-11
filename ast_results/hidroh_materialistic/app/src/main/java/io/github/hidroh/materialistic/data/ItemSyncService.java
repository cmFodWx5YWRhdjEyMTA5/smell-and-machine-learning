// isComment
package io.github.hidroh.materialistic.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import javax.inject.Inject;
import io.github.hidroh.materialistic.ActivityModule;
import io.github.hidroh.materialistic.Injectable;

public class isClassOrIsInterface extends Service {

    private static ItemSyncAdapter isVariable = null;

    private static final Object isVariable = new Object();

    @Inject
    RestServiceFactory isVariable;

    @Inject
    ReadabilityClient isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        ((Injectable) isMethod()).isMethod().isMethod(new ActivityModule(this)).isMethod(this);
        synchronized (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = new ItemSyncAdapter(isMethod(), isNameExpr, isNameExpr);
            }
        }
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        return isNameExpr.isMethod();
    }
}
