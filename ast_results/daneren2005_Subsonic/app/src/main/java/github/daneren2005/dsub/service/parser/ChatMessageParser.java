// isComment
package github.daneren2005.dsub.service.parser;

import android.content.Context;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.domain.ChatMessage;
import github.daneren2005.dsub.util.ProgressListener;
import org.xmlpull.v1.XmlPullParser;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public List<ChatMessage> isMethod(Reader isParameter, ProgressListener isParameter) throws Exception {
        isMethod(isNameExpr);
        List<ChatMessage> isVariable = new ArrayList<ChatMessage>();
        int isVariable;
        do {
            isNameExpr = isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                String isVariable = isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    ChatMessage isVariable = new ChatMessage();
                    isNameExpr.isMethod(isMethod("isStringConstant"));
                    isNameExpr.isMethod(isMethod("isStringConstant"));
                    isNameExpr.isMethod(isMethod("isStringConstant"));
                    isNameExpr.isMethod(isNameExpr);
                } else if ("isStringConstant".isMethod(isNameExpr)) {
                    isMethod();
                }
            }
        } while (isNameExpr != isNameExpr.isFieldAccessExpr);
        isMethod();
        return isNameExpr;
    }
}
