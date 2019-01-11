// isComment
package org.mozilla.mozstumbler.client.subactivities;

import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mozilla.mozstumbler.R;
import org.mozilla.mozstumbler.svclocator.ServiceLocator;
import org.mozilla.mozstumbler.svclocator.services.log.ILogger;
import org.mozilla.mozstumbler.svclocator.services.log.LoggerUtil;
import org.mozilla.mozstumbler.svclocator.services.log.UnittestLogger;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.robolectric.bytecode.ShadowWrangler.shadowOf;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@Config(emulateSdk = isIntegerConstant, shadows = { FirstRunDialogFragmentShadow.class })
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private static ILogger isVariable = (ILogger) isNameExpr.isMethod().isMethod(ILogger.class);

    private static final String isVariable = isNameExpr.isMethod(FirstRunFragmentTest.class);

    @Before
    public void isMethod() {
        isNameExpr.isMethod().isMethod(ILogger.class, new UnittestLogger());
    }

    @Test
    public void isMethod() {
        FirstRunFragment isVariable = new FirstRunFragment();
        isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr);
        isMethod(null).isMethod(isNameExpr).isMethod();
        Button isVariable = (Button) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FirstRunDialogFragmentShadow isVariable = (FirstRunDialogFragmentShadow) isMethod(isNameExpr);
        isNameExpr.isMethod(true);
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        isNameExpr.isMethod();
    }
}
