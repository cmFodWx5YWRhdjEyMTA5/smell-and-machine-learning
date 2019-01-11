// isComment
package cgeo.geocaching.connector.ec;

import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
    }
}
