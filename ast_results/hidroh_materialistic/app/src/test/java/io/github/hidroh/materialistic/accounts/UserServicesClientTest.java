// isComment
package io.github.hidroh.materialistic.accounts;

import android.accounts.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowAccountManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import io.github.hidroh.materialistic.BuildConfig;
import io.github.hidroh.materialistic.Preferences;
import io.github.hidroh.materialistic.test.TestRunner;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rx.schedulers.Schedulers;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private UserServices isVariable;

    private Call isVariable;

    private Response.Builder isVariable = isMethod();

    private Account isVariable;

    @Captor
    ArgumentCaptor<Throwable> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr = isMethod(Call.class);
        Call.Factory isVariable = isMethod(Call.Factory.class);
        isMethod(isNameExpr.isMethod(isMethod(Request.class))).isMethod(isNameExpr);
        isNameExpr = new UserServicesClient(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr = new Account("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr, "isStringConstant", null);
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod("isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod("isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        // isComment
        isMethod(isNameExpr.isMethod().isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(new IOException());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod("isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(new IOException());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Callback.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Callback.class));
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr, null, null);
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Callback.class));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr, null, null);
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Callback.class));
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod()).isMethod(isMethod().isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant", "isStringConstant").isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod()).isMethod(isMethod().isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant", "isStringConstant").isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(UserServices.Exception.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod()).isMethod(isMethod().isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod()).isMethod(new IOException());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), "isStringConstant")).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    @Test
    public void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod()).isMethod(new IOException());
        UserServices.Callback isVariable = isMethod(UserServices.Callback.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Throwable.class));
    }

    private Response.Builder isMethod() {
        return new Response.Builder().isMethod(isNameExpr.isFieldAccessExpr).isMethod(new Request.Builder().isMethod("isStringConstant").isMethod());
    }
}
