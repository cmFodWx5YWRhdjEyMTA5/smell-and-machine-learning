// isComment
package de.geeksfactory.opacclient.apis;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class isClassOrIsInterface extends BaseHtmlTest {

    private static final String isVariable = "isStringConstant";

    @Test
    public void isMethod() {
        Document isVariable = isNameExpr.isMethod(isMethod("isStringConstant"));
        Document isVariable = isNameExpr.isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr, "isStringConstant" + "isStringConstant" + "isStringConstant");
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }
}
