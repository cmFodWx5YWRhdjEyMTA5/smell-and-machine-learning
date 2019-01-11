// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    @SuppressWarnings("isStringConstant")
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Test
    @SuppressWarnings("isStringConstant")
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
