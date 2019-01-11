// isComment
package au.id.micolous.metrodroid.card.desfire;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.CardTransitFactory;

public interface isClassOrIsInterface extends CardTransitFactory<DesfireCard> {

    boolean isMethod(int[] isParameter);

    @Nullable
    default CardInfo isMethod(int[] isParameter) {
        final List<CardInfo> isVariable = isMethod();
        if (isNameExpr.isMethod()) {
            return null;
        }
        return isMethod().isMethod(isIntegerConstant);
    }

    default boolean isMethod(@NonNull DesfireCard isParameter) {
        List<DesfireApplication> isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod();
        int[] isVariable = new int[isNameExpr];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr).isMethod();
        }
        return isMethod(isNameExpr);
    }
}
