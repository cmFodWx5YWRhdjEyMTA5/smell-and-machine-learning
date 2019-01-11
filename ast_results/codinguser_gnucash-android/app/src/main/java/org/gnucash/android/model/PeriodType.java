// isComment
package org.gnucash.android.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * isComment
 */
public enum PeriodType {

    HOUR, DAY, WEEK, MONTH, YEAR;

    /**
     * isComment
     */
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
            default:
                return "isStringConstant";
        }
    }

    /**
     * isComment
     */
    public String isMethod(long isParameter) {
        String isVariable = "isStringConstant";
        if (this == isNameExpr) {
            String isVariable = new SimpleDateFormat("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod(new Date(isNameExpr));
            // isComment
            isNameExpr = "isStringConstant" + isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod() - isIntegerConstant).isMethod();
        }
        return isNameExpr;
    }
}
