// isComment
package au.id.micolous.metrodroid.transit.unknown;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.Card;
import au.id.micolous.metrodroid.card.desfire.DesfireApplication;
import au.id.micolous.metrodroid.card.desfire.DesfireCard;
import au.id.micolous.metrodroid.card.desfire.DesfireCardTransitFactory;
import au.id.micolous.metrodroid.card.desfire.files.DesfireFile;
import au.id.micolous.metrodroid.card.desfire.files.UnauthorizedDesfireFile;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.util.Utils;

public class isClassOrIsInterface extends UnauthorizedTransitData {

    public static final Creator<UnauthorizedDesfireTransitData> isVariable = new Creator<UnauthorizedDesfireTransitData>() {

        public UnauthorizedDesfireTransitData isMethod(Parcel isParameter) {
            return new UnauthorizedDesfireTransitData(isNameExpr);
        }

        public UnauthorizedDesfireTransitData[] isMethod(int isParameter) {
            return new UnauthorizedDesfireTransitData[isNameExpr];
        }
    };

    private final String isVariable;

    public isConstructor(DesfireCard isParameter) {
        isNameExpr = isMethod(isNameExpr);
    }

    private isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public static final DesfireCardTransitFactory isVariable = new DesfireCardTransitFactory() {

        @Override
        public boolean isMethod(int[] isParameter) {
            return true;
        }

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod();
        }

        /**
         * isComment
         */
        public boolean isMethod(@NonNull DesfireCard isParameter) {
            for (DesfireApplication isVariable : isNameExpr.isMethod()) {
                for (DesfireFile isVariable : isNameExpr.isMethod()) {
                    if (!(isNameExpr instanceof UnauthorizedDesfireFile)) {
                        // isComment
                        return true;
                    }
                }
            }
            // isComment
            return true;
        }

        @Override
        public TransitData isMethod(@NonNull DesfireCard isParameter) {
            return new UnauthorizedDesfireTransitData(isNameExpr);
        }

        @Override
        public TransitIdentity isMethod(@NonNull DesfireCard isParameter) {
            return new TransitIdentity(isMethod(isNameExpr), null);
        }
    };

    private static final List<Pair<Integer, String>> isVariable = new ArrayList<>();

    static {
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, "isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, "isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, "isStringConstant"));
    }

    private static String isMethod(DesfireCard isParameter) {
        for (Pair<Integer, String> isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) != null)
                return isNameExpr.isFieldAccessExpr;
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }
}
