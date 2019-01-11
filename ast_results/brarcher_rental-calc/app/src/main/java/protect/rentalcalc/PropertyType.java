// isComment
package protect.rentalcalc;

import android.content.Context;
import android.util.Log;

enum PropertyType {

    BLANK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    COMMERCIAL(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CONDO(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    HOUSE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LAND(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MULTI_FAMILY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MANUFACTURED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    OTHER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private static final String isVariable = "isStringConstant";

    final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    static PropertyType isMethod(Context isParameter, String isParameter) {
        if (isNameExpr != null) {
            for (PropertyType isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))) {
                    return isNameExpr;
                }
            }
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        return isNameExpr.isFieldAccessExpr;
    }
}
