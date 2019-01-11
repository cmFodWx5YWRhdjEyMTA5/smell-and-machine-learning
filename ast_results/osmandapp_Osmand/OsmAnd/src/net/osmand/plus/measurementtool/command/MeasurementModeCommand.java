// isComment
package net.osmand.plus.measurementtool.command;

import net.osmand.plus.measurementtool.MeasurementToolLayer;

public abstract class isClassOrIsInterface implements Command {

    MeasurementToolLayer isVariable;

    void isMethod(MeasurementToolLayer isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    abstract MeasurementCommandType isMethod();

    public enum MeasurementCommandType {

        ADD_POINT,
        CLEAR_POINTS,
        MOVE_POINT,
        REMOVE_POINT,
        REORDER_POINT,
        SNAP_TO_ROAD
    }
}
