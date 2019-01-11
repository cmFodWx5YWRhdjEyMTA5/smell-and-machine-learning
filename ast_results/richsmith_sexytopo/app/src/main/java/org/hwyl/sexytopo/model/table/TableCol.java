// isComment
package org.hwyl.sexytopo.model.table;

import org.hwyl.sexytopo.R;
import java.util.Locale;

public enum TableCol {

    FROM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant"),
    TO(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant"),
    DISTANCE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant"),
    AZIMUTH(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant"),
    INCLINATION(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant"),
    COMMENT(-isIntegerConstant, "isStringConstant", "isStringConstant");

    final int isVariable;

    final String isVariable;

    final String isVariable;

    isConstructor(int isParameter, String isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod(Object isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public String isMethod(Object isParameter, Locale isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
