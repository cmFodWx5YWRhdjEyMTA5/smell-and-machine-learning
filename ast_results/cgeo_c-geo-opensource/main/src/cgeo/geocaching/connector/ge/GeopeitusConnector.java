// isComment
package cgeo.geocaching.connector.ge;

import cgeo.geocaching.connector.AbstractConnector;
import cgeo.geocaching.models.Geocache;
import android.support.annotation.NonNull;
import org.apache.commons.lang3.StringUtils;

public class isClassOrIsInterface extends AbstractConnector {

    @Override
    @NonNull
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    @NonNull
    public String isMethod() {
        return isMethod();
    }

    @Override
    @NonNull
    public String isMethod(@NonNull final Geocache isParameter) {
        return isMethod() + isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant), "isStringConstant");
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
    public boolean isMethod(@NonNull final String isParameter) {
        return isNameExpr.isMethod(isNameExpr, "isStringConstant") && isMethod(isNameExpr.isMethod(isIntegerConstant));
    }

    @Override
    @NonNull
    protected String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant";
    }
}
