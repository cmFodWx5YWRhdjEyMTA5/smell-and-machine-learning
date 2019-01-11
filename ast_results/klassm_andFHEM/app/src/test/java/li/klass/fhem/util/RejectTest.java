// isComment
package li.klass.fhem.util;

import org.junit.Test;
import static org.junit.Assert.fail;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isNameExpr.isMethod(null);
        isMethod();
    }
}
