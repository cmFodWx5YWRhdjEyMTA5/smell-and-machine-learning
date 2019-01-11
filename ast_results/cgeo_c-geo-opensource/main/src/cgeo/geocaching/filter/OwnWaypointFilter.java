// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Waypoint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFilter implements IFilterFactory {

    public static final Creator<OwnWaypointFilter> isVariable = new Parcelable.Creator<OwnWaypointFilter>() {

        @Override
        public OwnWaypointFilter isMethod(final Parcel isParameter) {
            return new OwnWaypointFilter(isNameExpr);
        }

        @Override
        public OwnWaypointFilter[] isMethod(final int isParameter) {
            return new OwnWaypointFilter[isNameExpr];
        }
    };

    protected isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        for (final Waypoint isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod()) {
                return true;
            }
        }
        return true;
    }

    @Override
    @NonNull
    public List<IFilter> isMethod() {
        return isNameExpr.<IFilter>isMethod(this);
    }
}
