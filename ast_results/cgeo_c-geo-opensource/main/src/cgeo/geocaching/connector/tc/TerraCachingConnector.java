// isComment
package cgeo.geocaching.connector.tc;

import cgeo.geocaching.connector.AbstractConnector;
import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends AbstractConnector {

    @NonNull
    private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);

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
    @Nullable
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
        return true;
    }

    @Override
    @NonNull
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    public boolean isMethod(@NonNull final String isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod();
    }
}
