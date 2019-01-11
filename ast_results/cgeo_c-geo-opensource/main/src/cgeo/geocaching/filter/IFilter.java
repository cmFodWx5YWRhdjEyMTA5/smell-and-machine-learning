// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.os.Parcelable;
import java.util.List;

public interface isClassOrIsInterface extends Parcelable {

    @NonNull
    String isMethod();

    /**
     * isComment
     */
    boolean isMethod(@NonNull final Geocache isParameter);

    void isMethod(@NonNull final List<Geocache> isParameter);
}
