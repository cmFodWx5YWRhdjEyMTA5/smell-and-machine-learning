// isComment
package au.id.micolous.metrodroid.transit.chc_metrocard;

import android.os.Parcel;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.CardType;
import au.id.micolous.metrodroid.card.classic.ClassicCard;
import au.id.micolous.metrodroid.card.classic.ClassicCardTransitFactory;
import au.id.micolous.metrodroid.card.classic.ClassicSector;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.transit.erg.ErgTransitData;
import au.id.micolous.metrodroid.transit.erg.ErgTrip;
import au.id.micolous.metrodroid.transit.erg.record.ErgMetadataRecord;
import au.id.micolous.metrodroid.transit.erg.record.ErgPurseRecord;

public class isClassOrIsInterface extends ErgTransitData {

    public static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final TimeZone isVariable = isNameExpr.isMethod("isStringConstant");

    static final String isVariable = "isStringConstant";

    public static final CardInfo isVariable = new CardInfo.Builder().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod().isMethod();

    // isComment
    public static final Creator<ChcMetrocardTransitData> isVariable = new Creator<ChcMetrocardTransitData>() {

        @Override
        public ChcMetrocardTransitData isMethod(Parcel isParameter) {
            return new ChcMetrocardTransitData(isNameExpr);
        }

        @Override
        public ChcMetrocardTransitData[] isMethod(int isParameter) {
            return new ChcMetrocardTransitData[isNameExpr];
        }
    };

    public isConstructor(Parcel isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(ClassicCard isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public static final ClassicCardTransitFactory isVariable = new ErgTransitFactory() {

        @Override
        public TransitData isMethod(@NonNull ClassicCard isParameter) {
            return new ChcMetrocardTransitData(isNameExpr);
        }

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod(isNameExpr);
        }
    };

    @Override
    protected ErgTrip isMethod(ErgPurseRecord isParameter, GregorianCalendar isParameter) {
        return new ChcMetrocardTrip(isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    protected String isMethod(ErgMetadataRecord isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    protected TimeZone isMethod() {
        return isNameExpr;
    }
}
