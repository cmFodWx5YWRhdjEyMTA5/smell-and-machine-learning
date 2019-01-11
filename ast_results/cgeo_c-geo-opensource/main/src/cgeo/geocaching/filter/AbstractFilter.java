// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.os.Parcel;
import android.support.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;

abstract class isClassOrIsInterface implements IFilter {

    @NonNull
    private final String isVariable;

    protected isConstructor(@StringRes final int isParameter) {
        this(isNameExpr.isMethod().isMethod(isNameExpr));
    }

    protected isConstructor(@NonNull final String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(final Parcel isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public void isMethod(@NonNull final List<Geocache> isParameter) {
        final List<Geocache> isVariable = new ArrayList<>();
        for (final Geocache isVariable : isNameExpr) {
            if (!isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    @NonNull
    public String isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public String isMethod() {
        return isMethod();
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
