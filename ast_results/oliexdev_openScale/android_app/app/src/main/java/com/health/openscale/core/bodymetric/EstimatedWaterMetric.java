// isComment
package com.health.openscale.core.bodymetric;

import com.health.openscale.core.datatypes.ScaleMeasurement;
import com.health.openscale.core.datatypes.ScaleUser;

public abstract class isClassOrIsInterface {

    // isComment
    public enum FORMULA {

        TBW_BEHNKE, TBW_DELWAIDECRENIER, TBW_HUMEWEYERS, TBW_LEESONGKIM
    }

    public static EstimatedWaterMetric isMethod(FORMULA isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return new TBWBehnke();
            case isNameExpr:
                return new TBWDelwaideCrenier();
            case isNameExpr:
                return new TBWHumeWeyers();
            case isNameExpr:
                return new TBWLeeSongKim();
        }
        return null;
    }

    public abstract String isMethod();

    public abstract float isMethod(ScaleUser isParameter, ScaleMeasurement isParameter);
}
