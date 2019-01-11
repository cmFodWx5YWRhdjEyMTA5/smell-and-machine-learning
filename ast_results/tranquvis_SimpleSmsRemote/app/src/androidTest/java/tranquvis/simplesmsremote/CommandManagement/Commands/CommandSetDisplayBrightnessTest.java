// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import org.junit.Test;
import tranquvis.simplesmsremote.Utils.Device.DisplayUtils;
import static tranquvis.simplesmsremote.CommandManagement.Commands.CommandSetDisplayBrightness.PARAM_BRIGHTNESS_MODE;
import static tranquvis.simplesmsremote.CommandManagement.Commands.CommandSetDisplayBrightness.PARAM_BRIGHTNESS_VALUE;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommandTest {

    @Override
    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant").isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod("isStringConstant").isMethod().isMethod(isNameExpr, isDoubleConstant);
        isMethod("isStringConstant").isMethod().isMethod(isNameExpr, isDoubleConstant);
        isMethod("isStringConstant").isMethod().isMethod(isNameExpr, isDoubleConstant);
    }

    @Override
    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant").isMethod().isMethod();
        isMethod("isStringConstant").isMethod().isMethod();
        isMethod("isStringConstant").isMethod().isMethod();
        isMethod(isMethod("isStringConstant", isDoubleConstant)).isMethod().isMethod();
    }
}
