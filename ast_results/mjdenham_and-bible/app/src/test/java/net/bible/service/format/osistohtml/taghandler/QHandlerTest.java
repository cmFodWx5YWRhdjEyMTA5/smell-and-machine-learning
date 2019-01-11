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

    private QHandler isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new OsisToHtmlParameters();
        isNameExpr = new HtmlTextWriter();
        isNameExpr = new QHandler(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, "isStringConstant", null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
