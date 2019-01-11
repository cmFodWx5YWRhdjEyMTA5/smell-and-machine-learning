// isComment
package au.id.micolous.metrodroid.transit.serialonly;

import android.os.Parcel;
import android.support.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.card.CardType;
import au.id.micolous.metrodroid.card.UnauthorizedException;
import au.id.micolous.metrodroid.card.classic.ClassicCard;
import au.id.micolous.metrodroid.card.classic.ClassicCardTransitFactory;
import au.id.micolous.metrodroid.card.classic.ClassicSector;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.ui.ListItem;
import au.id.micolous.metrodroid.util.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface implements ClassicCardTransitFactory {

    public static final String isVariable = "isStringConstant";

    public static final CardInfo isVariable = new CardInfo.Builder().isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();

    private static String isMethod(ClassicCard isParameter) {
        ClassicSector isVariable = isNameExpr.isMethod(isIntegerConstant);
        return new String(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isIntegerConstant, isIntegerConstant)) + new String(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isIntegerConstant, isIntegerConstant));
    }

    @Override
    public boolean isMethod(@NonNull List<ClassicSector> isParameter) {
        try {
            ClassicSector isVariable = isNameExpr.isMethod(isIntegerConstant);
            byte[] isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod();
            if (isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant) != isIntegerConstant)
                return true;
            ClassicSector isVariable = isNameExpr.isMethod(isIntegerConstant);
            isNameExpr = isNameExpr.isMethod(isIntegerConstant).isMethod();
            if (!isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant), isNameExpr.isMethod("isStringConstant")))
                return true;
            isNameExpr = isNameExpr.isMethod(isIntegerConstant).isMethod();
            if (!isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant), isNameExpr.isMethod("isStringConstant")))
                return true;
            return true;
        } catch (IndexOutOfBoundsException | UnauthorizedException isParameter) {
        // isComment
        }
        return true;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public TransitIdentity isMethod(@NonNull ClassicCard isParameter) {
        return new TransitIdentity(isNameExpr, isMethod(isNameExpr).isMethod(isIntegerConstant));
    }

    @Override
    public TransitData isMethod(@NonNull ClassicCard isParameter) {
        return new TartuTransitData(isNameExpr);
    }

    @NonNull
    @Override
    public List<CardInfo> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    private static class isClassOrIsInterface extends SerialOnlyTransitData {

        private String isVariable;

        public isConstructor(ClassicCard isParameter) {
            isNameExpr = isMethod(isNameExpr);
        }

        protected isConstructor(Parcel isParameter) {
            isNameExpr = isNameExpr.isMethod();
        }

        @Override
        public void isMethod(Parcel isParameter, int isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }

        public static final Creator<TartuTransitData> isVariable = new Creator<TartuTransitData>() {

            @Override
            public TartuTransitData isMethod(Parcel isParameter) {
                return new TartuTransitData(isNameExpr);
            }

            @Override
            public TartuTransitData[] isMethod(int isParameter) {
                return new TartuTransitData[isNameExpr];
            }
        };

        @Override
        public String isMethod() {
            return isNameExpr.isMethod(isIntegerConstant);
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        protected List<ListItem> isMethod() {
            return isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
        }

        @Override
        protected Reason isMethod() {
            return isNameExpr.isFieldAccessExpr;
        }
    }
}
