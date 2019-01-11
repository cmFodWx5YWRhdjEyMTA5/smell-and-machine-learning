// isComment
package org.andstatus.app.data;

import android.support.annotation.NonNull;
import org.andstatus.app.util.StringUtils;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private String isVariable = "isStringConstant";

    public SqlWhere isMethod(String isParameter, SqlIds isParameter) {
        return isMethod(isNameExpr, isNameExpr.isMethod());
    }

    public SqlWhere isMethod(String isParameter, String isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return this;
        }
        return isMethod(isNameExpr + isNameExpr);
    }

    public SqlWhere isMethod(String isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return this;
        }
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr += "isStringConstant";
        }
        isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
        return this;
    }

    @NonNull
    public String isMethod() {
        return isNameExpr;
    }

    @NonNull
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr) ? "isStringConstant" : "isStringConstant" + isNameExpr + "isStringConstant";
    }

    @NonNull
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr) ? "isStringConstant" : "isStringConstant" + isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }
}
