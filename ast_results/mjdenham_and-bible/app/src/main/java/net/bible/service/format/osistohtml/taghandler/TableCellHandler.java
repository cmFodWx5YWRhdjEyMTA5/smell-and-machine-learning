// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import org.crosswire.jsword.book.OSISUtil;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface implements OsisTagHandler {

    private HtmlTextWriter isVariable;

    public isConstructor(HtmlTextWriter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Attributes isParameter) {
        isNameExpr.isMethod("isStringConstant");
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }
}
