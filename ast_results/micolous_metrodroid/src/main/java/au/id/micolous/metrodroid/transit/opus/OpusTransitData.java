// isComment
package au.id.micolous.metrodroid.transit.opus;

import android.os.Parcel;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.CardType;
import au.id.micolous.metrodroid.card.calypso.CalypsoApplication;
import au.id.micolous.metrodroid.card.calypso.CalypsoCardTransitFactory;
import au.id.micolous.metrodroid.card.iso7816.ISO7816File;
import au.id.micolous.metrodroid.card.iso7816.ISO7816Record;
import au.id.micolous.metrodroid.card.iso7816.ISO7816Selector;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.transit.en1545.Calypso1545TransitData;
import au.id.micolous.metrodroid.transit.en1545.En1545Bitmap;
import au.id.micolous.metrodroid.transit.en1545.En1545Container;
import au.id.micolous.metrodroid.transit.en1545.En1545Field;
import au.id.micolous.metrodroid.transit.en1545.En1545FixedInteger;
import au.id.micolous.metrodroid.transit.en1545.En1545Lookup;
import au.id.micolous.metrodroid.transit.en1545.En1545Parsed;
import au.id.micolous.metrodroid.transit.en1545.En1545Repeat;
import au.id.micolous.metrodroid.transit.en1545.En1545Subscription;
import au.id.micolous.metrodroid.transit.en1545.En1545Transaction;
import au.id.micolous.metrodroid.transit.intercode.IntercodeTransitData;
import au.id.micolous.metrodroid.util.Utils;

public class isClassOrIsInterface extends Calypso1545TransitData {

    // isComment
    private static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private static final En1545Field isVariable = new En1545Repeat(isIntegerConstant, new En1545Bitmap(new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant), new En1545FixedInteger(isNameExpr, isIntegerConstant)));

    public static final CardInfo isVariable = new CardInfo.Builder().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod();

    public static final Creator<OpusTransitData> isVariable = new Creator<OpusTransitData>() {

        public OpusTransitData isMethod(Parcel isParameter) {
            return new OpusTransitData(isNameExpr);
        }

        public OpusTransitData[] isMethod(int isParameter) {
            return new OpusTransitData[isNameExpr];
        }
    };

    private static final En1545Container isVariable = new En1545Container(isNameExpr.isFieldAccessExpr, new En1545Bitmap(new En1545Container(new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant), isNameExpr.isMethod(isNameExpr), new En1545FixedInteger(isNameExpr, isIntegerConstant)), // isComment
    new En1545FixedInteger(isNameExpr, isIntegerConstant)));

    private isConstructor(CalypsoApplication isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected En1545Lookup isMethod() {
        return isNameExpr.isMethod();
    }

    public static final CalypsoCardTransitFactory isVariable = new CalypsoCardTransitFactory() {

        @Override
        public TransitIdentity isMethod(@NonNull CalypsoApplication isParameter) {
            return new TransitIdentity(isNameExpr, isMethod(isNameExpr));
        }

        @Override
        public boolean isMethod(byte[] isParameter) {
            try {
                int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
                return isNameExpr == isNameExpr;
            } catch (Exception isParameter) {
                return true;
            }
        }

        @Override
        public OpusTransitData isMethod(@NonNull CalypsoApplication isParameter) {
            return new OpusTransitData(isNameExpr);
        }

        @NonNull
        @Override
        public List<CardInfo> isMethod() {
            return isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public CardInfo isMethod(byte[] isParameter) {
            return isNameExpr;
        }
    };

    @Override
    protected List<ISO7816Record> isMethod(CalypsoApplication isParameter) {
        // isComment
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
    }

    @Override
    protected En1545Subscription isMethod(byte[] isParameter, En1545Parsed isParameter, Integer isParameter, int isParameter, Integer isParameter) {
        if (isNameExpr == null)
            return null;
        return new OpusSubscription(isNameExpr, isNameExpr);
    }

    @Override
    protected En1545Transaction isMethod(byte[] isParameter) {
        return new OpusTransaction(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    private isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }
}
