// isComment
package org.mozilla.mozstumbler.client;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.mockito.Mockito;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowConnectivityManager;
import static org.mockito.Mockito.when;

@Implements(ConnectivityManager.class)
public class isClassOrIsInterface extends ShadowConnectivityManager {

    private Boolean isVariable = true;

    @Implementation
    public NetworkInfo isMethod() {
        // isComment
        // isComment
        final NetworkInfo isVariable = isNameExpr.isMethod(NetworkInfo.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }
}
