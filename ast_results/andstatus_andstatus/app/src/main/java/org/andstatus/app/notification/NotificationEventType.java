// isComment
package org.andstatus.app.notification;

import android.support.annotation.NonNull;
import org.andstatus.app.R;
import org.andstatus.app.timeline.meta.TimelineType;
import org.andstatus.app.util.SharedPreferencesUtil;
import org.andstatus.app.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

/**
 * isComment
 */
public enum NotificationEventType {

    ANNOUNCE(isIntegerConstant, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    FOLLOW(isIntegerConstant, "isStringConstant", isMethod(), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LIKE(isIntegerConstant, "isStringConstant", isMethod(), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MENTION(isIntegerConstant, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    OUTBOX(isIntegerConstant, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr),
    PRIVATE(isIntegerConstant, "isStringConstant", isMethod(isNameExpr.isFieldAccessExpr), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SERVICE_RUNNING(isIntegerConstant, "isStringConstant", isMethod(), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    EMPTY(isIntegerConstant, "isStringConstant", isMethod(), true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    public static final List<NotificationEventType> isVariable = isMethod();

    public final long isVariable;

    public final String isVariable;

    final boolean isVariable;

    final List<TimelineType> isVariable;

    public final int isVariable;

    isConstructor(int isParameter, String isParameter, List<TimelineType> isParameter, boolean isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod(TimelineType isParameter) {
        if (this == isNameExpr)
            return true;
        switch(isNameExpr) {
            case isNameExpr:
            case isNameExpr:
                return true;
            case isNameExpr:
                return this != isNameExpr;
            case isNameExpr:
                return true;
            default:
                return isNameExpr.isMethod(isNameExpr);
        }
    }

    public int isMethod() {
        return (int) isNameExpr;
    }

    public static List<Long> isMethod(TimelineType isParameter) {
        return isMethod().isMethod().isMethod(isParameter -> isNameExpr.isMethod(isNameExpr)).isMethod(isParameter -> isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod());
    }

    public boolean isMethod() {
        return isNameExpr.isMethod(isNameExpr) ? isNameExpr.isMethod(isNameExpr, isNameExpr) : isNameExpr;
    }

    void isMethod(boolean isParameter) {
        if (isNameExpr.isMethod(isNameExpr))
            isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @NonNull
    public static NotificationEventType isMethod(long isParameter) {
        for (NotificationEventType isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    private static List<NotificationEventType> isMethod() {
        List<NotificationEventType> isVariable = new ArrayList<>();
        for (NotificationEventType isVariable : isMethod()) {
            if (isNameExpr != isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    public boolean isMethod() {
        return this == isNameExpr;
    }
}
