// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
