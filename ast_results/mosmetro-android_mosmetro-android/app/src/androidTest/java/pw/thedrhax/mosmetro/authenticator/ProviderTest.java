// isComment
package pw.thedrhax.mosmetro.authenticator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import junit.framework.TestCase;
import pw.thedrhax.mosmetro.authenticator.providers.Enforta;
import pw.thedrhax.mosmetro.authenticator.providers.MosMetroV1;
import pw.thedrhax.mosmetro.authenticator.providers.MosMetroV2;
import pw.thedrhax.mosmetro.authenticator.providers.Unknown;
import pw.thedrhax.mosmetro.httpclient.ParsedResponse;

/**
 * isComment
 */
public class isClassOrIsInterface extends TestCase {

    private Context isVariable = isNameExpr.isMethod();

    /**
     * isComment
     */
    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new ParsedResponse("isStringConstant" + "isStringConstant")).isMethod(), MosMetroV1.class);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new ParsedResponse("isStringConstant" + "isStringConstant")).isMethod(), MosMetroV2.class);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new ParsedResponse("isStringConstant" + "isStringConstant")).isMethod(), Enforta.class);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new ParsedResponse("isStringConstant")).isMethod(), Unknown.class);
    }

    /**
     * isComment
     */
    public void isMethod() throws Exception {
        for (String isVariable : isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        }
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }
}
