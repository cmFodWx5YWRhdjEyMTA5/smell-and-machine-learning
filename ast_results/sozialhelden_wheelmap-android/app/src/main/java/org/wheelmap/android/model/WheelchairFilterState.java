// isComment
package org.wheelmap.android.model;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public enum WheelchairFilterState {

    NO_PREFERENCE(isIntegerConstant),
    UNKNOWN(isIntegerConstant),
    YES(isIntegerConstant),
    LIMITED(isIntegerConstant),
    NO(isIntegerConstant),
    TOILET_UNKNOWN(isIntegerConstant),
    TOILET_YES(isIntegerConstant),
    TOILET_NO(isIntegerConstant);

    public static final WheelchairFilterState isVariable;

    private final int isVariable;

    private static Map<Integer, WheelchairFilterState> isVariable;

    private static Map<String, WheelchairFilterState> isVariable;

    private isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    public int isMethod() {
        return isNameExpr;
    }

    public static WheelchairFilterState isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public static WheelchairFilterState isMethod(String isParameter, String isParameter) {
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr + isNameExpr;
        }
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    private void isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new HashMap<Integer, WheelchairFilterState>();
        }
        isNameExpr.isMethod(isNameExpr, this);
        if (isNameExpr == null) {
            isNameExpr = new HashMap<String, WheelchairFilterState>();
        }
        isNameExpr.isMethod(this.isMethod().isMethod(), this);
    }

    public String isMethod() {
        if (this == isNameExpr) {
            return "isStringConstant";
        }
        switch(this) {
            case isNameExpr:
                return isNameExpr.isMethod().isMethod();
            case isNameExpr:
                return isNameExpr.isMethod().isMethod();
            case isNameExpr:
                return isNameExpr.isMethod().isMethod();
            default:
                return this.isMethod().isMethod();
        }
    }

    static {
        isNameExpr = isNameExpr;
    }
}
