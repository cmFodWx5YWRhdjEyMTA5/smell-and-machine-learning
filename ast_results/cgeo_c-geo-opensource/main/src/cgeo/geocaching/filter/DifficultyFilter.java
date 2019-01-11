// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;

class isClassOrIsInterface extends AbstractRangeFilter {

    public static final Creator<DifficultyFilter> isVariable = new Parcelable.Creator<DifficultyFilter>() {

        @Override
        public DifficultyFilter isMethod(final Parcel isParameter) {
            return new DifficultyFilter(isNameExpr);
        }

        @Override
        public DifficultyFilter[] isMethod(final int isParameter) {
            return new DifficultyFilter[isNameExpr];
        }
    };

    private isConstructor(@StringRes final int isParameter, final int isParameter) {
        // isComment
        super(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        final float isVariable = isNameExpr.isMethod();
        return isNameExpr <= isNameExpr && isNameExpr < isNameExpr;
    }

    public static class isClassOrIsInterface implements IFilterFactory {

        private static final int isVariable = isIntegerConstant;

        private static final int isVariable = isIntegerConstant;

        @Override
        @NonNull
        public List<IFilter> isMethod() {
            final List<IFilter> isVariable = new ArrayList<>(isNameExpr);
            for (int isVariable = isNameExpr; isNameExpr <= isNameExpr; isNameExpr++) {
                isNameExpr.isMethod(new DifficultyFilter(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
            }
            return isNameExpr;
        }
    }
}
