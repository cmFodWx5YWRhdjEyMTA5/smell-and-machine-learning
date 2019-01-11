// isComment
package au.id.micolous.metrodroid.transit.seq_go;

import android.os.Parcel;
import android.os.Parcelable;
import au.id.micolous.metrodroid.transit.nextfare.NextfareTrip;
import au.id.micolous.metrodroid.transit.nextfare.record.NextfareTopupRecord;
import au.id.micolous.metrodroid.util.Utils;
import au.id.micolous.farebot.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends NextfareTrip {

    public static final Parcelable.Creator<SeqGoRefill> isVariable = new Parcelable.Creator<SeqGoRefill>() {

        public SeqGoRefill isMethod(Parcel isParameter) {
            return new SeqGoRefill(isNameExpr);
        }

        public SeqGoRefill[] isMethod(int isParameter) {
            return new SeqGoRefill[isNameExpr];
        }
    };

    private boolean isVariable;

    public isConstructor(NextfareTopupRecord isParameter) {
        super(isNameExpr, "isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod() == isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public String isMethod(boolean isParameter) {
        return isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
