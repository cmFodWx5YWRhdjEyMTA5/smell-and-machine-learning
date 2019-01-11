// isComment
package au.id.micolous.metrodroid.transit.unknown;

import android.os.Parcel;
import android.support.annotation.NonNull;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.classic.ClassicCard;
import au.id.micolous.metrodroid.card.classic.ClassicCardTransitFactory;
import au.id.micolous.metrodroid.card.classic.ClassicSector;
import au.id.micolous.metrodroid.card.classic.UnauthorizedClassicSector;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.util.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends UnauthorizedTransitData {

    public static final Creator<UnauthorizedClassicTransitData> isVariable = new Creator<UnauthorizedClassicTransitData>() {

        public UnauthorizedClassicTransitData isMethod(Parcel isParameter) {
            return new UnauthorizedClassicTransitData();
        }

        public UnauthorizedClassicTransitData[] isMethod(int isParameter) {
            return new UnauthorizedClassicTransitData[isNameExpr];
        }
    };

    private isConstructor() {
    }

    public static final ClassicCardTransitFactory isVariable = new ClassicCardTransitFactory() {

        /**
         * isComment
         */
        @Override
        public boolean isMethod(@NonNull ClassicCard isParameter) {
            // isComment
            for (ClassicSector isVariable : isNameExpr.isMethod()) {
                if (!(isNameExpr instanceof UnauthorizedClassicSector)) {
                    // isComment
                    return true;
                }
            }
            return true;
        }

        @Override
        public TransitIdentity isMethod(@NonNull ClassicCard isParameter) {
            return new TransitIdentity(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null);
        }

        @Override
        public TransitData isMethod(@NonNull ClassicCard isParameter) {
            return new UnauthorizedClassicTransitData();
        }
    };

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
