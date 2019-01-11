// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        isMethod(isMethod(isNameExpr, "isStringConstant"), isMethod("isStringConstant"));
        isMethod(isMethod(isNameExpr, "isStringConstant"), isMethod("isStringConstant"));
        isMethod(isMethod(isNameExpr, "isStringConstant"), isMethod("isStringConstant"));
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
