// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import li.klass.fhem.testsuite.category.DeviceTestBase;
import static org.assertj.core.api.Assertions.assertThat;

@Category(DeviceTestBase.class)
public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
