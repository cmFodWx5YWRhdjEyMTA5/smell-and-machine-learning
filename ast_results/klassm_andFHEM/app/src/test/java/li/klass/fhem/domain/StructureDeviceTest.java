// isComment
package li.klass.fhem.domain;

import org.junit.Test;
import li.klass.fhem.domain.core.DeviceXMLParsingBase;
import li.klass.fhem.domain.core.FhemDevice;
import li.klass.fhem.domain.setlist.SetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.GroupSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.SliderSetListEntry;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface extends DeviceXMLParsingBase {

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod("isStringConstant", "isStringConstant")).isMethod(true);
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod((GroupSetListEntry) isNameExpr.isMethod().isMethod("isStringConstant", true)).isMethod(new GroupSetListEntry("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"));
    }

    @Test
    public void isMethod() {
        FhemDevice isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        SetListEntry isVariable = isNameExpr.isMethod().isMethod("isStringConstant", true);
        isMethod(isNameExpr).isMethod(SliderSetListEntry.class);
        isMethod((SliderSetListEntry) isNameExpr).isMethod(new SliderSetListEntry("isStringConstant", isIntegerConstant, isIntegerConstant, isIntegerConstant));
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
