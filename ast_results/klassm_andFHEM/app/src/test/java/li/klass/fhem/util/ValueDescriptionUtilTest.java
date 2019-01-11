// isComment
package li.klass.fhem.util;

import org.junit.Test;
import static li.klass.fhem.util.ValueDescriptionUtil.secondsToTimeString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isMethod(isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod(isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod(isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod(isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod(isIntegerConstant), isMethod("isStringConstant"));
        isMethod(isMethod(isIntegerConstant), isMethod("isStringConstant"));
    }
}
