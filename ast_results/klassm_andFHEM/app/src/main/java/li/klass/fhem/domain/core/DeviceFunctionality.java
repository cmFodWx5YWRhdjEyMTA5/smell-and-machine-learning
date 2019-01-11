// isComment
package li.klass.fhem.domain.core;

import android.content.Context;
import li.klass.fhem.R;

public enum DeviceFunctionality {

    SWITCH(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DIMMER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WEATHER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    HEATING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    TEMPERATURE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NETWORK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    USAGE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WINDOW(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    SMOKE_DETECTOR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    FILL_STATE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    MOTION_DETECTOR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    KEY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    NOTIFY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DUMMY(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CALL_MONITOR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    FHEM(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOG(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    FLOORPLAN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    REMOTE_CONTROL(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    WEB_LINK(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNKNOWN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    PRESENCE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
