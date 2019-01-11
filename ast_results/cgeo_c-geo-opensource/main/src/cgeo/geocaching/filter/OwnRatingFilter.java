// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.gcvote.GCVote;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFilter implements IFilterFactory {

    public static final Creator<OwnRatingFilter> isVariable = new Parcelable.Creator<OwnRatingFilter>() {

        @Override
        public OwnRatingFilter isMethod(final Parcel isParameter) {
            return new OwnRatingFilter(isNameExpr);
        }

        @Override
        public OwnRatingFilter[] isMethod(final int isParameter) {
            return new OwnRatingFilter[isNameExpr];
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

    @Override
    @NonNull
    public List<IFilter> isMethod() {
        return isNameExpr.<IFilter>isMethod(this);
    }
}
