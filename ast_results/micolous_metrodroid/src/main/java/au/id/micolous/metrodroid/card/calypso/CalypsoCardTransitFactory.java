// isComment
package au.id.micolous.metrodroid.card.calypso;

import android.support.annotation.NonNull;
import au.id.micolous.metrodroid.transit.CardInfo;
import au.id.micolous.metrodroid.transit.CardTransitFactory;

public interface isClassOrIsInterface extends CardTransitFactory<CalypsoApplication> {

    @Override
    default boolean isMethod(@NonNull CalypsoApplication isParameter) {
        final byte[] isVariable = isNameExpr.isMethod();
        return isMethod(isNameExpr);
    }

    boolean isMethod(byte[] isParameter);

    CardInfo isMethod(byte[] isParameter);
}
