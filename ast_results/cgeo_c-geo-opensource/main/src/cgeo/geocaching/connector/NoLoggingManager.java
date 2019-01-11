// isComment
package cgeo.geocaching.connector;

import cgeo.geocaching.log.ReportProblemType;
import cgeo.geocaching.models.Image;
import cgeo.geocaching.enumerations.StatusCode;
import cgeo.geocaching.log.LogType;
import cgeo.geocaching.log.TrackableLog;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

class isClassOrIsInterface extends AbstractLoggingManager {

    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    @NonNull
    public LogResult isMethod(@NonNull final LogType isParameter, @NonNull final Calendar isParameter, @NonNull final String isParameter, @Nullable final String isParameter, @NonNull final List<TrackableLog> isParameter, @NonNull final ReportProblemType isParameter) {
        return new LogResult(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    @NonNull
    public ImageResult isMethod(final String isParameter, final Image isParameter) {
        return new ImageResult(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    @NonNull
    public List<LogType> isMethod() {
        return isNameExpr.isMethod();
    }
}
