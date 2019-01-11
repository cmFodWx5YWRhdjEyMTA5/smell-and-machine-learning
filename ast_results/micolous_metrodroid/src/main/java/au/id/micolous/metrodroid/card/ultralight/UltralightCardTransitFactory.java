// isComment
package au.id.micolous.metrodroid.card.ultralight;

import android.support.annotation.NonNull;
import au.id.micolous.metrodroid.transit.CardTransitFactory;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;

public interface isClassOrIsInterface extends CardTransitFactory<UltralightCard> {

    boolean isMethod(@NonNull UltralightCard isParameter);
}
