// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.common.Constants.HTML;
import net.bible.service.common.Logger;
import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler.PassageInfo;
import org.crosswire.jsword.book.OSISUtil;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface implements OsisTagHandler {

    private PassageInfo isVariable;

    private HtmlTextWriter isVariable;

    @SuppressWarnings("isStringConstant")
    private OsisToHtmlParameters isVariable;

    @SuppressWarnings("isStringConstant")
    private static final Logger isVariable = new Logger("isStringConstant");

    public isConstructor(OsisToHtmlParameters isParameter, PassageInfo isParameter, HtmlTextWriter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Attributes isParameter) {
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod() {
    }
}
