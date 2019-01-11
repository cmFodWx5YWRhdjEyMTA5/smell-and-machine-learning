// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.enumerations.CacheSize;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.LinkedList;
import java.util.List;

class isClassOrIsInterface extends AbstractFilter {

    private final CacheSize isVariable;

    public static final Creator<SizeFilter> isVariable = new Parcelable.Creator<SizeFilter>() {

        @Override
        public SizeFilter isMethod(final Parcel isParameter) {
            return new SizeFilter(isNameExpr);
        }

        @Override
        public SizeFilter[] isMethod(final int isParameter) {
            return new SizeFilter[isNameExpr];
        }
    };

    isConstructor(@NonNull final CacheSize isParameter) {
        super(isNameExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod()[isNameExpr.isMethod()];
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        return isNameExpr == isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    public static class isClassOrIsInterface implements IFilterFactory {

        @Override
        @NonNull
        public List<IFilter> isMethod() {
            final CacheSize[] isVariable = isNameExpr.isMethod();
            final List<IFilter> isVariable = new LinkedList<>();
            for (final CacheSize isVariable : isNameExpr) {
                if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(new SizeFilter(isNameExpr));
                }
            }
            return isNameExpr;
        }
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
