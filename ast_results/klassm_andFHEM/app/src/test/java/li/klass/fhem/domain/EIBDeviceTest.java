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
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
    }

    private void isMethod(String isParameter, String isParameter) {
        FhemDevice isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
