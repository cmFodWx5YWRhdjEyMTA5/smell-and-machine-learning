// isComment
package github.daneren2005.dsub.service.parser;

import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.io.Reader;
import github.daneren2005.dsub.domain.ServerInfo;
import github.daneren2005.dsub.domain.Version;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractParser {

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public ServerInfo isMethod(Reader isParameter) throws Exception {
        isMethod(isNameExpr);
        ServerInfo isVariable = new ServerInfo();
        int isVariable;
        do {
            isNameExpr = isMethod();
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                String isVariable = isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    isNameExpr.isMethod(new Version(isMethod("isStringConstant")));
                } else if ("isStringConstant".isMethod(isNameExpr)) {
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
