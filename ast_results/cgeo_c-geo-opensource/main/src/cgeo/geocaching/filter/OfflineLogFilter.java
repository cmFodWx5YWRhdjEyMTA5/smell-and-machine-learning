// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public class isClassOrIsInterface extends AbstractFilter {

    public static final Creator<OfflineLogFilter> isVariable = new Parcelable.Creator<OfflineLogFilter>() {

        @Override
        public OfflineLogFilter isMethod(final Parcel isParameter) {
            return new OfflineLogFilter(isNameExpr);
        }

        @Override
        public OfflineLogFilter[] isMethod(final int isParameter) {
            return new OfflineLogFilter[isNameExpr];
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
        return isNameExpr.isMethod();
    }
}
