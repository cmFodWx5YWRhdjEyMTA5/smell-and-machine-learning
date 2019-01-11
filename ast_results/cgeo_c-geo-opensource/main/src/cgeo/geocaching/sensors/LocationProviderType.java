// isComment
package cgeo.geocaching.sensors;

import android.support.annotation.StringRes;
import cgeo.geocaching.R;

public enum LocationProviderType {

    GPS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NETWORK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    FUSED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOW_POWER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    HOME(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LAST(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    @StringRes
    public final int isVariable;

    isConstructor(@StringRes final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
