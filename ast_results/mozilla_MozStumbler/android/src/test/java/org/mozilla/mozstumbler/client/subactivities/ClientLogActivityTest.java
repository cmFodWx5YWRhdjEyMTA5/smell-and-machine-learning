// isComment
package org.mozilla.mozstumbler.client.subactivities;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mozilla.mozstumbler.svclocator.services.log.LoggerUtil;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowTextView;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mozilla.mozstumbler.client.subactivities.LogActivity.ConsoleView;

@Config(emulateSdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private static final String isVariable = isNameExpr.isMethod(ClientLogActivityTest.class);

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    @Config(shadows = { ShadowTextView.class })
    public void isMethod() {
        Context isVariable = isNameExpr.isFieldAccessExpr;
        ConsoleView isVariable = new ConsoleView(isNameExpr);
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(-isIntegerConstant);
        isMethod(-isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        isMethod(-isIntegerConstant, isNameExpr.isMethod());
    }
}
