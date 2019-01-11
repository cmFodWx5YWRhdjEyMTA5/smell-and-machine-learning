// isComment
package li.klass.fhem.domain.core;

import li.klass.fhem.connection.backend.ServerType;

public enum DeviceVisibility {

    FHEMWEB_ONLY(isNameExpr.isFieldAccessExpr), NEVER;

    private final ServerType isVariable;

    isConstructor() {
        this(null);
    }

    isConstructor(ServerType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public ServerType isMethod() {
        return isNameExpr;
    }
}
