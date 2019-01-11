// isComment
package au.id.micolous.metrodroid.transit.smartrider;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import au.id.micolous.metrodroid.transit.Transaction;
import au.id.micolous.metrodroid.transit.TransactionTrip;
import au.id.micolous.metrodroid.transit.TransitCurrency;

class isClassOrIsInterface extends TransactionTrip {

    public isConstructor(Transaction isParameter) {
        super(isNameExpr);
    }

    protected isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Creator<SmartRiderTrip> isVariable = new Creator<SmartRiderTrip>() {

        @Override
        public SmartRiderTrip isMethod(Parcel isParameter) {
            return new SmartRiderTrip(isNameExpr);
        }

        @Override
        public SmartRiderTrip[] isMethod(int isParameter) {
            return new SmartRiderTrip[isNameExpr];
        }
    };

    @Nullable
    @Override
    public TransitCurrency isMethod() {
        int isVariable = isIntegerConstant;
        if (isNameExpr != null)
            isNameExpr += ((SmartRiderTagRecord) isNameExpr).isMethod();
        if (isNameExpr != null)
            isNameExpr += ((SmartRiderTagRecord) isNameExpr).isMethod();
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
