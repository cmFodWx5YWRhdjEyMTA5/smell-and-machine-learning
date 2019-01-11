// isComment
package li.klass.fhem.util;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import static li.klass.fhem.util.ColorUtil.INSTANCE;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
    }

    private void isMethod(int isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        ColorUtil.XYColor isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr - isIntegerConstant, isNameExpr + isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr - isIntegerConstant, isNameExpr + isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr - isIntegerConstant, isNameExpr + isIntegerConstant);
    }

    @DataProvider
    public static Object[][] isMethod() {
        return new Object[][] { { "isStringConstant", isIntegerConstant }, { "isStringConstant", isIntegerConstant }, { "isStringConstant", isIntegerConstant }, { "isStringConstant", isIntegerConstant }, { "isStringConstant", isIntegerConstant }, { "isStringConstant", isIntegerConstant }, { "isStringConstant", isIntegerConstant } };
    }

    @UseDataProvider("isStringConstant")
    @Test
    public void isMethod(String isParameter, int isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
    }
}
