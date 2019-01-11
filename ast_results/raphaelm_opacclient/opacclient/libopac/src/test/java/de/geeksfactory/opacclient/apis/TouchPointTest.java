// isComment
package de.geeksfactory.opacclient.apis;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import de.geeksfactory.opacclient.objects.Account;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class isClassOrIsInterface extends BaseHtmlTest {

    private TouchPoint isVariable;

    private Account isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isMethod(TouchPoint.class);
        isNameExpr.isFieldAccessExpr = "isStringConstant";
        isNameExpr = new Account();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod());
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod(UrlEncodedFormEntity.class), isMethod());
        try {
            isNameExpr.isMethod(isNameExpr);
        } catch (OpacApi.OpacErrorException isParameter) {
            isMethod("isStringConstant" + "isStringConstant", isNameExpr.isMethod());
            return;
        }
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws OpacApi.OpacErrorException, IOException {
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod());
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod(UrlEncodedFormEntity.class), isMethod());
        TouchPoint.LoginResponse isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws OpacApi.OpacErrorException, IOException {
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod());
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod(UrlEncodedFormEntity.class), isMethod());
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod());
        TouchPoint.LoginResponse isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws OpacApi.OpacErrorException, IOException {
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod());
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod(UrlEncodedFormEntity.class), isMethod());
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"), isMethod());
        TouchPoint.LoginResponse isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }
}
