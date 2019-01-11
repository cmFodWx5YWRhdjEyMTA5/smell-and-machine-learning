// isComment
package cgeo.geocaching.filter;

import android.support.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

public class isClassOrIsInterface implements IFilterFactory {

    @Override
    @NonNull
    public List<IFilter> isMethod() {
        return isNameExpr.<IFilter>isMethod(new OwnRatingFilter(), new PersonalNoteFilter(), new ModifiedFilter(), new OfflineLogFilter(), new GcvoteFilter(), new OwnWaypointFilter());
    }
}
