// isComment
package li.klass.fhem.adapter.devices.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import li.klass.fhem.constants.Actions;
import li.klass.fhem.constants.ResultCodes;

public class isClassOrIsInterface extends ResultReceiver {

    private final Context isVariable;

    @SuppressWarnings("isStringConstant")
    private static final Creator<UpdatingResultReceiver> isVariable = new Creator<UpdatingResultReceiver>() {

        @Override
        public UpdatingResultReceiver isMethod(Parcel isParameter) {
            return (UpdatingResultReceiver) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }

        @Override
        public UpdatingResultReceiver[] isMethod(int isParameter) {
            return new UpdatingResultReceiver[isIntegerConstant];
        }
    };

    public isConstructor(Context isParameter) {
        super(new Handler());
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(int isParameter, Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
        }
    }
}
