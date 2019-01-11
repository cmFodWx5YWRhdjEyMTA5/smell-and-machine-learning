// isComment
package cgeo.geocaching.connector.capability;

import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.IConnector;
import cgeo.geocaching.connector.gc.MapTokens;
import cgeo.geocaching.location.Viewport;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface isClassOrIsInterface extends IConnector {

    @NonNull
    SearchResult isMethod(@NonNull final Viewport isParameter, @Nullable final MapTokens isParameter);
}
