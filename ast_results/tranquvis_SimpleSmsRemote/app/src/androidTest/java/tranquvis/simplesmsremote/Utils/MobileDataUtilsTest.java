// isComment
package tranquvis.simplesmsremote.Utils;

import org.junit.Test;
import tranquvis.simplesmsremote.AppContextTest;
import tranquvis.simplesmsremote.Aspects.ExecSequentially.ExecSequentially;
import tranquvis.simplesmsremote.Utils.Device.MobileDataUtils;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppContextTest {

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, true);
        boolean isVariable = isMethod(new TryMethod<Boolean>() {

            @Override
            public Boolean isMethod() throws Exception {
                return isNameExpr.isMethod(isNameExpr);
            }
        }, true);
        isMethod(isNameExpr);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, true);
        boolean isVariable = isMethod(new TryMethod<Boolean>() {

            @Override
            public Boolean isMethod() throws Exception {
                return isNameExpr.isMethod(isNameExpr);
            }
        }, true);
        isMethod(isNameExpr);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
    }
}
