// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import org.junit.Test;
import java.util.Locale;
import tranquvis.simplesmsremote.Utils.UnitTools.Unit;
import static tranquvis.simplesmsremote.CommandManagement.Commands.CommandSetDisplayOffTimeout.PARAM_TIMEOUT_UNIT;
import static tranquvis.simplesmsremote.CommandManagement.Commands.CommandSetDisplayOffTimeout.PARAM_TIMEOUT_VALUE;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommandTest {

    @Override
    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant").isMethod().isMethod(isNameExpr, isDoubleConstant).isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isDoubleConstant)).isMethod().isMethod(isNameExpr, isDoubleConstant).isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant").isMethod().isMethod(isNameExpr, isDoubleConstant).isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isMethod("isStringConstant", isDoubleConstant)).isMethod().isMethod(isNameExpr, isDoubleConstant).isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isMethod("isStringConstant", isDoubleConstant)).isMethod().isMethod(isNameExpr, isDoubleConstant).isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant").isMethod().isMethod();
        isMethod("isStringConstant").isMethod().isMethod();
    }
}
