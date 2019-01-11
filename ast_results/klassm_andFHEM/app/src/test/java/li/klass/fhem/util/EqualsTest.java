// isComment
package li.klass.fhem.util;

import org.junit.Test;
import static li.klass.fhem.util.Equals.ignoreCaseEither;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod(null, (String[]) null), isMethod(true));
        isMethod(isMethod(null, "isStringConstant"), isMethod(true));
        isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod(true));
        isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod(true));
        isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod(true));
    }
}
