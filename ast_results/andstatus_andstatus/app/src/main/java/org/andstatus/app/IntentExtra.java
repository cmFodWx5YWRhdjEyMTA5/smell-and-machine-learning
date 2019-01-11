// isComment
package org.andstatus.app;

import org.andstatus.app.account.MyAccount;
import org.andstatus.app.appwidget.MyAppWidgetProvider;
import org.andstatus.app.data.ParsedUri;
import org.andstatus.app.service.MyService;
import org.andstatus.app.service.MyServiceState;
import org.andstatus.app.timeline.meta.TimelineType;

/**
 * isComment
 */
public enum IntentExtra {

    /**
     * isComment
     */
    COMMAND("isStringConstant"),
    COMMAND_DESCRIPTION("isStringConstant"),
    REQUEST_CODE("isStringConstant"),
    /**
     * isComment
     */
    ITEM_ID("isStringConstant"),
    INSTANCE_ID("isStringConstant"),
    COMMAND_RESULT("isStringConstant"),
    /**
     * isComment
     */
    SERVICE_STATE("isStringConstant"),
    SERVICE_EVENT("isStringConstant"),
    PROGRESS_TEXT("isStringConstant"),
    /**
     * isComment
     */
    NOTE_TEXT("isStringConstant"),
    MEDIA_URI("isStringConstant"),
    /**
     * isComment
     */
    ACCOUNT_NAME("isStringConstant"),
    /**
     * isComment
     */
    ACTOR_ID("isStringConstant"),
    USERNAME("isStringConstant"),
    ORIGIN_ID("isStringConstant"),
    ORIGIN_NAME("isStringConstant"),
    ORIGIN_TYPE("isStringConstant"),
    /**
     * isComment
     */
    MENU_GROUP("isStringConstant"),
    /**
     * isComment
     */
    PREFERENCE_KEY("isStringConstant"),
    PREFERENCE_VALUE("isStringConstant"),
    /**
     * isComment
     */
    IN_REPLY_TO_ID("isStringConstant"),
    /**
     * isComment
     */
    RECIPIENT_ID("isStringConstant"),
    SEARCH_QUERY("isStringConstant"),
    /**
     * isComment
     */
    NUM_TWEETS("isStringConstant"),
    /**
     * isComment
     */
    MATCHED_URI("isStringConstant"),
    /**
     * isComment
     */
    TIMELINE_TYPE("isStringConstant"),
    TIMELINE_ID("isStringConstant"),
    SELECTABLE_ENUM("isStringConstant"),
    /**
     * isComment
     */
    TIMELINE_IS_COMBINED("isStringConstant"),
    ROWS_LIMIT("isStringConstant"),
    POSITION_RESTORED("isStringConstant"),
    WHICH_PAGE("isStringConstant"),
    COMMAND_ID("isStringConstant"),
    CREATED_DATE("isStringConstant"),
    LAST_EXECUTED_DATE("isStringConstant"),
    EXECUTION_COUNT("isStringConstant"),
    FINISH("isStringConstant"),
    RETRIES_LEFT("isStringConstant"),
    NUM_AUTH_EXCEPTIONS("isStringConstant"),
    NUM_IO_EXCEPTIONS("isStringConstant"),
    NUM_PARSE_EXCEPTIONS("isStringConstant"),
    ERROR_MESSAGE("isStringConstant"),
    DOWNLOADED_COUNT("isStringConstant"),
    IN_FOREGROUND("isStringConstant"),
    MANUALLY_LAUNCHED("isStringConstant"),
    IS_STEP("isStringConstant"),
    CHAINED_REQUEST("isStringConstant"),
    COLLAPSE_DUPLICATES("isStringConstant"),
    SYNC("isStringConstant"),
    CHECK_DATA("isStringConstant"),
    FULL_CHECK("isStringConstant"),
    COUNT_ONLY("isStringConstant"),
    UNKNOWN("isStringConstant");

    public final String isVariable;

    isConstructor(String isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr;
    }
}
