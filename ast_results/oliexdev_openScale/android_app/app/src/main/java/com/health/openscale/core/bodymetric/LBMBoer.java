// isComment
package com.health.openscale.core.bodymetric;

import android.content.Context;
import com.health.openscale.core.datatypes.ScaleMeasurement;
import com.health.openscale.core.datatypes.ScaleUser;

public class isClassOrIsInterface extends EstimatedLBMMetric {

    @Override
    public String isMethod(Context isParameter) {
        return "isStringConstant";
    }

    @Override
    public float isMethod(ScaleUser isParameter, ScaleMeasurement isParameter) {
        if (isNameExpr.isMethod().isMethod()) {
            return (isDoubleConstant * isNameExpr.isMethod()) + (isDoubleConstant * isNameExpr.isMethod()) - isDoubleConstant;
        }
        return (isDoubleConstant * isNameExpr.isMethod()) + (isDoubleConstant * isNameExpr.isMethod()) - isDoubleConstant;
    }
}
