// isComment
package cgeo.geocaching.connector.capability;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.IConnector;
import android.support.annotation.NonNull;

public interface isClassOrIsInterface extends IConnector {

    SearchResult isMethod(@NonNull final String isParameter);
}
