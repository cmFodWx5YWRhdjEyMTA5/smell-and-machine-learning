// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.gcvote.GCVote;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFilter {

    public static final Creator<RatingFilter> isVariable = new Parcelable.Creator<RatingFilter>() {

        @Override
        public RatingFilter isMethod(final Parcel isParameter) {
            return new RatingFilter(isNameExpr);
        }

        @Override
        public RatingFilter[] isMethod(final int isParameter) {
            return new RatingFilter[isNameExpr];
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
        return isNameExpr.isMethod() > isIntegerConstant;
    }
}
