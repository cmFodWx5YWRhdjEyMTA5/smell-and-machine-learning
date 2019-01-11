// isComment
package github.daneren2005.dsub.service.parser;

import android.content.Context;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.domain.MusicDirectory;
import github.daneren2005.dsub.domain.SearchResult;
import github.daneren2005.dsub.domain.Artist;
import github.daneren2005.dsub.util.ProgressListener;
import org.xmlpull.v1.XmlPullParser;
import java.io.Reader;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * isComment
 */
public class isClassOrIsInterface extends MusicDirectoryEntryParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public SearchResult isMethod(Reader isParameter, ProgressListener isParameter) throws Exception {
        isMethod(isNameExpr);
        List<MusicDirectory.Entry> isVariable = new ArrayList<MusicDirectory.Entry>();
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
        return new SearchResult(isNameExpr.<Artist>isMethod(), isNameExpr.<MusicDirectory.Entry>isMethod(), isNameExpr);
    }
}
