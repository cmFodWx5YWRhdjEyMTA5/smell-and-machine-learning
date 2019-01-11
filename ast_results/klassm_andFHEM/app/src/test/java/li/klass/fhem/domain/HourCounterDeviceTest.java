// isComment
package li.klass.fhem.domain;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @DataProvider
    public static Object[][] isMethod() {
        return new Object[][] { { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" }, { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" } };
    }

    @Test
    @UseDataProvider("isStringConstant")
    public void isMethod(String isParameter, String isParameter, String isParameter, String isParameter, String isParameter, String isParameter) {
        FhemDevice isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod(isNameExpr);
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod(isNameExpr);
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod(isNameExpr);
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
