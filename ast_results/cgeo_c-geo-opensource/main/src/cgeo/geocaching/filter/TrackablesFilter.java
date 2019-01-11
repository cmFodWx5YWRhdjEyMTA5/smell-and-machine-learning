// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.os.Parcel;
import android.os.Parcelable;

class isClassOrIsInterface extends AbstractFilter {

    isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        return isNameExpr.isMethod();
    }

    public static final Creator<TrackablesFilter> isVariable = new Parcelable.Creator<TrackablesFilter>() {

        @Override
        public TrackablesFilter isMethod(final Parcel isParameter) {
            return new TrackablesFilter(isNameExpr);
        }

        @Override
        public TrackablesFilter[] isMethod(final int isParameter) {
            return new TrackablesFilter[isNameExpr];
        }
    };
}
