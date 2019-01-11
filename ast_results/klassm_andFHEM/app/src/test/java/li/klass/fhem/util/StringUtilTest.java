// isComment
package li.klass.fhem.util;

import org.junit.Test;
import static li.klass.fhem.util.StringUtil.endsWith;
import static li.klass.fhem.util.StringUtil.prefixPad;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        StringBuilder isVariable = new StringBuilder("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant"), isMethod(true));
        isMethod(isMethod(isNameExpr, "isStringConstant"), isMethod(true));
        isMethod(isMethod(isNameExpr, "isStringConstant"), isMethod(true));
        isMethod(isMethod(new StringBuilder("isStringConstant"), "isStringConstant"), isMethod(true));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant", "isStringConstant", isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod("isStringConstant", "isStringConstant", isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod(null, "isStringConstant", isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod("isStringConstant", "isStringConstant", isIntegerConstant), isMethod("isStringConstant"));
    }
}
