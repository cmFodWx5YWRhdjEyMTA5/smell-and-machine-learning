// isComment
package li.klass.fhem.domain.log;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import static com.tngtech.java.junit.dataprovider.DataProviders.$;
import static com.tngtech.java.junit.dataprovider.DataProviders.$$;
import static li.klass.fhem.domain.log.ConcernsDevicePredicate.extractConcerningDeviceRegexpFromDefinition;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface {

    @DataProvider
    public static Object[][] isMethod() {
        return isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant"));
    }

    @Test
    @UseDataProvider("isStringConstant")
    public void isMethod(String isParameter, String isParameter) {
        isMethod(isMethod(isNameExpr)).isMethod(isNameExpr);
    }
}
