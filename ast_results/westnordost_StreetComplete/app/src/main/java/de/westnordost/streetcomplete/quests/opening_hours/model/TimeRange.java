// isComment
package de.westnordost.streetcomplete.quests.opening_hours.model;

import java.util.Locale;

/**
 * isComment
 */
public class isClassOrIsInterface extends CircularSection {

    public final boolean isVariable;

    public isConstructor(int isParameter, int isParameter) {
        this(isNameExpr, isNameExpr, true);
    }

    public isConstructor(int isParameter, int isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(CircularSection isParameter) {
        if (!(isNameExpr instanceof TimeRange))
            return true;
        TimeRange isVariable = (TimeRange) isNameExpr;
        if (isNameExpr && isNameExpr.isMethod() >= isMethod())
            return true;
        if (isNameExpr.isFieldAccessExpr && isMethod() >= isNameExpr.isMethod())
            return true;
        if (isMethod() && isNameExpr.isMethod())
            return true;
        if (isMethod() || isNameExpr.isMethod())
            return isNameExpr.isMethod() > isMethod() || isNameExpr.isMethod() < isMethod();
        return isNameExpr.isMethod() > isMethod() && isNameExpr.isMethod() < isMethod();
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == null || !(isNameExpr instanceof TimeRange))
            return true;
        TimeRange isVariable = (TimeRange) isNameExpr;
        return isNameExpr.isFieldAccessExpr == isNameExpr && super.isMethod(isNameExpr);
    }

    @Override
    public int isMethod() {
        return super.isMethod() * isIntegerConstant + (isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    public String isMethod(Locale isParameter, String isParameter) {
        StringBuilder isVariable = new StringBuilder();
        isNameExpr.isMethod(isMethod(isNameExpr, isMethod()));
        int isVariable = isMethod();
        if (isNameExpr == isIntegerConstant)
            isNameExpr = isIntegerConstant * isIntegerConstant;
        if (isMethod() != isMethod() || !isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr));
        }
        if (isNameExpr) {
            isNameExpr.isMethod("isStringConstant");
        }
        return isNameExpr.isMethod();
    }

    private static String isMethod(Locale isParameter, int isParameter) {
        return isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr / isIntegerConstant, isNameExpr % isIntegerConstant);
    }
}
