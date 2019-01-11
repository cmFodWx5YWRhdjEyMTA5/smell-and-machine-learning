// isComment
package github.daneren2005.dsub.service.parser;

import android.content.Context;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.domain.Lyrics;
import github.daneren2005.dsub.util.ProgressListener;
import org.xmlpull.v1.XmlPullParser;
import java.io.Reader;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public Lyrics isMethod(Reader isParameter, ProgressListener isParameter) throws Exception {
        isMethod(isNameExpr);
        Lyrics isVariable = null;
        int isVariable;
        do {
            isNameExpr = isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                String isVariable = isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr = new Lyrics();
                    isNameExpr.isMethod(isMethod("isStringConstant"));
                    isNameExpr.isMethod(isMethod("isStringConstant"));
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isMethod();
                }
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                if (isNameExpr != null && isNameExpr.isMethod() == null) {
                    isNameExpr.isMethod(isMethod());
                }
            }
        } while (isNameExpr != isNameExpr.isFieldAccessExpr);
        isMethod();
        return isNameExpr;
    }
}
