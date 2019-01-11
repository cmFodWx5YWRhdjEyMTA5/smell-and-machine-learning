// isComment
package org.mozilla.mozstumbler.service.stumblerthread.motiondetection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.support.v4.content.LocalBroadcastManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mozilla.mozstumbler.svclocator.ServiceConfig;
import org.mozilla.mozstumbler.svclocator.ServiceLocator;
import org.mozilla.mozstumbler.svclocator.services.log.ILogger;
import org.mozilla.mozstumbler.svclocator.services.log.LoggerUtil;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.robolectric.Robolectric.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = isIntegerConstant, shadows = { CustomSensorManager.class })
public class isClassOrIsInterface {

    ILogger isVariable;

    private static final String isVariable = isNameExpr.isMethod(SignificantMotionSensorTest.class);

    Intent isVariable = null;

    @Before
    public void isMethod() {
        ServiceConfig isVariable = new ServiceConfig();
        isNameExpr.isMethod(ILogger.class, isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = (ILogger) isNameExpr.isMethod().isMethod(ILogger.class);
    }

    @Test
    public void isMethod() {
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        LocalBroadcastManager isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        final BroadcastReceiver isVariable = new BroadcastReceiver() {

            @Override
            public void isMethod(Context isParameter, Intent isParameter) {
                isNameExpr = isNameExpr;
            }
        };
        isNameExpr.isMethod(isNameExpr, new IntentFilter(isNameExpr.isFieldAccessExpr));
        // isComment
        // isComment
        SensorManager isVariable = (SensorManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        CustomSensorManager isVariable = (CustomSensorManager) isMethod(isNameExpr);
        // isComment
        Context isVariable = isNameExpr.isFieldAccessExpr;
        SignificantMotionSensor isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
    }
}
