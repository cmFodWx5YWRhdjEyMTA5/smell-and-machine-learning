// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler.VerseInfo;
import org.crosswire.jsword.book.OSISUtil;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class isClassOrIsInterface {

    private OsisToHtmlParameters isVariable;

    private VerseInfo isVariable;

    private HtmlTextWriter isVariable;

    private TitleHandler isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new OsisToHtmlParameters();
        isNameExpr = new VerseInfo();
        isNameExpr = new HtmlTextWriter();
        isNameExpr = new TitleHandler(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        Attributes isVariable = new AttributesImpl();
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
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isFieldAccessExpr = true;
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
