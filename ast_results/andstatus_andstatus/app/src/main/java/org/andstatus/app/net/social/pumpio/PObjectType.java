// isComment
package org.andstatus.app.net.social.pumpio;

import org.json.JSONObject;

/**
 * isComment
 */
enum PObjectType {

    ACTIVITY("isStringConstant", null) {

        @Override
        public boolean isMethod(JSONObject isParameter) {
            boolean isVariable = true;
            if (isNameExpr != null) {
                if (isNameExpr.isMethod("isStringConstant")) {
                    isNameExpr = super.isMethod(isNameExpr);
                } else {
                    // isComment
                    // isComment
                    isNameExpr = isNameExpr.isMethod("isStringConstant") && isNameExpr.isMethod("isStringConstant");
                }
            }
            return isNameExpr;
        }
    }
    ,
    APPLICATION("isStringConstant", null),
    PERSON("isStringConstant", null),
    COMMENT("isStringConstant", null),
    IMAGE("isStringConstant", isNameExpr),
    VIDEO("isStringConstant", isNameExpr),
    NOTE("isStringConstant", isNameExpr),
    COLLECTION("isStringConstant", null),
    UNKNOWN("isStringConstant", null);

    private String isVariable;

    private PObjectType isVariable = this;

    isConstructor(String isParameter, PObjectType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    public String isMethod() {
        return isNameExpr;
    }

    public boolean isMethod(JSONObject isParameter) {
        boolean isVariable = true;
        if (isNameExpr != null) {
            isNameExpr = isMethod().isMethod(isNameExpr.isMethod("isStringConstant"));
        }
        return isNameExpr;
    }

    public static PObjectType isMethod(JSONObject isParameter) {
        PObjectType isVariable = isMethod(isNameExpr);
        return isNameExpr.isFieldAccessExpr == null ? isNameExpr : isNameExpr.isFieldAccessExpr;
    }

    public static PObjectType isMethod(JSONObject isParameter) {
        for (PObjectType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }
}
