// isComment
package li.klass.fhem.util;

import org.junit.Test;
import static li.klass.fhem.util.NumberSystemUtil.hexToDecimal;
import static li.klass.fhem.util.NumberSystemUtil.hexToQuaternary;
import static li.klass.fhem.util.NumberSystemUtil.quaternaryToHex;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant", isIntegerConstant)).isMethod("isStringConstant");
        isMethod(isMethod("isStringConstant", isIntegerConstant)).isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isMethod("isStringConstant", isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod(isIntegerConstant);
        isMethod(isMethod("isStringConstant")).isMethod(isIntegerConstant);
        isMethod(isMethod("isStringConstant")).isMethod(isIntegerConstant);
        isMethod(isMethod("isStringConstant")).isMethod(isIntegerConstant);
    }
}
