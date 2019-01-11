// isComment
package de.geeksfactory.opacclient.apis;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import de.geeksfactory.opacclient.objects.Account;
import de.geeksfactory.opacclient.objects.AccountData;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class isClassOrIsInterface extends BaseHtmlTest {

    private SISIS isVariable;

    @Before
    public void isMethod() throws JSONException {
        isNameExpr = isMethod(SISIS.class);
        isNameExpr.isFieldAccessExpr = "isStringConstant";
        isNameExpr.isFieldAccessExpr = new JSONObject("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
    }

    @Test
    public void isMethod() throws IOException, OpacApi.OpacErrorException, JSONException {
        Account isVariable = new Account();
        // isComment
        // isComment
        // isComment
        String isVariable = "isStringConstant";
        String isVariable = isMethod(isNameExpr + "isStringConstant");
        isMethod().isMethod(isNameExpr).isMethod();
        isMethod(true).isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isParameter -> {
            String isVariable = "isStringConstant";
            String isVariable = isNameExpr.isMethod(isIntegerConstant, String.class);
            if (isNameExpr.isMethod(isNameExpr + "isStringConstant")) {
                return isNameExpr;
            } else if (isNameExpr.isMethod(isNameExpr + "isStringConstant")) {
                return isMethod(isNameExpr + "isStringConstant");
            } else if (isNameExpr.isMethod(isNameExpr + "isStringConstant")) {
                return isMethod(isNameExpr + "isStringConstant");
            } else if (isNameExpr.isMethod(isNameExpr + "isStringConstant")) {
                return isMethod(isNameExpr + "isStringConstant");
            } else if (isNameExpr.isMethod(isNameExpr + "isStringConstant")) {
                return isMethod(isNameExpr + "isStringConstant");
            } else if (isNameExpr.isMethod(isNameExpr + "isStringConstant") || isNameExpr.isMethod(isNameExpr + "isStringConstant")) {
                return "isStringConstant";
            } else {
                return null;
            }
        }).isMethod(isNameExpr).isMethod(isMethod(), isMethod());
        AccountData isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        String isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod("isStringConstant" + "isStringConstant", isNameExpr);
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        isNameExpr = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod("isStringConstant", isNameExpr);
    }
}
