// isComment
package org.mozilla.mozstumbler.service.stumblerthread.scanners;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLocationManager;
import static junit.framework.Assert.assertEquals;
import static org.robolectric.Robolectric.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(shadows = { CustomShadowLocationManager.class })
public class isClassOrIsInterface {

    private LocationActivity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(LocationActivity.class).isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        LocationManager isVariable = (LocationManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        ShadowLocationManager isVariable = isMethod(isNameExpr);
        LocationGenerator isVariable = new LocationGenerator();
        Location isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Location isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
    }

    private Location isMethod(String isParameter, double isParameter, double isParameter) {
        Location isVariable = new Location(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }
}
