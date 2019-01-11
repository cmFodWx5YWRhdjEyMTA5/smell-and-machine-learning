// isComment
package au.id.micolous.metrodroid.transit.manly_fast_ferry;

import android.os.Parcel;
import android.os.Parcelable;
import au.id.micolous.metrodroid.transit.erg.ErgTrip;
import au.id.micolous.metrodroid.transit.erg.record.ErgPurseRecord;
import java.util.GregorianCalendar;

/**
 * isComment
 */
public class isClassOrIsInterface extends ErgTrip {

    public static final Parcelable.Creator<ManlyFastFerryTrip> isVariable = new Parcelable.Creator<ManlyFastFerryTrip>() {

        public ManlyFastFerryTrip isMethod(Parcel isParameter) {
            return new ManlyFastFerryTrip(isNameExpr);
        }

        public ManlyFastFerryTrip[] isMethod(int isParameter) {
            return new ManlyFastFerryTrip[isNameExpr];
        }
    };

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(ErgPurseRecord isParameter, GregorianCalendar isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public Mode isMethod() {
        // isComment
        return isNameExpr.isFieldAccessExpr;
    }
}
