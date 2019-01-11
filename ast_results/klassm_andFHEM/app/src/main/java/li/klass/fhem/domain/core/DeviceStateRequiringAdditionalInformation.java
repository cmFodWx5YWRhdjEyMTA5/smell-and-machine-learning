// isComment
package li.klass.fhem.domain.core;

import java.util.Locale;
import static li.klass.fhem.domain.core.DeviceStateAdditionalInformationType.ANY;
import static li.klass.fhem.domain.core.DeviceStateAdditionalInformationType.NUMERIC;
import static li.klass.fhem.domain.core.DeviceStateAdditionalInformationType.SECONDS;
import static li.klass.fhem.domain.core.DeviceStateAdditionalInformationType.TEMPERATURE;
import static li.klass.fhem.domain.core.DeviceStateAdditionalInformationType.TIME;

public enum DeviceStateRequiringAdditionalInformation {

    PCT("isStringConstant", isNameExpr),
    VALVE("isStringConstant", isNameExpr),
    FACTORS("isStringConstant", isNameExpr),
    DESIRED("isStringConstant", isNameExpr),
    ON_FOR_TIMER("isStringConstant", isNameExpr),
    OFF_FOR_TIMER("isStringConstant", isNameExpr),
    ON_TILL("isStringConstant", isNameExpr),
    OFF_TILL("isStringConstant", isNameExpr),
    RAMP_ON_TIME("isStringConstant", isNameExpr),
    RAMP_OFF_TIME("isStringConstant", isNameExpr),
    DAY("isStringConstant", isNameExpr),
    POWER("isStringConstant", isNameExpr),
    INPUT("isStringConstant", isNameExpr),
    AUDIO("isStringConstant", isNameExpr),
    DAY_TEMP("isStringConstant", isNameExpr),
    DESIRED_TEMP("isStringConstant", isNameExpr),
    GENERAL_TEMP("isStringConstant", isNameExpr),
    FRI_FROM1("isStringConstant", isNameExpr),
    FRI_FROM2("isStringConstant", isNameExpr),
    FRI_TO1("isStringConstant", isNameExpr),
    FRI_TO2("isStringConstant", isNameExpr),
    HOLIDAY1("isStringConstant", isNameExpr),
    HOUR("isStringConstant", isNameExpr),
    LOWTEMP_OFFSET("isStringConstant", isNameExpr),
    MANU_TEMP("isStringConstant", isNameExpr),
    MINUTE("isStringConstant", isNameExpr),
    MODE("isStringConstant", isNameExpr),
    MON_FROM1("isStringConstant", isNameExpr),
    MON_FROM2("isStringConstant", isNameExpr),
    MON_TO1("isStringConstant", isNameExpr),
    MON_TO2("isStringConstant", isNameExpr),
    MONTH("isStringConstant", isNameExpr),
    NIGHT_TEMP("isStringConstant", isNameExpr),
    SAT_FROM1("isStringConstant", isNameExpr),
    SAT_FROM2("isStringConstant", isNameExpr),
    SAT_TO1("isStringConstant", isNameExpr),
    SAT_TO2("isStringConstant", isNameExpr),
    SUN_FROM1("isStringConstant", isNameExpr),
    SUN_FROM2("isStringConstant", isNameExpr),
    SUN_TO1("isStringConstant", isNameExpr),
    SUN_TO2("isStringConstant", isNameExpr),
    THU_FROM1("isStringConstant", isNameExpr),
    THU_FROM2("isStringConstant", isNameExpr),
    THU_TO1("isStringConstant", isNameExpr),
    THU_TO2("isStringConstant", isNameExpr),
    TUE_FROM1("isStringConstant", isNameExpr),
    TUE_FROM2("isStringConstant", isNameExpr),
    TUE_TO1("isStringConstant", isNameExpr),
    TUE_TO2("isStringConstant", isNameExpr),
    WED_FROM1("isStringConstant", isNameExpr),
    WED_FROM2("isStringConstant", isNameExpr),
    WED_TO1("isStringConstant", isNameExpr),
    WED_TO2("isStringConstant", isNameExpr),
    WINDOWOPEN_TEMP("isStringConstant", isNameExpr),
    YEAR("isStringConstant", isNameExpr);

    private String isVariable = null;

    private DeviceStateAdditionalInformationType isVariable;

    isConstructor(String isParameter, DeviceStateAdditionalInformationType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public static DeviceStateRequiringAdditionalInformation isMethod(String isParameter) {
        if (isNameExpr == null)
            return null;
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        for (DeviceStateRequiringAdditionalInformation isVariable : isMethod()) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    public DeviceStateAdditionalInformationType isMethod() {
        return isNameExpr;
    }

    public static boolean isMethod(String isParameter) {
        return isMethod(isNameExpr) != null;
    }

    public static boolean isMethod(String isParameter, DeviceStateRequiringAdditionalInformation isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
    }
}
