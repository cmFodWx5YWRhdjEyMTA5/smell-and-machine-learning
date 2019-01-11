// isComment
package net.bible.service.format.osistohtml.taghandler;

import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface implements OsisTagHandler {

    public isConstructor(OsisToHtmlParameters isParameter, HtmlTextWriter isParameter) {
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(Attributes isParameter) {
    }

    @Override
    public void isMethod() {
    }
}
