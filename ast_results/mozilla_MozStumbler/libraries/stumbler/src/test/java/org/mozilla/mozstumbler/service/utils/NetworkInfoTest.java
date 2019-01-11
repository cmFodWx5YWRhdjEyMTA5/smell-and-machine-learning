// isComment
package org.mozilla.mozstumbler.service.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.robolectric.Robolectric.shadowOf;

@Config(emulateSdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    Context isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() {
        // isComment
        // isComment
        NetworkInfo isVariable = new NetworkInfo(isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        isMethod(isNameExpr.isMethod());
    }

    @Test
    @Config(shadows = { MyShadowConnectivityManager.class })
    public void isMethod() {
        NetworkInfo isVariable = new NetworkInfo(isNameExpr);
        ConnectivityManager isVariable = (ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        MyShadowConnectivityManager isVariable = (MyShadowConnectivityManager) isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isMethod(isNameExpr.isMethod());
    }
}
