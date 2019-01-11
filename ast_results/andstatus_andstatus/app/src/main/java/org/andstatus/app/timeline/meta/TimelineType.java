// isComment
package org.andstatus.app.timeline.meta;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import org.andstatus.app.R;
import org.andstatus.app.database.table.FriendshipTable;
import org.andstatus.app.lang.SelectableEnum;
import org.andstatus.app.net.social.Connection;
import org.andstatus.app.notification.NotificationEventType;
import org.andstatus.app.timeline.ListScope;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.ACTOR_TIMELINE;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.DUMMY_API;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.GET_FOLLOWERS;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.GET_FRIENDS;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.HOME_TIMELINE;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.LIKED_TIMELINE;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.NOTIFICATIONS_TIMELINE;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.PRIVATE_NOTES;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.PUBLIC_TIMELINE;
import static org.andstatus.app.net.social.Connection.ApiRoutineEnum.SEARCH_NOTES;

public enum TimelineType implements SelectableEnum {

    UNKNOWN(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    /**
     * isComment
     */
    HOME(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    UNREAD_NOTIFICATIONS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    /**
     * isComment
     */
    INTERACTIONS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    FAVORITES(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    /**
     * isComment
     */
    SENT(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr),
    /**
     * isComment
     */
    FRIENDS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr),
    FOLLOWERS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr),
    PUBLIC(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    /**
     * isComment
     */
    EVERYTHING(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    SEARCH(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    PRIVATE(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    NOTIFICATIONS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    DRAFTS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    OUTBOX(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    ACTORS(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    CONVERSATION(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    COMMANDS_QUEUE(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr),
    MANAGE_TIMELINES(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr);

    /**
     * isComment
     */
    private final String isVariable;

    @StringRes
    private final int isVariable;

    @StringRes
    public final int isVariable;

    /**
     * isComment
     */
    private final Connection.ApiRoutineEnum isVariable;

    public final ListScope isVariable;

    isConstructor(ListScope isParameter, String isParameter, @StringRes int isParameter, @StringRes int isParameter, Connection.ApiRoutineEnum isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public static TimelineType isMethod(String isParameter) {
        for (TimelineType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public static Set<TimelineType> isMethod() {
        return isNameExpr;
    }

    public static Set<TimelineType> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static TimelineType isMethod(NotificationEventType isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            default:
                return isNameExpr;
        }
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

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
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

    public boolean isMethod() {
        return isMethod() != isNameExpr;
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    public boolean isMethod() {
        return this != isNameExpr && isMethod();
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    private static final Set<TimelineType> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr).isMethod(isNameExpr.isMethod());

    private static final Set<TimelineType> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isNameExpr.isMethod());

    public boolean isMethod() {
        return isNameExpr == isNameExpr.isFieldAccessExpr;
    }

    public boolean isMethod() {
        return isNameExpr == isNameExpr.isFieldAccessExpr;
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            case isNameExpr:
            default:
                return true;
        }
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    public Connection.ApiRoutineEnum isMethod() {
        return isNameExpr;
    }
}
