// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.helpers.AttributesImpl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class isClassOrIsInterface {

    private HtmlTextWriter isVariable;

    private ListHandler isVariable;

    private ListItemHandler isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new HtmlTextWriter();
        isNameExpr = new ListHandler(isNameExpr);
        isNameExpr = new ListItemHandler(isNameExpr);
    }

    @Test
    public void isMethod() {
        AttributesImpl isVariable = new AttributesImpl();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
