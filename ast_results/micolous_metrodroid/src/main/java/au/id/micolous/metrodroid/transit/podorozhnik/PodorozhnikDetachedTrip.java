// isComment
package au.id.micolous.metrodroid.transit.podorozhnik;

import android.os.Parcel;
import android.support.annotation.Nullable;
import java.util.Calendar;
import au.id.micolous.metrodroid.transit.TransitCurrency;
import au.id.micolous.metrodroid.transit.Trip;

class isClassOrIsInterface extends Trip {

    private final int isVariable;

    public static final Creator<PodorozhnikDetachedTrip> isVariable = new Creator<PodorozhnikDetachedTrip>() {

        public PodorozhnikDetachedTrip isMethod(Parcel isParameter) {
            return new PodorozhnikDetachedTrip(isNameExpr);
        }

        public PodorozhnikDetachedTrip[] isMethod(int isParameter) {
            return new PodorozhnikDetachedTrip[isNameExpr];
        }
    };

    public isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Calendar isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Nullable
    @Override
    public TransitCurrency isMethod() {
        return null;
    }

    @Override
    public Mode isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }
}
