// isComment
package pl.narfsoftware.thermometer.ui.listeners;

import pl.narfsoftware.thermometer.ui.SensorsListViewAdapter;
import pl.narfsoftware.thermometer.utils.SensorRow;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.util.Log;

public class isClassOrIsInterface extends BaseUIListener {

    static final String isVariable = "isStringConstant";

    public isConstructor(Context isParameter, SensorsListViewAdapter isParameter, SensorRow isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(SensorEvent isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr[isIntegerConstant];
        isNameExpr = (isNameExpr.isMethod("isStringConstant", isNameExpr) + "isStringConstant");
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }
}
