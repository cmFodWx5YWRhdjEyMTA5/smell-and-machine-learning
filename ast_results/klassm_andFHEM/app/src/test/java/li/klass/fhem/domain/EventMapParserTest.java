// isComment
package li.klass.fhem.domain;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.HashMap;
import java.util.Map;
import static com.tngtech.java.junit.dataprovider.DataProviders.testForEach;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface {

    @DataProvider
    public static Object[][] isMethod() {
        return isMethod(new TestCase("isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant"), new TestCase("isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant"), new TestCase("isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant"));
    }

    @Test
    @UseDataProvider("isStringConstant")
    public void isMethod(TestCase isParameter) {
        Map<String, String> isVariable = isNameExpr.isFieldAccessExpr;
        Map<String, String> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    static class isClassOrIsInterface {

        private final String isVariable;

        private Map<String, String> isVariable = new HashMap<>();

        isConstructor(String isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        TestCase isMethod(String isParameter, String isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return this;
        }
    }
}
