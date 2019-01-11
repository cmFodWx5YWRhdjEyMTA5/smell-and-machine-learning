// isComment
package cgeo.geocaching.connector;

import cgeo.geocaching.log.ReportProblemType;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Image;
import cgeo.geocaching.log.LogType;
import cgeo.geocaching.log.TrackableLog;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Calendar;
import java.util.List;

public interface isClassOrIsInterface {

    /**
     * isComment
     */
    @NonNull
    LogResult isMethod(@NonNull LogType isParameter, @NonNull Calendar isParameter, @NonNull String isParameter, @Nullable String isParameter, @NonNull List<TrackableLog> isParameter, @NonNull ReportProblemType isParameter);

    @NonNull
    ImageResult isMethod(String isParameter, Image isParameter);

    boolean isMethod();

    @NonNull
    List<TrackableLog> isMethod();

    @NonNull
    List<LogType> isMethod();

    void isMethod();

    int isMethod();

    Long isMethod();

    boolean isMethod();

    @NonNull
    List<ReportProblemType> isMethod(@NonNull Geocache isParameter);

    boolean isMethod();

    boolean isMethod();
}
