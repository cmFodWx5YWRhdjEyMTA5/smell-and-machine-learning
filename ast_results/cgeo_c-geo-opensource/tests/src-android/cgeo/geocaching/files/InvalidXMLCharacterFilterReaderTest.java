// isComment
package cgeo.geocaching.files;

import android.sax.EndTextElementListener;
import android.sax.RootElement;
import android.test.AndroidTestCase;
import android.util.Xml;
import java.io.StringReader;
import java.util.concurrent.atomic.AtomicReference;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends AndroidTestCase {

    public static void isMethod() throws Exception {
        final RootElement isVariable = new RootElement("isStringConstant");
        final AtomicReference<String> isVariable = new AtomicReference<>();
        isNameExpr.isMethod(new EndTextElementListener() {

            @Override
            public void isMethod(final String isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
        final StringReader isVariable = new StringReader("isStringConstant");
        isNameExpr.isMethod(new InvalidXMLCharacterFilterReader(isNameExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    public static void isMethod() throws Exception {
        final RootElement isVariable = new RootElement("isStringConstant");
        final AtomicReference<String> isVariable = new AtomicReference<>();
        isNameExpr.isMethod(new EndTextElementListener() {

            @Override
            public void isMethod(final String isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
        final StringReader isVariable = new StringReader("isStringConstant");
        isNameExpr.isMethod(new InvalidXMLCharacterFilterReader(isNameExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }
}
