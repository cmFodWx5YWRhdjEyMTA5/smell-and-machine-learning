// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;
import java.util.List;

class isClassOrIsInterface extends AbstractFilter {

    private final CacheType isVariable;

    isConstructor(@NonNull final CacheType isParameter) {
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
            final CacheType[] isVariable = isNameExpr.isMethod();
            final List<IFilter> isVariable = new LinkedList<>();
            for (final CacheType isVariable : isNameExpr) {
                if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(new TypeFilter(isNameExpr));
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

    public static final Creator<TypeFilter> isVariable = new Parcelable.Creator<TypeFilter>() {

        @Override
        public TypeFilter isMethod(final Parcel isParameter) {
            return new TypeFilter(isNameExpr);
        }

        @Override
        public TypeFilter[] isMethod(final int isParameter) {
            return new TypeFilter[isNameExpr];
        }
    };
}
