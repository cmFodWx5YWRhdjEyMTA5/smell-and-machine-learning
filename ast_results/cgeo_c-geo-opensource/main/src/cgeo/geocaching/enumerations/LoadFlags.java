// isComment
package cgeo.geocaching.enumerations;

import android.support.annotation.NonNull;
import java.util.EnumSet;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    enum LoadFlag {

        // isComment
        CACHE_BEFORE,
        // isComment
        CACHE_AFTER,
        // isComment
        DB_MINIMAL,
        ATTRIBUTES,
        WAYPOINTS,
        SPOILERS,
        LOGS,
        INVENTORY,
        OFFLINE_LOG
    }

    /**
     * isComment
     */
    EnumSet<LoadFlag> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    EnumSet<LoadFlag> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    EnumSet<LoadFlag> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    EnumSet<LoadFlag> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    enum SaveFlag {

        // isComment
        CACHE,
        // isComment
        DB
    }

    @NonNull
    EnumSet<SaveFlag> isVariable = isNameExpr.isMethod(SaveFlag.class);

    enum RemoveFlag {

        // isComment
        CACHE,
        // isComment
        DB,
        // isComment
        OWN_WAYPOINTS_ONLY_FOR_TESTING
    }

    @NonNull
    EnumSet<RemoveFlag> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
}
