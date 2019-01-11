// isComment
package au.id.micolous.metrodroid.transit.yvr_compass;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.TimeZone;
import au.id.micolous.metrodroid.card.ultralight.UltralightCard;
import au.id.micolous.metrodroid.transit.Station;
import au.id.micolous.metrodroid.transit.Trip;
import au.id.micolous.metrodroid.transit.nextfare.ultralight.NextfareUltralightTransaction;
import au.id.micolous.metrodroid.util.StationTableReader;

public class isClassOrIsInterface extends NextfareUltralightTransaction implements Parcelable {

    public static final Parcelable.Creator<CompassUltralightTransaction> isVariable = new Parcelable.Creator<CompassUltralightTransaction>() {

        public CompassUltralightTransaction isMethod(Parcel isParameter) {
            return new CompassUltralightTransaction(isNameExpr);
        }

        public CompassUltralightTransaction[] isMethod(int isParameter) {
            return new CompassUltralightTransaction[isNameExpr];
        }
    };

    private static final String isVariable = "isStringConstant";

    isConstructor(UltralightCard isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public Station isMethod() {
        if (isNameExpr == isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected TimeZone isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    protected boolean isMethod() {
        return isNameExpr == isIntegerConstant || isNameExpr == isIntegerConstant;
    }

    public Trip.Mode isMethod() {
        if (isMethod())
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        if (isNameExpr == isIntegerConstant || isNameExpr == isIntegerConstant || isNameExpr == isIntegerConstant)
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        if (isNameExpr == isIntegerConstant)
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
