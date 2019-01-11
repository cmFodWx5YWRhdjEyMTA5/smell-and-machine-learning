// isComment
package li.klass.fhem.util;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import static li.klass.fhem.util.ValueExtractUtil.extractLeadingDouble;
import static li.klass.fhem.util.ValueExtractUtil.extractLeadingInt;
import static li.klass.fhem.util.ValueExtractUtil.extractLeadingNumericText;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface {

    @DataProvider
    public static Object[][] isMethod() {
        return new Object[][] { { "isStringConstant", -isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", isIntegerConstant, "isStringConstant" }, { "isStringConstant", -isIntegerConstant, "isStringConstant" }, { "isStringConstant", -isIntegerConstant, "isStringConstant" } };
    }

    @Test
    @UseDataProvider("isStringConstant")
    public void isMethod(String isParameter, int isParameter, String isParameter) {
        // isComment
        String isVariable = isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod(isIntegerConstant);
        isMethod(isMethod("isStringConstant")).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod(isDoubleConstant, isMethod(isDoubleConstant));
        isMethod(isMethod("isStringConstant")).isMethod(isDoubleConstant, isMethod(isDoubleConstant));
    }
}
