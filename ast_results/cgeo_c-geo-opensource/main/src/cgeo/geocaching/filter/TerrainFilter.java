// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;

class isClassOrIsInterface extends AbstractRangeFilter {

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
                isNameExpr.isMethod(new TerrainFilter(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
            }
            return isNameExpr;
        }
    }

    public static final Creator<TerrainFilter> isVariable = new Parcelable.Creator<TerrainFilter>() {

        @Override
        public TerrainFilter isMethod(final Parcel isParameter) {
            return new TerrainFilter(isNameExpr);
        }

        @Override
        public TerrainFilter[] isMethod(final int isParameter) {
            return new TerrainFilter[isNameExpr];
        }
    };
}
