// isComment
package au.id.micolous.metrodroid.transit.unknown;

import android.os.Parcel;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.Card;
import au.id.micolous.metrodroid.card.ultralight.UltralightCard;
import au.id.micolous.metrodroid.card.ultralight.UltralightCardTransitFactory;
import au.id.micolous.metrodroid.card.ultralight.UltralightPage;
import au.id.micolous.metrodroid.card.ultralight.UnauthorizedUltralightPage;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.util.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends UnauthorizedTransitData {

    public static final Creator<UnauthorizedUltralightTransitData> isVariable = new Creator<UnauthorizedUltralightTransitData>() {

        public UnauthorizedUltralightTransitData isMethod(Parcel isParameter) {
            return new UnauthorizedUltralightTransitData();
        }

        public UnauthorizedUltralightTransitData[] isMethod(int isParameter) {
            return new UnauthorizedUltralightTransitData[isNameExpr];
        }
    };

    public isConstructor() {
    }

    public static final UltralightCardTransitFactory isVariable = new UltralightCardTransitFactory() {

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod();
        }

        /**
         * isComment
         */
        @Override
        public boolean isMethod(@NonNull UltralightCard isParameter) {
            // isComment
            for (UltralightPage isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod() >= isIntegerConstant) {
                    // isComment
                    if (!(isNameExpr instanceof UnauthorizedUltralightPage)) {
                        // isComment
                        return true;
                    }
                }
            }
            return true;
        }

        @Override
        public TransitData isMethod(@NonNull UltralightCard isParameter) {
            return new UnauthorizedUltralightTransitData();
        }

        @Override
        public TransitIdentity isMethod(@NonNull UltralightCard isParameter) {
            return new TransitIdentity(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
        }
    };

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
