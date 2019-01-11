// isComment
package github.daneren2005.dsub.service.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.domain.MusicFolder;
import github.daneren2005.dsub.util.ProgressListener;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public List<MusicFolder> isMethod(Reader isParameter, ProgressListener isParameter) throws Exception {
        isMethod(isNameExpr);
        List<MusicFolder> isVariable = new ArrayList<MusicFolder>();
        int isVariable;
        do {
            isNameExpr = isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                String isVariable = isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    String isVariable = isMethod("isStringConstant");
                    String isVariable = isMethod("isStringConstant");
                    isNameExpr.isMethod(new MusicFolder(isNameExpr, isNameExpr));
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isMethod();
                }
            }
        } while (isNameExpr != isNameExpr.isFieldAccessExpr);
        isMethod();
        return isNameExpr;
    }
}
