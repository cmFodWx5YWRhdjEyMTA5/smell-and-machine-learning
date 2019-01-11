// isComment
package fr.simon.marquis.preferencesmanager.model;

import java.util.Set;
import fr.simon.marquis.preferencesmanager.R;
import fr.simon.marquis.preferencesmanager.ui.App;

public enum PreferenceType {

    // isComment
    BOOLEAN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    STRING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    INT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    FLOAT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    LONG(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    STRINGSET(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNSUPPORTED(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private final int isVariable;

    private final int isVariable;

    private final int isVariable;

    private final int isVariable;

    private final int isVariable;

    private final int isVariable;

    private isConstructor(int isParameter, int isParameter, int isParameter, int isParameter, int isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public static PreferenceType isMethod(Object isParameter) {
        if (isNameExpr instanceof String) {
            return isNameExpr;
        } else if (isNameExpr instanceof Integer) {
            return isNameExpr;
        } else if (isNameExpr instanceof Long) {
            return isNameExpr;
        } else if (isNameExpr instanceof Float) {
            return isNameExpr;
        } else if (isNameExpr instanceof Boolean) {
            return isNameExpr;
        } else if (isNameExpr instanceof Set<?>) {
            return isNameExpr;
        }
        return isNameExpr;
    }

    public static int isMethod(Object isParameter) {
        return isMethod(isNameExpr).isMethod();
    }

    public int isMethod(boolean isParameter) {
        return isNameExpr ? isNameExpr : isNameExpr;
    }

    public int isMethod() {
        return isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr ? isNameExpr : isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }
}
