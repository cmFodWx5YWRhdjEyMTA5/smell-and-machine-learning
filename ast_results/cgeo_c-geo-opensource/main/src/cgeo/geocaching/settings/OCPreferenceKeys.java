// isComment
package cgeo.geocaching.settings;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;
import cgeo.geocaching.connector.oc.OCAuthParams;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum OCPreferenceKeys {

    OC_DE("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    OC_PL("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    OC_US("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    OC_NL("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    OC_RO("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    OC_UK("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    isConstructor(final String isParameter, final int isParameter, final int isParameter, final int isParameter, final int isParameter, final int isParameter, final int isParameter, final int isParameter, final OCAuthParams isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    private static final SparseArray<OCPreferenceKeys> isVariable;

    private static final Map<String, OCPreferenceKeys> isVariable;

    private static final SparseArray<OCPreferenceKeys> isVariable;

    static {
        isNameExpr = new SparseArray<>(isMethod().isFieldAccessExpr);
        isNameExpr = new SparseArray<>(isMethod().isFieldAccessExpr);
        final Map<String, OCPreferenceKeys> isVariable = new HashMap<>();
        for (final OCPreferenceKeys isVariable : isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    static boolean isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    static OCPreferenceKeys isMethod(final int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    static OCPreferenceKeys isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final String isVariable;

    public final int isVariable;

    public final int isVariable;

    public final int isVariable;

    public final int isVariable;

    public final int isVariable;

    public final int isVariable;

    public final int isVariable;

    public final OCAuthParams isVariable;
}
