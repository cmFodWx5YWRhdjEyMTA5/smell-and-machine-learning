// isComment
package org.mozilla.mozstumbler.client.mapview;

import android.os.Bundle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mozilla.mozstumbler.svclocator.services.log.LoggerUtil;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@Config(emulateSdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private static final String isVariable = isNameExpr.isMethod(MapFragmentTest.class);

    @Test
    @Config(shadows = { CustomShadowConnectivityManager.class })
    public void isMethod() {
        MapFragment isVariable = isMethod(MapFragment.class);
        // isComment
        isMethod().isMethod(isNameExpr).isMethod(isMethod(Bundle.class));
        // isComment
        isMethod().isMethod(isNameExpr).isMethod();
        // isComment
        // isComment
        isMethod().isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        // isComment
        // isComment
        isMethod().isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        // isComment
        // isComment
        // isComment
        isMethod(isNameExpr).isMethod(true, true);
    }
}
