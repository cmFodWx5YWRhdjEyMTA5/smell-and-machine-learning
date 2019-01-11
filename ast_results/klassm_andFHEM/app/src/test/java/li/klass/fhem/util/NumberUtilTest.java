// isComment
package li.klass.fhem.util;

import org.junit.Test;
import static li.klass.fhem.util.NumberUtil.isDecimalNumber;
import static li.klass.fhem.util.NumberUtil.toTwoDecimalDigits;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isMethod(isIntegerConstant)).isMethod("isStringConstant");
        isMethod(isMethod(isIntegerConstant)).isMethod("isStringConstant");
        isMethod(isMethod(isIntegerConstant)).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod();
        isMethod(isMethod("isStringConstant")).isMethod();
        isMethod(isMethod("isStringConstant")).isMethod();
    }
}
