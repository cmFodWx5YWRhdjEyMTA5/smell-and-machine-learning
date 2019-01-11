// isComment
package net.bible.service.format.osistohtml.taghandler;

import java.util.HashSet;
import java.util.Set;
import net.bible.service.common.Logger;
import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.osishandlers.OsisToHtmlSaxHandler.VerseInfo;
import org.crosswire.jsword.passage.Key;
import org.crosswire.jsword.passage.KeyUtil;
import org.crosswire.jsword.passage.Verse;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface implements OsisTagHandler {

    private Set<Integer> isVariable = new HashSet<Integer>();

    private OsisToHtmlParameters isVariable;

    private VerseInfo isVariable;

    private HtmlTextWriter isVariable;

    @SuppressWarnings("isStringConstant")
    private static final Logger isVariable = new Logger("isStringConstant");

    public isConstructor(OsisToHtmlParameters isParameter, VerseInfo isParameter, HtmlTextWriter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        isNameExpr.isMethod();
        if (isNameExpr.isMethod() != null) {
            for (Key isVariable : isNameExpr.isMethod()) {
                Verse isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        }
    }

    public String isMethod() {
        return "isStringConstant";
    }

    /**
     * isComment
     */
    public void isMethod(Attributes isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod()) {
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod("isStringConstant");
            }
        }
    }

    public void isMethod() {
    }
}
