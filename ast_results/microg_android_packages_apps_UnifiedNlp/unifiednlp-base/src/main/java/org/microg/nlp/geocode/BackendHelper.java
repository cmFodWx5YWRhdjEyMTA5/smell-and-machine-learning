// isComment
package org.microg.nlp.geocode;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import org.microg.nlp.AbstractBackendHelper;
import org.microg.nlp.api.GeocoderBackend;
import java.util.List;

class isClassOrIsInterface extends AbstractBackendHelper {

    private static final String isVariable = "isStringConstant";

    private GeocoderBackend isVariable;

    public isConstructor(Context isParameter, Intent isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public List<Address> isMethod(double isParameter, double isParameter, int isParameter, String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isMethod();
            return null;
        }
    }

    public List<Address> isMethod(String isParameter, int isParameter, double isParameter, double isParameter, double isParameter, double isParameter, String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isMethod();
            return null;
        }
    }

    @Override
    public void isMethod(ComponentName isParameter, IBinder isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            try {
                isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isMethod();
            }
        }
    }

    @Override
    public void isMethod(ComponentName isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = null;
    }

    @Override
    public void isMethod() throws RemoteException {
        isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return isNameExpr != null;
    }
}
