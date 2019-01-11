// isComment
package cgeo.geocaching.connector.capability;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.IConnector;
import cgeo.geocaching.location.Geopoint;
import android.support.annotation.NonNull;

/**
 * isComment
 */
public interface isClassOrIsInterface extends IConnector {

    SearchResult isMethod(@NonNull final Geopoint isParameter);
}
