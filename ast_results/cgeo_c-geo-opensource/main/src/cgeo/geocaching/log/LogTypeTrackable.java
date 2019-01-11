// isComment
package cgeo.geocaching.log;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;
import cgeo.geocaching.utils.Log;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;

public enum LogTypeTrackable {

    DO_NOTHING(isIntegerConstant, -isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    VISITED(isIntegerConstant, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant),
    DROPPED_OFF(isIntegerConstant, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    RETRIEVED_IT(isIntegerConstant, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    GRABBED_IT(isIntegerConstant, -isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    NOTE(isIntegerConstant, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    DISCOVERED_IT(isIntegerConstant, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    ARCHIVED(isIntegerConstant, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    MOVE_COLLECTION(isIntegerConstant, -isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    MOVE_INVENTORY(isIntegerConstant, -isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    UNKNOWN(isIntegerConstant, -isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    // isComment
    public final int isVariable;

    public final int isVariable;

    // isComment
    public final int isVariable;

    @NonNull
    public final String isVariable;

    @StringRes
    private final int isVariable;

    @DrawableRes
    public final int isVariable;

    // isComment
    public final LogType isVariable;

    isConstructor(final int isParameter, final int isParameter, @NonNull final String isParameter, @StringRes final int isParameter, @DrawableRes final int isParameter, final LogType isParameter, final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(final int isParameter, final int isParameter, @NonNull final String isParameter, @StringRes final int isParameter, @DrawableRes final int isParameter, final LogType isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    isConstructor(final int isParameter, final int isParameter, final String isParameter, @StringRes final int isParameter, final LogType isParameter, final int isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
    }

    isConstructor(final int isParameter, final int isParameter, final String isParameter, @StringRes final int isParameter, final LogType isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @NonNull
    public String isMethod() {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    public static LogTypeTrackable isMethod(final int isParameter) {
        for (final LogTypeTrackable isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        isNameExpr.isMethod("isStringConstant" + isNameExpr);
        return isNameExpr;
    }

    // isComment
    public static List<LogTypeTrackable> isMethod() {
        final List<LogTypeTrackable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    // isComment
    public static boolean isMethod(final LogTypeTrackable isParameter) {
        return !(isNameExpr == isNameExpr || isNameExpr == isNameExpr);
    }
}
