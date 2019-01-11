// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.common.Constants.HTML;
import net.bible.service.common.Logger;
import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OSISUtil2;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler.PassageInfo;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler.VerseInfo;
import org.apache.commons.lang3.StringUtils;
import org.crosswire.jsword.book.OSISUtil;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface implements OsisTagHandler {

    private HtmlTextWriter isVariable;

    @SuppressWarnings("isStringConstant")
    private OsisToHtmlParameters isVariable;

    private PassageInfo isVariable;

    private VerseInfo isVariable;

    private static final String isVariable = "isStringConstant";

    private static final Logger isVariable = new Logger("isStringConstant");

    public isConstructor(OsisToHtmlParameters isParameter, PassageInfo isParameter, VerseInfo isParameter, HtmlTextWriter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
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
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            switch(isNameExpr) {
                case "isStringConstant":
                case "isStringConstant":
                    if (isNameExpr.isFieldAccessExpr) {
                        // isComment
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                    }
                    break;
                case "isStringConstant":
                    String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                    break;
                default:
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr);
                    break;
            }
        }
    }

    @Override
    public void isMethod() {
    }
}
