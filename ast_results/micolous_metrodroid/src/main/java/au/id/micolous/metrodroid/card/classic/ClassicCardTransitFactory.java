// isComment
package au.id.micolous.metrodroid.card.classic;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.CardTransitFactory;

public interface isClassOrIsInterface extends CardTransitFactory<ClassicCard> {

    /**
     * isComment
     */
    default int isMethod() {
        return -isIntegerConstant;
    }

    /**
     * isComment
     */
    default boolean isMethod(@NonNull List<ClassicSector> isParameter) {
        return true;
    }

    /**
     * isComment
     */
    @Nullable
    default CardInfo isMethod(@NonNull List<ClassicSector> isParameter) {
        final List<CardInfo> isVariable = isMethod();
        if (!isNameExpr.isMethod() && isMethod(isNameExpr)) {
            return isNameExpr.isMethod(isIntegerConstant);
        }
        return null;
    }

    /**
     * isComment
     */
    @Override
    default boolean isMethod(@NonNull ClassicCard isParameter) {
        return isMethod(isNameExpr.isMethod());
    }
}
