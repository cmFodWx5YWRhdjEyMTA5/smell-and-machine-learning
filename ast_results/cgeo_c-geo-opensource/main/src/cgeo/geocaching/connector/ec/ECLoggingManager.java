// isComment
package cgeo.geocaching.connector.ec;

import cgeo.geocaching.log.ReportProblemType;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Image;
import cgeo.geocaching.connector.AbstractLoggingManager;
import cgeo.geocaching.connector.ImageResult;
import cgeo.geocaching.connector.LogResult;
import cgeo.geocaching.enumerations.StatusCode;
import cgeo.geocaching.log.LogCacheActivity;
import cgeo.geocaching.log.LogType;
import cgeo.geocaching.log.TrackableLog;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Calendar;
import java.util.List;

class isClassOrIsInterface extends AbstractLoggingManager {

    @NonNull
    private final ECConnector isVariable;

    @NonNull
    private final Geocache isVariable;

    @NonNull
    private final LogCacheActivity isVariable;

    isConstructor(@NonNull final LogCacheActivity isParameter, @NonNull final ECConnector isParameter, @NonNull final Geocache isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public final void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public final LogResult isMethod(@NonNull final LogType isParameter, @NonNull final Calendar isParameter, @NonNull final String isParameter, @Nullable final String isParameter, @NonNull final List<TrackableLog> isParameter, @NonNull final ReportProblemType isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    @NonNull
    public final ImageResult isMethod(final String isParameter, final Image isParameter) {
        return new ImageResult(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    @NonNull
    public List<LogType> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }
}
