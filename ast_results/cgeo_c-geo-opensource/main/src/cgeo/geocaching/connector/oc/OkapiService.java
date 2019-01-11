// isComment
package cgeo.geocaching.connector.oc;

import cgeo.geocaching.connector.oc.OCApiConnector.OAuthLevel;
import android.support.annotation.NonNull;

enum OkapiService {

    SERVICE_CACHE("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_SEARCH_AND_RETRIEVE("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_MARK_CACHE("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_SUBMIT_LOG("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_ADD_LOG_IMAGE("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_USER("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_USER_BY_USERNAME("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_UPLOAD_PERSONAL_NOTE("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_RESOLVE_URL("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_API_INSTALLATION("isStringConstant", isNameExpr.isFieldAccessExpr),
    SERVICE_LOG_ENTRY("isStringConstant", isNameExpr.isFieldAccessExpr);

    @NonNull
    final String isVariable;

    @NonNull
    final OAuthLevel isVariable;

    isConstructor(@NonNull final String isParameter, @NonNull final OAuthLevel isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }
}
