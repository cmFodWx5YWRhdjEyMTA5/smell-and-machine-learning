// isComment
package com.health.openscale.core.bodymetric;

import com.health.openscale.core.datatypes.ScaleMeasurement;
import com.health.openscale.core.datatypes.ScaleUser;

public abstract class isClassOrIsInterface {

    // isComment
    public enum FORMULA {

        BF_DEURENBERG, BF_DEURENBERG_II, BF_EDDY, BF_GALLAGHER, BF_GALLAGHER_ASIAN
    }

    public static EstimatedFatMetric isMethod(FORMULA isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return new BFDeurenberg();
            case isNameExpr:
                return new BFDeurenbergII();
            case isNameExpr:
                return new BFEddy();
            case isNameExpr:
                return new BFGallagher();
            case isNameExpr:
                return new BFGallagherAsian();
        }
        return null;
    }

    public abstract String isMethod();

    public abstract float isMethod(ScaleUser isParameter, ScaleMeasurement isParameter);
}
