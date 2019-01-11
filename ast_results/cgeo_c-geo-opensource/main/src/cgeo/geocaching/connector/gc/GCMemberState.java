// isComment
package cgeo.geocaching.connector.gc;

import org.apache.commons.lang3.StringUtils;
import android.support.annotation.NonNull;

public enum GCMemberState {

    UNKNOWN("isStringConstant"), BASIC("isStringConstant"), PREMIUM("isStringConstant"), CHARTER("isStringConstant");

    @NonNull
    public final String isVariable;

    isConstructor(@NonNull final String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod() {
        return this == isNameExpr || this == isNameExpr;
    }

    @NonNull
    public static GCMemberState isMethod(final String isParameter) {
        if (isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr)) {
            return isNameExpr;
        }
        return isNameExpr.isFieldAccessExpr;
    }
}
