// isComment
package tranquvis.simplesmsremote.Utils;

import org.junit.Test;
import tranquvis.simplesmsremote.AppContextTest;
import tranquvis.simplesmsremote.Aspects.ExecSequentially.ExecSequentially;
import tranquvis.simplesmsremote.Utils.Device.DisplayUtils;
import static org.junit.Assert.assertTrue;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppContextTest {

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        float isVariable = (int) isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr) == isIntegerConstant);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        float isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr >= isIntegerConstant && isNameExpr <= isIntegerConstant);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr) == isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        int isVariable = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr == isNameExpr);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        // isComment
        if (isMethod())
            return;
        isNameExpr.isMethod(isNameExpr);
        isMethod(!isNameExpr.isMethod(isNameExpr));
    }

    @Test
    @ExecSequentially("isStringConstant")
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
    }
}
