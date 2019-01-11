// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import li.klass.fhem.domain.setlist.typeEntry.GroupSetListEntry;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        GroupSetListEntry isVariable = (GroupSetListEntry) isNameExpr.isMethod().isMethod("isStringConstant", true);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        GroupSetListEntry isVariable = (GroupSetListEntry) isNameExpr.isMethod().isMethod("isStringConstant", true);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
