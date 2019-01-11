// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.enumerations.CacheAttribute;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.LinkedList;
import java.util.List;

class isClassOrIsInterface extends AbstractFilter {

    private final String isVariable;

    public static final Creator<AttributeFilter> isVariable = new Parcelable.Creator<AttributeFilter>() {

        @Override
        public AttributeFilter isMethod(final Parcel isParameter) {
            return new AttributeFilter(isNameExpr);
        }

        @Override
        public AttributeFilter[] isMethod(final int isParameter) {
            return new AttributeFilter[isNameExpr];
        }
    };

    isConstructor(@NonNull final String isParameter, final String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    public static class isClassOrIsInterface implements IFilterFactory {

        @Override
        @NonNull
        public List<IFilter> isMethod() {
            final List<IFilter> isVariable = new LinkedList<>();
            for (final CacheAttribute isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(new AttributeFilter(isNameExpr.isMethod(true), isNameExpr.isMethod(true)));
                isNameExpr.isMethod(new AttributeFilter(isNameExpr.isMethod(true), isNameExpr.isMethod(true)));
            }
            return isNameExpr;
        }
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
