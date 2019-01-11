// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.gcvote.GCVote;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * isComment
 */
class isClassOrIsInterface extends AbstractFilter {

    public static final Creator<GcvoteFilter> isVariable = new Parcelable.Creator<GcvoteFilter>() {

        @Override
        public GcvoteFilter isMethod(final Parcel isParameter) {
            return new GcvoteFilter(isNameExpr);
        }

        @Override
        public GcvoteFilter[] isMethod(final int isParameter) {
            return new GcvoteFilter[isNameExpr];
        }
    };

    isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    isConstructor(final Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(final Geocache isParameter) {
        return isNameExpr.isMethod() && !isNameExpr.isMethod(isNameExpr.isMethod()) && isNameExpr.isMethod(isNameExpr);
    }
}
