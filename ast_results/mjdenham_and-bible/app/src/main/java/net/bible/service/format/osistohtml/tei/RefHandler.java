// isComment
package net.bible.service.format.osistohtml.tei;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import net.bible.service.format.osistohtml.taghandler.NoteHandler;
import net.bible.service.format.osistohtml.taghandler.ReferenceHandler;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface extends ReferenceHandler {

    public isConstructor(OsisToHtmlParameters isParameter, NoteHandler isParameter, HtmlTextWriter isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Attributes isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }
}
