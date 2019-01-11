// isComment
package github.daneren2005.dsub.service.parser;

import android.content.Context;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.domain.MusicDirectory;
import github.daneren2005.dsub.util.ProgressListener;
import org.xmlpull.v1.XmlPullParser;
import java.io.Reader;

/**
 * isComment
 */
public class isClassOrIsInterface extends MusicDirectoryEntryParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public MusicDirectory isMethod(Reader isParameter, ProgressListener isParameter) throws Exception {
        isMethod(isNameExpr);
        MusicDirectory isVariable = new MusicDirectory();
        int isVariable;
        do {
            isNameExpr = isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                String isVariable = isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isMethod("isStringConstant"));
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isMethod();
                }
            }
        } while (isNameExpr != isNameExpr.isFieldAccessExpr);
        isMethod();
        return isNameExpr;
    }
}
