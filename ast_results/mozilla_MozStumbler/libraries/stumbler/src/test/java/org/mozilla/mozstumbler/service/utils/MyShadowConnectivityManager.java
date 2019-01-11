// isComment
package org.mozilla.mozstumbler.service.utils;

import android.net.ConnectivityManager;
import org.mockito.Mockito;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowConnectivityManager;
import static org.mockito.Mockito.when;

@Implements(ConnectivityManager.class)
public class isClassOrIsInterface extends ShadowConnectivityManager {

    private Boolean isVariable = true;

    @Implementation
    public android.net.NetworkInfo isMethod() {
        // isComment
        // isComment
        final android.net.NetworkInfo isVariable = isNameExpr.isMethod(android.net.NetworkInfo.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }
}
