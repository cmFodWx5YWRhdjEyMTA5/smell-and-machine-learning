// isComment
package org.gnucash.android.test.unit.export;

import org.gnucash.android.R;
import org.gnucash.android.app.GnuCashApplication;
import org.gnucash.android.db.adapter.BooksDbAdapter;
import org.gnucash.android.export.ExportFormat;
import org.gnucash.android.export.ExportParams;
import org.gnucash.android.export.Exporter;
import org.gnucash.android.export.xml.GncXmlExporter;
import org.gnucash.android.importer.GncXmlImporter;
import org.gnucash.android.test.unit.testutil.ShadowCrashlytics;
import org.gnucash.android.test.unit.testutil.ShadowUserVoice;
import org.gnucash.android.util.BackupManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = isIntegerConstant, packageName = "isStringConstant", shadows = { ShadowCrashlytics.class, ShadowUserVoice.class })
public class isClassOrIsInterface {

    @Before
    public void isMethod() {
        isMethod();
    }

    @Test
    public void isMethod() throws Exporter.ExporterException {
        Exporter isVariable = new GncXmlExporter(new ExportParams(isNameExpr.isFieldAccessExpr));
        List<String> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isIntegerConstant);
        isMethod(new File(isNameExpr.isMethod(isIntegerConstant))).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isIntegerConstant));
    }

    /**
     * isComment
     */
    private void isMethod() {
        try {
            String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod().isMethod(isNameExpr);
        } catch (ParserConfigurationException | SAXException | IOException isParameter) {
            isNameExpr.isMethod();
            throw new RuntimeException("isStringConstant");
        }
    }
}
