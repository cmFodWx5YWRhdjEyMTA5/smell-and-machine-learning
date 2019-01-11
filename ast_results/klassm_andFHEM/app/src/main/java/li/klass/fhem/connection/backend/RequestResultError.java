// isComment
package li.klass.fhem.connection.backend;

import li.klass.fhem.R;

public enum RequestResultError {

    HOST_CONNECTION_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    AUTHENTICATION_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CONNECTION_TIMEOUT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    INTERNAL_SERVER_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    BAD_REQUEST(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NOT_FOUND(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    INVALID_CONTENT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DEVICE_LIST_PARSE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    INTERNAL_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    public final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
