// isComment
package github.daneren2005.dsub.service.parser;

import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.io.Reader;
import github.daneren2005.dsub.domain.MusicDirectory;
import github.daneren2005.dsub.util.ProgressListener;

public class isClassOrIsInterface extends MusicDirectoryEntryParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public MusicDirectory isMethod(Reader isParameter, ProgressListener isParameter) throws Exception {
        isMethod(isNameExpr);
        MusicDirectory isVariable = new MusicDirectory();
        int isVariable;
        int isVariable = isIntegerConstant;
        do {
            isNameExpr = isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                String isVariable = isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    MusicDirectory.Entry isVariable = isMethod("isStringConstant");
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr++;
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isMethod();
                }
            }
        } while (isNameExpr != isNameExpr.isFieldAccessExpr);
        isMethod();
        return isNameExpr;
    }
}
