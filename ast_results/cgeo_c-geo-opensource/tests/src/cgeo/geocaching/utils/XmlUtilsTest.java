// isComment
package cgeo.geocaching.utils;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.org.kxml2.io.KXmlSerializer;
import java.io.IOException;
import java.io.StringWriter;
import org.apache.commons.lang3.CharEncoding;
import org.junit.Before;
import org.junit.Test;
import org.xmlpull.v1.XmlSerializer;

public class isClassOrIsInterface {

    private XmlSerializer isVariable;

    private StringWriter isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new StringWriter();
        isNameExpr = new KXmlSerializer();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod("isStringConstant");
    }

    private void isMethod(final String isParameter) throws IOException {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant" + isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod("isStringConstant");
    }
}
