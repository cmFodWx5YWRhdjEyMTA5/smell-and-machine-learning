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
        throw new IllegalStateException("isStringConstant");
    }

    @Override
    @Nullable
    public String isMethod(@NonNull final Geocache isParameter) {
        return null;
    }

    @Override
    @NonNull
    public String isMethod() {
        // isComment
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        return true;
    }

    @Override
    public boolean isMethod(@NonNull final String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    @NonNull
    protected String isMethod() {
        throw new IllegalStateException("isStringConstant");
    }

    @Override
    @Nullable
    public String isMethod(@NonNull final String isParameter) {
        return null;
    }
}
