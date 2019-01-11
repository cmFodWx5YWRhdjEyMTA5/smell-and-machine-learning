// isComment
package com.fsck.k9.mail.store.webdav;

import com.fsck.k9.mail.FetchProfile;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.MessageRetrievalListener;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.BinaryTempFileBody;
import com.fsck.k9.mail.store.StoreConfig;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.protocol.HttpContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static java.util.Collections.singletonList;
import static com.fsck.k9.mail.Folder.OPEN_MODE_RW;
import static com.fsck.k9.mail.Folder.OPEN_MODE_RO;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyMapOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("isStringConstant")
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Mock
    private MessageRetrievalListener<WebDavMessage> isVariable;

    @Mock
    private WebDavStore isVariable;

    @Mock
    private DataSet isVariable;

    @Mock
    private WebDavHttpClient isVariable;

    @Mock
    private StoreConfig isVariable;

    @Mock
    private HttpResponse isVariable;

    @Mock
    private StatusLine isVariable;

    @Captor
    private ArgumentCaptor<Map<String, String>> isVariable;

    private WebDavFolder isVariable;

    private WebDavFolder isVariable;

    private String isVariable = "isStringConstant";

    private HashMap<String, String> isVariable;

    private List<WebDavMessage> isVariable;

    @Before
    public void isMethod() throws MessagingException, IOException {
        isNameExpr.isMethod(this);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr = new WebDavFolder(isNameExpr, "isStringConstant");
        isMethod();
    }

    private void isMethod() {
        File isVariable = new File("isStringConstant");
        if (!isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod(isNameExpr);
    }

    private WebDavFolder isMethod() {
        WebDavFolder isVariable = new WebDavFolder(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        return isNameExpr;
    }

    private void isMethod(int isParameter) throws MessagingException {
        HashMap<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr, isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    private WebDavMessage isMethod(String isParameter) {
        WebDavMessage isVariable = isMethod(WebDavMessage.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        return isNameExpr;
    }

    private void isMethod(String isParameter, String isParameter) throws MessagingException {
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(new String[] { isNameExpr })).isMethod(isNameExpr);
        HashMap<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr, isNameExpr)).isMethod(isNameExpr);
        Map<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(String.class, String.class))).isMethod(isNameExpr);
        List<WebDavMessage> isVariable = new ArrayList<>();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            WebDavMessage isVariable = isMethod(WebDavMessage.class);
            isNameExpr.isMethod(isNameExpr);
        }
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(String.class, String.class))).isMethod(isNameExpr);
        List<WebDavMessage> isVariable = new ArrayList<>();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            WebDavMessage isVariable = isMethod(WebDavMessage.class);
            isNameExpr.isMethod(isNameExpr);
        }
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(String.class, String.class))).isMethod(isNameExpr);
        List<WebDavMessage> isVariable = new ArrayList<>();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            WebDavMessage isVariable = isMethod(WebDavMessage.class);
            isNameExpr.isMethod(isNameExpr);
        }
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(String.class, String.class))).isMethod(isNameExpr);
        List<WebDavMessage> isVariable = new ArrayList<>();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            WebDavMessage isVariable = isMethod(WebDavMessage.class);
            isNameExpr.isMethod(isNameExpr);
        }
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException, IOException, URISyntaxException {
        isMethod();
        List<WebDavMessage> isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isMethod(HttpUriRequest.class), isMethod(HttpContext.class))).isMethod(new Answer<HttpResponse>() {

            @Override
            public HttpResponse isMethod(InvocationOnMock isParameter) throws Throwable {
                HttpResponse isVariable = isMethod(HttpResponse.class);
                StatusLine isVariable = isMethod(StatusLine.class);
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
                BasicHttpEntity isVariable = new BasicHttpEntity();
                String isVariable = "isStringConstant";
                isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod("isStringConstant")));
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                return isNameExpr;
            }
        });
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(String.class), isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(WebDavMessage.class), isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws MessagingException, IOException, URISyntaxException {
        isMethod();
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(String.class, String.class))).isMethod(isNameExpr);
        List<WebDavMessage> isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isMethod(HttpUriRequest.class), isMethod(HttpContext.class))).isMethod(new Answer<HttpResponse>() {

            @Override
            public HttpResponse isMethod(InvocationOnMock isParameter) throws Throwable {
                HttpResponse isVariable = isMethod(HttpResponse.class);
                StatusLine isVariable = isMethod(StatusLine.class);
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
                BasicHttpEntity isVariable = new BasicHttpEntity();
                String isVariable = "isStringConstant";
                isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod("isStringConstant")));
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                return isNameExpr;
            }
        });
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(String.class), isMethod(), isMethod());
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(WebDavMessage.class), isMethod(), isMethod());
    }

    private void isMethod() {
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    private List<WebDavMessage> isMethod() {
        List<WebDavMessage> isVariable = new ArrayList<>();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            WebDavMessage isVariable = new WebDavMessage("isStringConstant" + isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Test
    public void isMethod() throws MessagingException, IOException {
        isMethod();
        List<WebDavMessage> isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isMethod(HttpUriRequest.class), isMethod(HttpContext.class))).isMethod(new Answer<HttpResponse>() {

            @Override
            public HttpResponse isMethod(InvocationOnMock isParameter) throws Throwable {
                HttpResponse isVariable = isMethod(HttpResponse.class);
                StatusLine isVariable = isMethod(StatusLine.class);
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
                return isNameExpr;
            }
        });
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(String.class), isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(WebDavMessage.class), isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws MessagingException, IOException {
        isMethod();
        List<WebDavMessage> isVariable = isMethod();
        isMethod(isNameExpr.isMethod(isMethod(HttpUriRequest.class), isMethod(HttpContext.class))).isMethod(new Answer<HttpResponse>() {

            @Override
            public HttpResponse isMethod(InvocationOnMock isParameter) throws Throwable {
                HttpResponse isVariable = isMethod(HttpResponse.class);
                StatusLine isVariable = isMethod(StatusLine.class);
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
                BasicHttpEntity isVariable = new BasicHttpEntity();
                InputStream isVariable = isMethod(InputStream.class);
                isMethod(isNameExpr.isMethod(isMethod(byte[].class), isMethod(), isMethod())).isMethod(isIntegerConstant).isMethod(-isIntegerConstant);
                isMethod(new IOException("isStringConstant")).isMethod(isNameExpr).isMethod();
                isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
                return isNameExpr;
            }
        });
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(String.class), isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(WebDavMessage.class), isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        int isVariable = isIntegerConstant;
        HashMap<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr, isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        int isVariable = isIntegerConstant;
        HashMap<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr, isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        int isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        isMethod(isNameExpr);
        String isVariable = "isStringConstant";
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(isNameExpr), isNameExpr.<Map<String, String>>isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, new Date(), isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(), isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(WebDavMessage.class), isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws MessagingException {
        int isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        isMethod(isNameExpr);
        String isVariable = "isStringConstant";
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(isNameExpr), isNameExpr.<Map<String, String>>isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, new Date(), isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(), isMethod(), isMethod(), isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod("isStringConstant"));
        isMethod("isStringConstant" + (isNameExpr - (isNameExpr)) + "isStringConstant" + (isNameExpr - isNameExpr), isNameExpr.isMethod().isMethod("isStringConstant"));
    }

    private void isMethod(DataSet isParameter) {
        String[] isVariable = new String[] { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" };
        HashMap<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test(expected = MessagingException.class)
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, new Date(), isNameExpr);
    }

    private void isMethod() throws MessagingException {
        isNameExpr = isMethod();
        String isVariable = "isStringConstant";
        String isVariable = "isStringConstant";
        isNameExpr = isMethod(isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(new String[] { isNameExpr }), isMethod())).isMethod(isNameExpr);
        isNameExpr = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(new String[] { "isStringConstant" }), isMethod(true));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant", "isStringConstant", isNameExpr, isNameExpr, true);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(new String[] { "isStringConstant" }), isMethod(true));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant", "isStringConstant", isNameExpr, isNameExpr, true);
    }

    @Test
    public void isMethod() throws MessagingException, IOException {
        isMethod(isNameExpr.isMethod(isMethod(HttpUriRequest.class), isMethod(HttpContext.class))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        List<Message> isVariable = new ArrayList<>();
        Message isVariable = isMethod(Message.class);
        isNameExpr.isMethod(isNameExpr);
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        List<? extends Message> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(), isIntegerConstant);
        isMethod(WebDavMessage.class, isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
    }
}
