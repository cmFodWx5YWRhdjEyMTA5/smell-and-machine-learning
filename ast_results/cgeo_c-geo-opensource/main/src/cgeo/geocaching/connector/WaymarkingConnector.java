// isComment
package cgeo.geocaching.connector;

import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

class isClassOrIsInterface extends AbstractConnector {

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    @NonNull
    public String isMethod(@NonNull final Geocache isParameter) {
        return isMethod() + isNameExpr.isMethod();
    }

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        // isComment
        return true;
    }

    @Override
    @NonNull
    protected String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant";
    }

    @Override
    public boolean isMethod(@NonNull final String isParameter) {
        return isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }

    @Override
    @Nullable
    public String isMethod(@NonNull final String isParameter) {
        // isComment
        final String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isMethod(isNameExpr)) {
            return isNameExpr;
        }
        // isComment
        final String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        return isNameExpr != null && isMethod(isNameExpr) ? isNameExpr : null;
    }
}
