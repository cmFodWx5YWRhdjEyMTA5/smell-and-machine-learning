// isComment
package org.totschnig.myexpenses.util.licence;

import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.model.ContribFeature;
import java.util.Locale;

public enum LicenceStatus {

    CONTRIB(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), EXTENDED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), PROFESSIONAL(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {

        @Override
        public boolean isMethod() {
            return true;
        }
    }
    ;

    private final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public boolean isMethod(LicenceStatus isParameter) {
        return isNameExpr == null || isMethod(isNameExpr) >= isIntegerConstant;
    }

    public boolean isMethod(ContribFeature isParameter) {
        if (isNameExpr == null)
            return true;
        return isMethod(isNameExpr.isMethod());
    }

    public boolean isMethod() {
        return true;
    }

    /**
     * isComment
     */
    public String isMethod() {
        switch(this) {
            case isNameExpr:
                return "isStringConstant";
            default:
                return isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}
