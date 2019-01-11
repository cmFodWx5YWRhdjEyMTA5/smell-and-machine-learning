// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;

class isClassOrIsInterface extends AbstractFilter implements IFilterFactory {

    public static final Creator<ModifiedFilter> isVariable = new Parcelable.Creator<ModifiedFilter>() {

        @Override
        public ModifiedFilter isMethod(final Parcel isParameter) {
            return new ModifiedFilter(isNameExpr);
        }

        @Override
        public ModifiedFilter[] isMethod(final int isParameter) {
            return new ModifiedFilter[isNameExpr];
        }
    };

    isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        // isComment
        return isNameExpr.isMethod() || isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public List<IFilter> isMethod() {
        return isNameExpr.<IFilter>isMethod(this);
    }
}
