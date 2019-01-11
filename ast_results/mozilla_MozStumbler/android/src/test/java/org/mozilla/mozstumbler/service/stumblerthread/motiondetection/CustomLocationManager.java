// isComment
package org.mozilla.mozstumbler.service.stumblerthread.motiondetection;

import android.location.LocationManager;
import android.location.LocationProvider;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowLocationManager;

@Implements(LocationManager.class)
public class isClassOrIsInterface extends ShadowLocationManager {

    /*isComment*/
    @Implementation
    public LocationProvider isMethod(String isParameter) {
        return null;
    }
}
