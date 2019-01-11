// isComment
package org.xbmc.kore.provider.mediaprovider;

import android.content.ContentResolver;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowContentResolver;
import org.xbmc.kore.BuildConfig;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.provider.MediaProvider;
import org.xbmc.kore.testutils.Database;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
@Ignore
public class isClassOrIsInterface {

    protected static HostInfo isVariable;

    protected static ShadowContentResolver isVariable;

    @Before
    public void isMethod() throws Exception {
        MediaProvider isVariable = new MediaProvider();
        ContentResolver isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
    }
}
