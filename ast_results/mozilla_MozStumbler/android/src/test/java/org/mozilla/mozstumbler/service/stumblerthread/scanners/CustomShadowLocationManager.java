// isComment
package org.mozilla.mozstumbler.service.stumblerthread.scanners;

import android.location.LocationListener;
import android.location.LocationManager;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowLocationManager;
import java.util.HashMap;
import java.util.LinkedList;

@Implements(LocationManager.class)
public class isClassOrIsInterface extends ShadowLocationManager {

    private HashMap<String, LinkedList<LocationListener>> isVariable = new HashMap<String, LinkedList<LocationListener>>();

    public void isMethod(String isParameter, long isParameter, float isParameter, LocationListener isParameter) {
        if (isNameExpr.isMethod(isNameExpr) == null) {
            isNameExpr.isMethod(isNameExpr, new LinkedList<LocationListener>());
        }
        LinkedList<LocationListener> isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Implementation
    public void isMethod(java.lang.String isParameter, boolean isParameter, boolean isParameter, boolean isParameter, boolean isParameter, boolean isParameter, boolean isParameter, boolean isParameter, int isParameter, int isParameter) {
    // isComment
    // isComment
    // isComment
    }

    @Implementation
    public void isMethod(java.lang.String isParameter, boolean isParameter) {
    // isComment
    // isComment
    // isComment
    }

    @Implementation
    public void isMethod(java.lang.String isParameter, android.location.Location isParameter) {
        // isComment
        if (isNameExpr.isMethod(isNameExpr) == null) {
            isNameExpr.isMethod(isNameExpr, new LinkedList<LocationListener>());
        }
        for (LocationListener isVariable : isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
