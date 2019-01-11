// isComment
package com.vrem.wifianalyzer.vendor.model;

import android.support.annotation.NonNull;
import org.apache.commons.lang3.StringUtils;

class isClassOrIsInterface {

    static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private isConstructor() {
        throw new IllegalStateException("isStringConstant");
    }

    @NonNull
    static String isMethod(String isParameter) {
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr;
        }
        String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        return isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr)).isMethod();
    }

    @NonNull
    static String isMethod(String isParameter) {
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr;
        }
        if (isNameExpr.isMethod() < isNameExpr) {
            return "isStringConstant" + isNameExpr + "isStringConstant";
        }
        return isNameExpr.isMethod(isIntegerConstant, isIntegerConstant) + isNameExpr + isNameExpr.isMethod(isIntegerConstant, isIntegerConstant) + isNameExpr + isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
    }
}
