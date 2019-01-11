// isComment
package org.mozilla.mozstumbler.service.stumblerthread.datahandling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mozilla.mozstumbler.client.ClientDataStorageManager;
import org.mozilla.mozstumbler.svclocator.ServiceLocator;
import org.mozilla.mozstumbler.svclocator.services.ISystemClock;
import org.mozilla.mozstumbler.svclocator.services.MockSystemClock;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.util.LinkedList;
import java.util.Properties;
import static junit.framework.Assert.assertEquals;

@Config(emulateSdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private class isClassOrIsInterface implements StorageIsEmptyTracker {

        public void isMethod(boolean isParameter) {
        }
    }

    private final BroadcastReceiver isVariable = new BroadcastReceiver() {

        @Override
        public void isMethod(Context isParameter, Intent isParameter) {
            // isComment
            isNameExpr.isMethod(isNameExpr);
        }
    };

    private LinkedList<Intent> isVariable = new LinkedList<Intent>();

    @Before
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = null;
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        Context isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, new IntentFilter(isNameExpr.isFieldAccessExpr));
        StorageTracker isVariable = new StorageTracker();
        long isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        MockSystemClock isVariable = new MockSystemClock();
        final long isVariable = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(ISystemClock.class, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        Intent isVariable = isNameExpr.isMethod(isIntegerConstant);
        Bundle isVariable = isNameExpr.isMethod();
        Properties isVariable = (Properties) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
    }
}
