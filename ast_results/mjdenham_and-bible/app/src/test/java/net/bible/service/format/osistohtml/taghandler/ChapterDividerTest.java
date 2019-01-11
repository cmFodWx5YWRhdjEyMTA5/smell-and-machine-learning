// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler;
import org.crosswire.jsword.book.OSISUtil;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.helpers.AttributesImpl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private OsisToHtmlParameters isVariable;

    private OsisToHtmlSaxHandler.VerseInfo isVariable;

    private HtmlTextWriter isVariable;

    private ChapterDivider isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new OsisToHtmlParameters();
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(true);
        isNameExpr = new OsisToHtmlSaxHandler.VerseInfo();
        isNameExpr = new HtmlTextWriter();
        isNameExpr = new ChapterDivider(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(null);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(null);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(null);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(null);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(null);
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isFieldAccessExpr = true;
        TitleHandler isVariable = new TitleHandler(isNameExpr, isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
