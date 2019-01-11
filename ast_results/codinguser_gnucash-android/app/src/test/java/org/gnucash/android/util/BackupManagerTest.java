// isComment
package org.gnucash.android.util;

import org.gnucash.android.R;
import org.gnucash.android.app.GnuCashApplication;
import org.gnucash.android.db.adapter.BooksDbAdapter;
import org.gnucash.android.importer.GncXmlImporter;
import org.gnucash.android.test.unit.testutil.ShadowCrashlytics;
import org.gnucash.android.test.unit.testutil.ShadowUserVoice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.xml.sax.SAXException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import static org.assertj.core.api.Assertions.assertThat;

// isComment
@RunWith(RobolectricTestRunner.class)
@Config(sdk = isIntegerConstant, packageName = "isStringConstant", shadows = { ShadowCrashlytics.class, ShadowUserVoice.class })
public class isClassOrIsInterface {

    private BooksDbAdapter isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod();
        for (String isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        }
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        String isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
    }

    /**
     * isComment
     */
    private String isMethod() {
        try {
            return isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } catch (ParserConfigurationException | SAXException | IOException isParameter) {
            isNameExpr.isMethod();
            throw new RuntimeException("isStringConstant");
        }
    }
}
