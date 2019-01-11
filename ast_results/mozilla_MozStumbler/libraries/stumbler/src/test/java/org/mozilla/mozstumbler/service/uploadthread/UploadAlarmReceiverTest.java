// isComment
package org.mozilla.mozstumbler.service.uploadthread;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mozilla.mozstumbler.service.utils.NetworkInfo;
import org.mozilla.mozstumbler.svclocator.ServiceLocator;
import org.mozilla.mozstumbler.svclocator.services.log.ILogger;
import org.mozilla.mozstumbler.svclocator.services.log.UnittestLogger;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowAlarmManager;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Before
    public void isMethod() {
        isNameExpr.isMethod().isMethod(ILogger.class, new UnittestLogger());
    }

    @Test
    public void isMethod() {
        // isComment
        // isComment
        // isComment
        Context isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr = isMethod(isNameExpr);
        UploadAlarmReceiver isVariable = new UploadAlarmReceiver();
        isNameExpr.isMethod(isNameExpr, null);
        ArgumentCaptor<Intent> isVariable = isNameExpr.isMethod(Intent.class);
        // isComment
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod());
        Intent isVariable = isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        // isComment
        // isComment
        // isComment
        UploadAlarmReceiver.UploadAlarmService isVariable = new UploadAlarmReceiver.UploadAlarmService();
        isNameExpr.isMethod(null);
    }

    @Test
    public void isMethod() {
        // isComment
        Context isVariable = isNameExpr.isFieldAccessExpr;
        // isComment
        NetworkInfo isVariable = isMethod(new NetworkInfo(isNameExpr));
        isMethod(true).isMethod(isNameExpr).isMethod();
        // isComment
        // isComment
        UploadAlarmReceiver.UploadAlarmService isVariable = new UploadAlarmReceiver.UploadAlarmService();
        // isComment
        isNameExpr = isMethod(isNameExpr);
        isNameExpr.isMethod(new Intent("isStringConstant"));
        // isComment
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
    }

    @Test
    public void isMethod() {
        Context isVariable = isNameExpr.isFieldAccessExpr;
        AlarmManager isVariable = (AlarmManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        ShadowAlarmManager isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        final int isVariable = isIntegerConstant;
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, true));
        ShadowAlarmManager.ScheduledAlarm isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr / isIntegerConstant, isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, true));
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr * isIntegerConstant, true));
    }
}
