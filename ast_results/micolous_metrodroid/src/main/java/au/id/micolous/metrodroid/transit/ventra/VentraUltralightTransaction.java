// isComment
package au.id.micolous.metrodroid.transit.ventra;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.TimeZone;
import au.id.micolous.metrodroid.card.ultralight.UltralightCard;
import au.id.micolous.metrodroid.transit.Trip;
import au.id.micolous.metrodroid.transit.nextfare.ultralight.NextfareUltralightTransaction;

public class isClassOrIsInterface extends NextfareUltralightTransaction implements Parcelable {

    public static final Parcelable.Creator<VentraUltralightTransaction> isVariable = new Parcelable.Creator<VentraUltralightTransaction>() {

        public VentraUltralightTransaction isMethod(Parcel isParameter) {
            return new VentraUltralightTransaction(isNameExpr);
        }

        public VentraUltralightTransaction[] isMethod(int isParameter) {
            return new VentraUltralightTransaction[isNameExpr];
        }
    };

    isConstructor(UltralightCard isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    protected TimeZone isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    protected boolean isMethod() {
        return true;
    }

    public Trip.Mode isMethod() {
        if (isMethod())
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        if (isNameExpr == isIntegerConstant)
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
