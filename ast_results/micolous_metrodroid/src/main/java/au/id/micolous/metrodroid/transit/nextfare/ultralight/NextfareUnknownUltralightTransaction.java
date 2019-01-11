// isComment
package au.id.micolous.metrodroid.transit.nextfare.ultralight;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import au.id.micolous.metrodroid.card.ultralight.UltralightCard;
import au.id.micolous.metrodroid.transit.Station;
import au.id.micolous.metrodroid.transit.Trip;

public class isClassOrIsInterface extends NextfareUltralightTransaction implements Parcelable {

    public static final Parcelable.Creator<NextfareUnknownUltralightTransaction> isVariable = new Parcelable.Creator<NextfareUnknownUltralightTransaction>() {

        public NextfareUnknownUltralightTransaction isMethod(Parcel isParameter) {
            return new NextfareUnknownUltralightTransaction(isNameExpr);
        }

        public NextfareUnknownUltralightTransaction[] isMethod(int isParameter) {
            return new NextfareUnknownUltralightTransaction[isNameExpr];
        }
    };

    isConstructor(UltralightCard isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @NonNull
    public List<String> isMethod() {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public Station isMethod() {
        if (isNameExpr == isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isNameExpr);
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
