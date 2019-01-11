// isComment
package com.byagowi.persiancalendar.praytimes;

import static com.byagowi.persiancalendar.praytimes.Utils.deg;
import static com.byagowi.persiancalendar.praytimes.Utils.min;

public enum CalculationMethod {

    MWL("isStringConstant", isMethod(isIntegerConstant), isMethod(isIntegerConstant)),
    ISNA("isStringConstant", isMethod(isIntegerConstant), isMethod(isIntegerConstant)),
    Egypt("isStringConstant", isMethod(isDoubleConstant), isMethod(isDoubleConstant)),
    Makkah("isStringConstant", isMethod(isDoubleConstant), isMethod(isIntegerConstant)),
    Karachi("isStringConstant", isMethod(isIntegerConstant), isMethod(isIntegerConstant)),
    Tehran("isStringConstant", isMethod(isDoubleConstant), isMethod(isIntegerConstant), isMethod(isDoubleConstant), isNameExpr.isFieldAccessExpr),
    Jafari("isStringConstant", isMethod(isIntegerConstant), isMethod(isIntegerConstant), isMethod(isIntegerConstant), isNameExpr.isFieldAccessExpr);

    private final String isVariable;

    private final MinuteOrAngleDouble isVariable;

    private final MinuteOrAngleDouble isVariable;

    private final MinuteOrAngleDouble isVariable;

    private final MidnightType isVariable;

    isConstructor(String isParameter, MinuteOrAngleDouble isParameter, MinuteOrAngleDouble isParameter, MinuteOrAngleDouble isParameter, MidnightType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr == null ? isMethod(isIntegerConstant) : isNameExpr;
        this.isFieldAccessExpr = isNameExpr == null ? isNameExpr.isFieldAccessExpr : isNameExpr;
    }

    isConstructor(String isParameter, MinuteOrAngleDouble isParameter, MinuteOrAngleDouble isParameter, MinuteOrAngleDouble isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null);
    }

    isConstructor(String isParameter, MinuteOrAngleDouble isParameter, MinuteOrAngleDouble isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, null);
    }

    public String isMethod() {
        return isNameExpr;
    }

    public MinuteOrAngleDouble isMethod() {
        return isNameExpr;
    }

    public MinuteOrAngleDouble isMethod() {
        return isNameExpr;
    }

    public MinuteOrAngleDouble isMethod() {
        return isNameExpr;
    }

    public MidnightType isMethod() {
        return isNameExpr;
    }

    // isComment
    public enum MidnightType {

        // isComment
        Standard,
        // isComment
        Jafari
    }

    // isComment
    public enum AsrJuristics {

        // isComment
        Standard,
        // isComment
        Hanafi
    }

    // isComment
    public enum HighLatMethods {

        // isComment
        NightMiddle,
        // isComment
        AngleBased,
        // isComment
        OneSeventh,
        // isComment
        None
    }
}
