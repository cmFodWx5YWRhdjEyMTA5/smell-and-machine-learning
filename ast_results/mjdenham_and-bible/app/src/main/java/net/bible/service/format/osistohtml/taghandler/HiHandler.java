// isComment
package net.bible.service.format.osistohtml.taghandler;

import static org.crosswire.jsword.book.OSISUtil.HI_ACROSTIC;
import static org.crosswire.jsword.book.OSISUtil.HI_BOLD;
import static org.crosswire.jsword.book.OSISUtil.HI_EMPHASIS;
import static org.crosswire.jsword.book.OSISUtil.HI_ILLUMINATED;
import static org.crosswire.jsword.book.OSISUtil.HI_ITALIC;
import static org.crosswire.jsword.book.OSISUtil.HI_LINETHROUGH;
import static org.crosswire.jsword.book.OSISUtil.HI_NORMAL;
import static org.crosswire.jsword.book.OSISUtil.HI_SMALL_CAPS;
import static org.crosswire.jsword.book.OSISUtil.HI_SUB;
import static org.crosswire.jsword.book.OSISUtil.HI_SUPER;
import static org.crosswire.jsword.book.OSISUtil.HI_UNDERLINE;
import java.util.Arrays;
import java.util.List;
import net.bible.service.format.osistohtml.HtmlTextWriter;
import net.bible.service.format.osistohtml.OsisToHtmlParameters;
import org.crosswire.jsword.book.OSISUtil;
import org.xml.sax.Attributes;

/**
 * isComment
 */
public class isClassOrIsInterface implements OsisTagHandler {

    // isComment
    private static final List<String> isVariable = isNameExpr.isMethod(new String[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr });

    private static final String isVariable = "isStringConstant";

    private HtmlTextWriter isVariable;

    public isConstructor(OsisToHtmlParameters isParameter, HtmlTextWriter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
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

    /**
     * isComment
     */
    protected void isMethod(String isParameter, String isParameter) {
        // isComment
        if (isNameExpr == null || !(isNameExpr.isMethod(isNameExpr) || isNameExpr.isMethod("isStringConstant"))) {
            isNameExpr = isNameExpr;
        }
        // isComment
        String isVariable = isMethod() + "isStringConstant" + isNameExpr;
        // isComment
        isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant");
    }
}
