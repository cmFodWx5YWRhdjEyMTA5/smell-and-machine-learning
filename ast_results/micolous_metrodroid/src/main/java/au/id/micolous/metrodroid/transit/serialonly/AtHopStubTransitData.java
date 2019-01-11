// isComment
package au.id.micolous.metrodroid.transit.serialonly;

import android.os.Parcel;
import android.support.annotation.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import au.id.micolous.metrodroid.card.desfire.DesfireCard;
import au.id.micolous.metrodroid.card.desfire.DesfireCardTransitFactory;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.util.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends SerialOnlyTransitData {

    private static final int isVariable = isIntegerConstant;

    private final int isVariable;

    public isConstructor(DesfireCard isParameter) {
        isNameExpr = isMethod(isNameExpr);
    }

    protected isConstructor(Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public static final Creator<AtHopStubTransitData> isVariable = new Creator<AtHopStubTransitData>() {

        @Override
        public AtHopStubTransitData isMethod(Parcel isParameter) {
            return new AtHopStubTransitData(isNameExpr);
        }

        @Override
        public AtHopStubTransitData[] isMethod(int isParameter) {
            return new AtHopStubTransitData[isNameExpr];
        }
    };

    private static int isMethod(DesfireCard isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant).isMethod(), isIntegerConstant, isIntegerConstant);
    }

    private static String isMethod(int isParameter) {
        return "isStringConstant" + isNameExpr.isMethod(isNameExpr, "isStringConstant", isIntegerConstant, isIntegerConstant, isIntegerConstant);
    }

    private static final String isVariable = "isStringConstant";

    public static final DesfireCardTransitFactory isVariable = new DesfireCardTransitFactory() {

        @Override
        public boolean isMethod(int[] isParameter) {
            return isNameExpr.isMethod(isNameExpr, isIntegerConstant) && isNameExpr.isMethod(isNameExpr, isNameExpr);
        }

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod();
        }

        @Override
        public TransitData isMethod(@NonNull DesfireCard isParameter) {
            return new AtHopStubTransitData(isNameExpr);
        }

        @Override
        public TransitIdentity isMethod(@NonNull DesfireCard isParameter) {
            return new TransitIdentity(isNameExpr, isMethod(isMethod(isNameExpr)));
        }
    };

    @Override
    public String isMethod() {
        return isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    protected Reason isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
