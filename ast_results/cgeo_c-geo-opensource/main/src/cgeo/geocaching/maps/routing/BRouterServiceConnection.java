// isComment
package cgeo.geocaching.maps.routing;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import btools.routingapp.IBRouterService;

public class isClassOrIsInterface implements ServiceConnection {

    private IBRouterService isVariable;

    @Override
    public void isMethod(final ComponentName isParameter, final IBinder isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final ComponentName isParameter) {
        isNameExpr = null;
    }

    public boolean isMethod() {
        return isNameExpr != null;
    }

    @Nullable
    public String isMethod(final Bundle isParameter) {
        if (!isMethod()) {
            return null;
        }
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (final RemoteException isParameter) {
            return null;
        }
    }
}
