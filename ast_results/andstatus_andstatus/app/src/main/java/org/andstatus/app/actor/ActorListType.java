// isComment
package org.andstatus.app.actor;

import android.content.Context;
import android.support.annotation.StringRes;
import org.andstatus.app.R;
import org.andstatus.app.timeline.ListScope;
import java.util.Arrays;

/**
 * isComment
 */
public enum ActorListType {

    UNKNOWN("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr),
    /**
     * isComment
     */
    ACTORS_OF_NOTE("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr),
    FOLLOWERS("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    FRIENDS("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    ACTORS_AT_ORIGIN("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    private final String isVariable;

    @StringRes
    private final int isVariable;

    @StringRes
    private final int isVariable;

    public final ListScope isVariable;

    isConstructor(String isParameter, int isParameter, int isParameter, ListScope isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr;
    }

    /**
     * isComment
     */
    public CharSequence isMethod(Context isParameter) {
        if (isNameExpr == isIntegerConstant || isNameExpr == null) {
            return this.isFieldAccessExpr;
        } else {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    public CharSequence isMethod(Context isParameter, Object... isParameter) {
        if (isNameExpr == isIntegerConstant || isNameExpr == null) {
            return isMethod(isNameExpr) + "isStringConstant" + (isNameExpr.isFieldAccessExpr == isIntegerConstant ? isNameExpr[isIntegerConstant] : isNameExpr.isMethod(isNameExpr));
        } else {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr);
        }
    }

    /**
     * isComment
     */
    public static ActorListType isMethod(String isParameter) {
        for (ActorListType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }
}
