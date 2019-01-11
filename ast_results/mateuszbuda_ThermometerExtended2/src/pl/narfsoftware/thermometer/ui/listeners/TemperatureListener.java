// isComment
package pl.narfsoftware.thermometer.ui.listeners;

import pl.narfsoftware.thermometer.preferences.Preferences;
import pl.narfsoftware.thermometer.ui.SensorsListViewAdapter;
import pl.narfsoftware.thermometer.utils.Converter;
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
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr)
            isNameExpr = (isNameExpr.isMethod("isStringConstant", isNameExpr) + "isStringConstant" + (char) isIntegerConstant + "isStringConstant");
        else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr)
            isNameExpr = (isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr)) + "isStringConstant" + (char) isIntegerConstant + "isStringConstant");
        else
            isNameExpr = (isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr)) + "isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        super.isMethod(isNameExpr);
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
