// isComment
package org.totschnig.myexpenses.model;

import android.support.annotation.StringRes;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.util.TextUtils;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SORT_KEY_TYPE;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TYPE;

public enum AccountType {

    CASH, BANK, CCARD, ASSET, LIABILITY;

    public static final String isVariable;

    public int isMethod() {
        switch(this) {
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            default:
                return isIntegerConstant;
        }
    }

    public String isMethod() {
        switch(this) {
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
        }
        return "isStringConstant";
    }

    public static AccountType isMethod(String isParameter) {
        if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        } else if (isNameExpr.isMethod("isStringConstant")) {
            return isNameExpr;
        } else {
            return isNameExpr;
        }
    }

    public static String isMethod() {
        String isVariable = "isStringConstant" + isNameExpr;
        for (AccountType isVariable : isNameExpr.isMethod()) {
            isNameExpr += "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod();
        }
        isNameExpr += "isStringConstant" + isNameExpr;
        return isNameExpr;
    }

    private String isMethod() {
        switch(this) {
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
        }
        return "isStringConstant";
    }

    static {
        isNameExpr = isNameExpr.isMethod(AccountType.class);
    }

    @StringRes
    public int isMethod() {
        switch(this) {
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        return isIntegerConstant;
    }
}
