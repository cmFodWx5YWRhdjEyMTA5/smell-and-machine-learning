// isComment
package au.id.micolous.metrodroid.transit.ventra;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.CardType;
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

    public static final Parcelable.Creator<VentraUltralightTransitData> isVariable = new Parcelable.Creator<VentraUltralightTransitData>() {

        public VentraUltralightTransitData isMethod(Parcel isParameter) {
            return new VentraUltralightTransitData(isNameExpr);
        }

        public VentraUltralightTransitData[] isMethod(int isParameter) {
            return new VentraUltralightTransitData[isNameExpr];
        }
    };

    public static final CardInfo isVariable = new CardInfo.Builder().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();

    private static final String isVariable = "isStringConstant";

    static final TimeZone isVariable = isNameExpr.isMethod("isStringConstant");

    public static final UltralightCardTransitFactory isVariable = new UltralightCardTransitFactory() {

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull UltralightCard isParameter) {
            try {
                int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isIntegerConstant, isIntegerConstant);
                if (isNameExpr != isIntegerConstant && isNameExpr != isIntegerConstant)
                    return true;
                byte[] isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod();
                if (isNameExpr[isIntegerConstant] != isIntegerConstant || ((isNameExpr[isIntegerConstant] & isIntegerConstant) == isIntegerConstant) || isNameExpr[isIntegerConstant] != isIntegerConstant)
                    return true;
                byte[] isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod();
                return isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant) == isIntegerConstant;
            } catch (IndexOutOfBoundsException | UnauthorizedException isParameter) {
                // isComment
                return true;
            }
        }

        @Override
        public TransitData isMethod(@NonNull UltralightCard isParameter) {
            return new VentraUltralightTransitData(isNameExpr);
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
        return new VentraUltralightTransaction(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected String isMethod(int isParameter) {
        return null;
    }
}
