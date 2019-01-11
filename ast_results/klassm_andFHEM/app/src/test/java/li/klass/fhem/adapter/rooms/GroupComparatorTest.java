// isComment
package li.klass.fhem.adapter.rooms;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Collections;
import java.util.List;
import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class isClassOrIsInterface {

    private static final String isVariable = "isStringConstant";

    @DataProvider
    public static Object[][] isMethod() {
        return new Object[][] { { isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant") }, { isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant") }, { isMethod("isStringConstant", "isStringConstant", isNameExpr), isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant") }, { isMethod(isNameExpr, "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant") }, { isMethod(isNameExpr, "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant") } };
    }

    @UseDataProvider("isStringConstant")
    @Test
    public void isMethod(List<String> isParameter, List<String> isParameter, List<String> isParameter) {
        // isComment
        GroupComparator isVariable = new GroupComparator(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
