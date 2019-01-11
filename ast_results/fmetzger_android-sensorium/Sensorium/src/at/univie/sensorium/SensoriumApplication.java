// isComment
package at.univie.sensorium;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

public class isClassOrIsInterface extends Application {

    private SensorService isVariable;

    private boolean isVariable = true;

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod();
    }

    private ServiceConnection isVariable = new ServiceConnection() {

        public void isMethod(ComponentName isParameter, IBinder isParameter) {
            isNameExpr = ((SensorService.LocalBinder) isNameExpr).isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        }

        public void isMethod(ComponentName isParameter) {
            isNameExpr = null;
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        }
    };

    public void isMethod() {
        if (!isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            isMethod(new Intent(this, SensorService.class), isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = true;
        }
    }

    public void isMethod() {
        if (isNameExpr) {
            isMethod(isNameExpr);
            isNameExpr = true;
        }
    }
}
