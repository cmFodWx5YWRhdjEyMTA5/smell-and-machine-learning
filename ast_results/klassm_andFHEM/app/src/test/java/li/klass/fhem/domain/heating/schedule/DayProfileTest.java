// isComment
package li.klass.fhem.domain.heating.schedule;

import org.junit.Test;
import li.klass.fhem.domain.heating.schedule.configuration.FHTConfiguration;
import li.klass.fhem.domain.heating.schedule.interval.FromToHeatingInterval;
import li.klass.fhem.util.DayUtil;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        DayProfile<FromToHeatingInterval, FHTConfiguration> isVariable = new DayProfile<>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new FHTConfiguration());
        isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
    }
}
