// isComment
package net.osmand.plus.measurementtool.command;

import net.osmand.data.LatLon;
import net.osmand.plus.GPXUtilities.WptPt;
import net.osmand.plus.measurementtool.MeasurementToolLayer;

public class isClassOrIsInterface extends MeasurementModeCommand {

    private int isVariable;

    private WptPt isVariable;

    private boolean isVariable;

    public isConstructor(MeasurementToolLayer isParameter, boolean isParameter) {
        isMethod(isNameExpr, null, isNameExpr);
    }

    public isConstructor(MeasurementToolLayer isParameter, LatLon isParameter) {
        isMethod(isNameExpr, isNameExpr, true);
    }

    private void isMethod(MeasurementToolLayer isParameter, LatLon isParameter, boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null) {
            isNameExpr = new WptPt();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
        }
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod().isMethod();
    }

    @Override
    public boolean isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else if (isNameExpr) {
            isNameExpr = isNameExpr.isMethod();
        } else {
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr.isMethod();
        return isNameExpr != null;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod().isMethod(isNameExpr, true);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    MeasurementCommandType isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
