// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler.VerseInfo;
import org.crosswire.jsword.book.OSISUtil;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.helpers.AttributesImpl;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class isClassOrIsInterface {

    private OsisToHtmlParameters isVariable;

    private VerseInfo isVariable;

    private BookmarkMarker isVariable;

    private MyNoteMarker isVariable;

    private HtmlTextWriter isVariable;

    private VerseHandler isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new OsisToHtmlParameters();
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = new VerseInfo();
        isNameExpr = isMethod(BookmarkMarker.class);
        isNameExpr = new MyNoteMarker(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = new HtmlTextWriter();
        isNameExpr = new VerseHandler(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
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
        isNameExpr.isFieldAccessExpr = true;
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(true);
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = true;
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
        isNameExpr.isFieldAccessExpr = true;
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(true);
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(null, null, isNameExpr.isFieldAccessExpr, null, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = true;
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
