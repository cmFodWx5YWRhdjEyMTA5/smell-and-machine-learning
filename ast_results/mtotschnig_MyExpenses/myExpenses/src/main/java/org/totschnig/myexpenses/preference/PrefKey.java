// isComment
package org.totschnig.myexpenses.preference;

import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;

// isComment
public enum PrefKey {

    ROOT_SCREEN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CATEGORIES_SORT_BY_USAGES_LEGACY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SORT_ORDER_LEGACY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SORT_ORDER_TEMPLATES("isStringConstant"),
    SORT_ORDER_CATEGORIES("isStringConstant"),
    SORT_ORDER_ACCOUNTS("isStringConstant"),
    PERFORM_SHARE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SHARE_TARGET(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UI_THEME_KEY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UI_FONTSIZE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    BACKUP(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    RESTORE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    IMPORT_QIF(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    IMPORT_CSV(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    RESTORE_LEGACY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CONTRIB_PURCHASE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LICENCE_LEGACY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NEW_LICENCE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LICENCE_EMAIL("isStringConstant"),
    PROTECTION_LEGACY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PERFORM_PROTECTION_SCREEN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SET_PASSWORD(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SECURITY_ANSWER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SECURITY_QUESTION(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PROTECTION_DELAY_SECONDS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PROTECTION_ENABLE_ACCOUNT_WIDGET(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PROTECTION_ENABLE_TEMPLATE_WIDGET(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PROTECTION_ENABLE_DATA_ENTRY_FROM_WIDGET(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    EXPORT_FORMAT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SEND_FEEDBACK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MORE_INFO_DIALOG(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SHORTCUT_CREATE_TRANSACTION(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SHORTCUT_CREATE_TRANSFER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SHORTCUT_CREATE_SPLIT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PLANNER_CALENDAR_ID(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    RATE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UI_LANGUAGE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    APP_DIR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CATEGORY_CONTRIB(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CATEGORY_MANAGE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CATEGORY_PRIVACY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ACCOUNT_GROUPING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PLANNER_CALENDAR_PATH("isStringConstant"),
    CURRENT_VERSION("isStringConstant"),
    FIRST_INSTALL_VERSION("isStringConstant"),
    CURRENT_ACCOUNT("isStringConstant"),
    PLANNER_LAST_EXECUTION_TIMESTAMP("isStringConstant"),
    APP_FOLDER_WARNING_SHOWN("isStringConstant"),
    AUTO_FILL_LEGACY("isStringConstant"),
    AUTO_FILL_ACCOUNT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_FILL_AMOUNT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_FILL_CATEGORY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_FILL_COMMENT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_FILL_METHOD(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_FILL_HINT_SHOWN("isStringConstant"),
    TEMPLATE_CLICK_DEFAULT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    TEMPLATE_CLICK_HINT_SHOWN("isStringConstant"),
    NEXT_REMINDER_RATE("isStringConstant"),
    NEXT_REMINDER_CONTRIB("isStringConstant"),
    DISTRIBUTION_SHOW_CHART("isStringConstant"),
    DISTRIBUTION_AGGREGATE_TYPES("isStringConstant"),
    MANAGE_STALE_IMAGES(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CSV_IMPORT_HEADER_TO_FIELD_MAP(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CUSTOM_DECIMAL_FORMAT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_BACKUP(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_BACKUP_TIME(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_BACKUP_DIRTY("isStringConstant"),
    AUTO_BACKUP_CLOUD(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTO_BACKUP_INFO(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UI_HOME_SCREEN_SHORTCUTS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CALENDAR_PERMISSION_REQUESTED("isStringConstant"),
    STORAGE_PERMISSION_REQUESTED("isStringConstant"),
    GROUPING_START_SCREEN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    GROUP_WEEK_STARTS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    GROUP_MONTH_STARTS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NEW_PLAN_ENABLED("isStringConstant"),
    INTERSTITIAL_LAST_SHOWN("isStringConstant"),
    ENTRIES_CREATED_SINCE_LAST_INTERSTITIAL("isStringConstant"),
    NEW_ACCOUNT_ENABLED("isStringConstant"),
    NEW_SPLIT_TEMPLATE_ENABLED("isStringConstant"),
    SYNC_FREQUCENCY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SYNC_UPSELL_NOTIFICATION_SHOWN("isStringConstant"),
    MANAGE_SYNC_BACKENDS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    TRACKING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WEBDAV_TIMEOUT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DEBUG_SCREEN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DEBUG_LOGGING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SYNC_NOTIFICATION(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SYNC_WIFI_ONLY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LICENCE_MIGRATION_INFO_SHOWN("isStringConstant"),
    DEBUG_ADS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PROTECTION_DEVICE_LOCK_SCREEN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    HISTORY_SHOW_BALANCE("isStringConstant"),
    HISTORY_SHOW_TOTALS("isStringConstant"),
    HISTORY_INCLUDE_TRANSFERS("isStringConstant"),
    ROADMAP_VOTE("isStringConstant"),
    ROADMAP_VERSION("isStringConstant"),
    CRASHREPORT_ENABLED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CRASHREPORT_USEREMAIL(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    HOME_CURRENCY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LAST_ORIGINAL_CURRENCY("isStringConstant"),
    TRANSACTION_WITH_TIME(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    TRANSACTION_WITH_VALUE_DATE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    TRANSACTION_LAST_ACCOUNT_FROM_WIDGET("isStringConstant"),
    TRANSFER_LAST_ACCOUNT_FROM_WIDGET("isStringConstant"),
    TRANSFER_LAST_TRANSFER_ACCOUNT_FROM_WIDGET("isStringConstant"),
    SPLIT_LAST_ACCOUNT_FROM_WIDGET("isStringConstant"),
    PROFESSIONAL_EXPIRATION_REMINDER_LAST_SHOWN("isStringConstant"),
    PROFESSIONAL_UPSELL_SNACKBAR_SHOWN("isStringConstant"),
    PERSONALIZED_AD_CONSENT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SCROLL_TO_CURRENT_DATE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    int isVariable = isIntegerConstant;

    String isVariable = null;

    @Deprecated
    public String isMethod() {
        return isNameExpr == isIntegerConstant ? isNameExpr : isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Deprecated
    public String isMethod(String isParameter) {
        return isNameExpr.isMethod().isMethod().isMethod(isMethod(), isNameExpr);
    }

    @Deprecated
    public void isMethod(String isParameter) {
        isNameExpr.isMethod().isMethod().isMethod().isMethod(isMethod(), isNameExpr).isMethod();
    }

    @Deprecated
    public boolean isMethod(boolean isParameter) {
        return isNameExpr.isMethod().isMethod().isMethod(isMethod(), isNameExpr);
    }

    @Deprecated
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod().isMethod().isMethod().isMethod(isMethod(), isNameExpr).isMethod();
    }

    @Deprecated
    public int isMethod(int isParameter) {
        return isNameExpr.isMethod().isMethod().isMethod(isMethod(), isNameExpr);
    }

    @Deprecated
    public void isMethod(int isParameter) {
        isNameExpr.isMethod().isMethod().isMethod().isMethod(isMethod(), isNameExpr).isMethod();
    }

    @Deprecated
    public long isMethod(long isParameter) {
        return isNameExpr.isMethod().isMethod().isMethod(isMethod(), isNameExpr);
    }

    @Deprecated
    public void isMethod(long isParameter) {
        isNameExpr.isMethod().isMethod().isMethod().isMethod(isMethod(), isNameExpr).isMethod();
    }

    @Deprecated
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod().isMethod(isMethod()).isMethod();
    }

    @Deprecated
    public boolean isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isMethod());
    }

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
