// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod();
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod();
        isMethod(isMethod(isNameExpr, "isStringConstant")).isMethod("isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
