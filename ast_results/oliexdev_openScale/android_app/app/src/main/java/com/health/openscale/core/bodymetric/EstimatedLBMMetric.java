// isComment
package com.health.openscale.core.bodymetric;

import android.content.Context;
import com.health.openscale.core.datatypes.ScaleMeasurement;
import com.health.openscale.core.datatypes.ScaleUser;

public abstract class isClassOrIsInterface {

    // isComment
    public enum FORMULA {

        LBW_HUME, LBW_BOER, LBW_WEIGHT_MINUS_FAT
    }

    public static EstimatedLBMMetric isMethod(FORMULA isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return new LBMHume();
            case isNameExpr:
                return new LBMBoer();
            case isNameExpr:
                return new LBMWeightMinusFat();
        }
        return null;
    }

    public abstract String isMethod(Context isParameter);

    public abstract float isMethod(ScaleUser isParameter, ScaleMeasurement isParameter);
}
