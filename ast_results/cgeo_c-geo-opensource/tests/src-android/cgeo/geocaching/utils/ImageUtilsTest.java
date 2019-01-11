// isComment
package cgeo.geocaching.utils;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.test.AbstractResourceInstrumentationTestCase;
import cgeo.geocaching.test.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class isClassOrIsInterface extends AbstractResourceInstrumentationTestCase {

    private static final String isVariable = "isStringConstant";

    public void isMethod() throws IOException {
        final ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod(isIntegerConstant);
        final InputStream isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        final byte[] isVariable = new byte[isIntegerConstant];
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod("isStringConstant").isMethod(isNameExpr);
    }
}
