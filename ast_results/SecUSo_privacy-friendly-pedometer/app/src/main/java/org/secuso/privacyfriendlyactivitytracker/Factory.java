// isComment
package org.secuso.privacyfriendlyactivitytracker;

import android.content.pm.PackageManager;
import org.secuso.privacyfriendlyactivitytracker.services.AbstractStepDetectorService;
import org.secuso.privacyfriendlyactivitytracker.services.AccelerometerStepDetectorService;
import org.secuso.privacyfriendlyactivitytracker.services.HardwareStepDetectorService;
import org.secuso.privacyfriendlyactivitytracker.utils.AndroidVersionHelper;

public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static Class<? extends AbstractStepDetectorService> isMethod(PackageManager isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
            return HardwareStepDetectorService.class;
        } else {
            return AccelerometerStepDetectorService.class;
        }
    }
}
