// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import li.klass.fhem.update.backend.xmllist.XmlListDevice;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        XmlListDevice isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        XmlListDevice isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", true)).isMethod("isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
