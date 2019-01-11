// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import org.crosswire.jsword.book.OSISUtil;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.helpers.AttributesImpl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class isClassOrIsInterface {

    private OsisToHtmlParameters isVariable;

    private HtmlTextWriter isVariable;

    private HiHandler isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new OsisToHtmlParameters();
        isNameExpr = new HtmlTextWriter();
        isNameExpr = new HiHandler(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
