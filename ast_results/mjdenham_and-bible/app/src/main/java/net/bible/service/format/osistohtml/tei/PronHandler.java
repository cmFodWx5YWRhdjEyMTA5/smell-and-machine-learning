// isComment
package net.bible.service.format.osistohtml.tei;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.taghandler.HiHandler;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface extends HiHandler {

    private static final String isVariable = "isStringConstant";

    public isConstructor(OsisToHtmlParameters isParameter, HtmlTextWriter isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Attributes isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
    }
}
