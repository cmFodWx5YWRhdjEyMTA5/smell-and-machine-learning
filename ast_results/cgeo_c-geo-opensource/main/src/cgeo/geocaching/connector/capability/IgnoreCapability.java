// isComment
package cgeo.geocaching.connector.capability;

import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.connector.IConnector;
import android.support.annotation.NonNull;

/**
 * isComment
 */
public interface isClassOrIsInterface extends IConnector {

    boolean isMethod(@NonNull final Geocache isParameter);

    void isMethod(@NonNull final Geocache isParameter);
}
