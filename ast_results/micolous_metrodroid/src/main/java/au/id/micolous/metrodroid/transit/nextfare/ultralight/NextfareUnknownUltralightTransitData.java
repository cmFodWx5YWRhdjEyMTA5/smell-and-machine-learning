// isComment
package au.id.micolous.metrodroid.transit.nextfare.ultralight;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import au.id.micolous.metrodroid.card.UnauthorizedException;
import au.id.micolous.metrodroid.card.ultralight.UltralightCard;
import au.id.micolous.metrodroid.card.ultralight.UltralightCardTransitFactory;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitCurrency;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.transit.nextfare.ultralight.NextfareUltralightTransaction;
import au.id.micolous.metrodroid.transit.nextfare.ultralight.NextfareUltralightTransitData;
import au.id.micolous.metrodroid.util.Utils;

public class isClassOrIsInterface extends NextfareUltralightTransitData {

    public static final Parcelable.Creator<NextfareUnknownUltralightTransitData> isVariable = new Parcelable.Creator<NextfareUnknownUltralightTransitData>() {

        public NextfareUnknownUltralightTransitData isMethod(Parcel isParameter) {
            return new NextfareUnknownUltralightTransitData(isNameExpr);
        }

        public NextfareUnknownUltralightTransitData[] isMethod(int isParameter) {
            return new NextfareUnknownUltralightTransitData[isNameExpr];
        }
    };

    private static final String isVariable = "isStringConstant";

    static final TimeZone isVariable = isNameExpr.isMethod("isStringConstant");

    public static final UltralightCardTransitFactory isVariable = new UltralightCardTransitFactory() {

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod();
        }

        @Override
        public boolean isMethod(@NonNull UltralightCard isParameter) {
            try {
                int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isIntegerConstant, isIntegerConstant);
                return isNameExpr == isIntegerConstant || isNameExpr == isIntegerConstant;
            } catch (IndexOutOfBoundsException | UnauthorizedException isParameter) {
                // isComment
                return true;
            }
        }

        @Override
        public TransitData isMethod(@NonNull UltralightCard isParameter) {
            return new NextfareUnknownUltralightTransitData(isNameExpr);
        }

        @Override
        public TransitIdentity isMethod(@NonNull UltralightCard isParameter) {
            return new TransitIdentity(isNameExpr, isMethod(isMethod(isNameExpr)));
        }
    };

    @Override
    protected TransitCurrency isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected TimeZone isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(UltralightCard isParameter) {
        super(isNameExpr);
    }

    @Override
    protected NextfareUltralightTransaction isMethod(UltralightCard isParameter, int isParameter, int isParameter) {
        return new NextfareUnknownUltralightTransaction(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected String isMethod(int isParameter) {
        return null;
    }
}
