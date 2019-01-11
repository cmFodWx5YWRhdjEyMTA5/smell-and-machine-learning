// isComment
package de.geeksfactory.opacclient.apis;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import de.geeksfactory.opacclient.i18n.DummyStringProvider;
import de.geeksfactory.opacclient.objects.Account;
import de.geeksfactory.opacclient.objects.AccountData;
import de.geeksfactory.opacclient.objects.DetailedItem;
import de.geeksfactory.opacclient.objects.LentItem;
import okhttp3.RequestBody;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class isClassOrIsInterface extends BaseHtmlTest {

    private WebOpacNet isVariable;

    @Before
    public void isMethod() throws IOException, OpacApi.OpacErrorException {
        isNameExpr = isMethod(WebOpacNet.class);
        isNameExpr.isFieldAccessExpr = "isStringConstant";
        isNameExpr.isFieldAccessExpr = new DummyStringProvider();
    }

    @Test
    public void isMethod() throws JSONException {
        String isVariable = isMethod("isStringConstant");
        AccountData isVariable = new AccountData(isIntegerConstant);
        isNameExpr.isMethod(new JSONObject(isNameExpr), isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        for (LentItem isVariable : isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        OpacApi.ProlongResult isVariable = isNameExpr.isMethod("isStringConstant", new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        OpacApi.ProlongResult isVariable = isNameExpr.isMethod("isStringConstant", new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        OpacApi.ProlongResult isVariable = isNameExpr.isMethod("isStringConstant", new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isIntegerConstant)[isIntegerConstant]);
        isNameExpr = isNameExpr.isMethod("isStringConstant", new Account(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        OpacApi.ProlongAllResult isVariable = isNameExpr.isMethod(new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        OpacApi.ProlongAllResult isVariable = isNameExpr.isMethod(new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        OpacApi.CancelResult isVariable = isNameExpr.isMethod("isStringConstant", new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isMethod("isStringConstant");
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isMethod(), isMethod(RequestBody.class), isMethod());
        DetailedItem isVariable = new DetailedItem();
        isNameExpr.isMethod("isStringConstant");
        OpacApi.ReservationResult isVariable = isNameExpr.isMethod(isNameExpr, new Account(), isIntegerConstant, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isIntegerConstant)[isIntegerConstant]);
        isNameExpr = isNameExpr.isMethod(isNameExpr, new Account(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }
}
