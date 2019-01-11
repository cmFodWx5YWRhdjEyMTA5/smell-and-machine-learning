// isComment
package au.id.micolous.metrodroid.transit.chc_metrocard;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.GregorianCalendar;
import au.id.micolous.metrodroid.transit.erg.ErgTrip;
import au.id.micolous.metrodroid.transit.erg.record.ErgPurseRecord;

public class isClassOrIsInterface extends ErgTrip {

    public static final Parcelable.Creator<ChcMetrocardTrip> isVariable = new Parcelable.Creator<ChcMetrocardTrip>() {

        public ChcMetrocardTrip isMethod(Parcel isParameter) {
            return new ChcMetrocardTrip(isNameExpr);
        }

        public ChcMetrocardTrip[] isMethod(int isParameter) {
            return new ChcMetrocardTrip[isNameExpr];
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
