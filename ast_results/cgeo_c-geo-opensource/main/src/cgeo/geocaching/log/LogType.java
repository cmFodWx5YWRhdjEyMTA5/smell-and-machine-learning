// isComment
package cgeo.geocaching.log;

import org.apache.commons.lang3.StringUtils;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;

/**
 * isComment
 */
public enum LogType {

    FOUND_IT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DIDNT_FIND_IT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NOTE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PUBLISH_LISTING(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENABLE_LISTING(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ARCHIVE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNARCHIVE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    TEMP_DISABLE_LISTING(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NEEDS_ARCHIVE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WILL_ATTEND(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ATTENDED(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    RETRIEVED_IT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PLACED_IT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    GRABBED_IT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NEEDS_MAINTENANCE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    OWNER_MAINTENANCE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UPDATE_COORDINATES(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DISCOVERED_IT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    POST_REVIEWER_NOTE(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SUBMIT_FOR_REVIEW(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    VISIT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WEBCAM_PHOTO_TAKEN(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ANNOUNCEMENT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MOVE_COLLECTION(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MOVE_INVENTORY(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    RETRACT(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MARKED_MISSING(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    OC_TEAM_COMMENT(isIntegerConstant, null, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    UNKNOWN(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    public final int isVariable;

    @Nullable
    public final String isVariable;

    @NonNull
    public final String isVariable;

    @NonNull
    public final String isVariable;

    private final int isVariable;

    public final int isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    private static final Map<String, LogType> isVariable = new HashMap<>();

    private static final Map<String, LogType> isVariable = new HashMap<>();

    isConstructor(final int isParameter, @Nullable final String isParameter, @NonNull final String isParameter, @NonNull final String isParameter, final int isParameter, final int isParameter, final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(final int isParameter, final String isParameter, final String isParameter, final String isParameter, final int isParameter, final int isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isIntegerConstant);
    }

    isConstructor(final int isParameter, final String isParameter, final String isParameter, final String isParameter, final int isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    static {
        for (final LogType isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
        }
    }

    @NonNull
    public static LogType isMethod(final int isParameter) {
        for (final LogType isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    @NonNull
    public static LogType isMethod(final String isParameter) {
        // isComment
        if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr;
        }
        final LogType isVariable = isNameExpr != null ? isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod()) : null;
        if (isNameExpr == null) {
            return isNameExpr;
        }
        return isNameExpr;
    }

    @NonNull
    public static LogType isMethod(final String isParameter) {
        final LogType isVariable = isNameExpr != null ? isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod()) : null;
        if (isNameExpr == null) {
            return isNameExpr;
        }
        return isNameExpr;
    }

    @NonNull
    public final String isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public final boolean isMethod() {
        return this == isNameExpr || this == isNameExpr;
    }

    /**
     * isComment
     */
    public final boolean isMethod() {
        return this == isNameExpr || this == isNameExpr || this == isNameExpr;
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return isMethod() || this == isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public static Collection<String> isMethod() {
        final ArrayList<String> isVariable = new ArrayList<>();
        for (final LogType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
            }
        }
        return isNameExpr;
    }
}
