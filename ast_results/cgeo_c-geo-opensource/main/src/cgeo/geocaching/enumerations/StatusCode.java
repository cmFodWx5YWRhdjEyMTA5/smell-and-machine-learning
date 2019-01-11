// isComment
package cgeo.geocaching.enumerations;

import android.content.res.Resources;
import android.support.annotation.StringRes;
import android.support.annotation.NonNull;
import cgeo.geocaching.R;

public enum StatusCode {

    NO_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOG_SAVED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOGIN_PARSE_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CONNECTION_FAILED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CONNECTION_FAILED_EC(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CONNECTION_FAILED_GK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NO_LOGIN_INFO_STORED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNKNOWN_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    COMMUNICATION_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WRONG_LOGIN_DATA(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNAPPROVED_LICENSE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNVALIDATED_ACCOUNT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNPUBLISHED_CACHE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CACHE_NOT_FOUND(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PREMIUM_ONLY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MAINTENANCE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOG_POST_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOG_POST_ERROR_EC(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOG_POST_ERROR_GK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NO_LOG_TEXT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NOT_LOGGED_IN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOGIMAGE_POST_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    @StringRes
    private final int isVariable;

    isConstructor(@StringRes final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @StringRes
    public int isMethod() {
        return isNameExpr;
    }

    @NonNull
    public String isMethod(final Resources isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
