// isComment
package cgeo.geocaching.utils;

import static org.assertj.core.api.Assertions.fail;
import static org.assertj.core.api.Java6Assertions.assertThat;
import java.net.ConnectException;
import java.net.ServerSocket;
import io.reactivex.Single;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Before;
import org.junit.Test;

public class isClassOrIsInterface {

    private static final OkHttpClient isVariable = new OkHttpClient.Builder().isMethod(true).isMethod();

    private int isVariable;

    @Before
    public void isMethod() throws Exception {
        // isComment
        final ServerSocket isVariable = new ServerSocket(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    private static Single<Response> isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr, new Request.Builder().isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod("isStringConstant").isMethod().isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isMethod("isStringConstant").isMethod().isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        try {
            isMethod("isStringConstant" + isNameExpr + "isStringConstant").isMethod();
            isMethod("isStringConstant");
        } catch (final RuntimeException isParameter) {
            isMethod(isNameExpr.isMethod()).isMethod(ConnectException.class);
        }
    }
}
