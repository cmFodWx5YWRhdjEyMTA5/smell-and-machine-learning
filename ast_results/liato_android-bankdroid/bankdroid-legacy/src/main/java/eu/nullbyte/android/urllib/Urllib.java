// isComment
package eu.nullbyte.android.urllib;

import com.liato.bankdroid.legacy.BuildConfig;
import com.liato.bankdroid.legacy.R;
import com.liato.bankdroid.utils.ExceptionUtils;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.DefaultRequestDirector;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.EntityUtils;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.preference.PreferenceManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import timber.log.Timber;

public class isClassOrIsInterface {

    private static final int isVariable = isIntegerConstant;

    public static final String isVariable = "isStringConstant";

    private String isVariable = null;

    private DefaultHttpClient isVariable;

    private HttpContext isVariable;

    private String isVariable;

    private String isVariable = isNameExpr.isFieldAccessExpr;

    private HashMap<String, String> isVariable;

    private Context isVariable;

    private CertPinningSSLSocketFactory isVariable;

    public isConstructor(Context isParameter) {
        this(isNameExpr, null);
    }

    public isConstructor(Context isParameter, Certificate[] isParameter) {
        this(isNameExpr, null, isNameExpr);
    }

    public isConstructor(Context isParameter, ClientCertificate isParameter, Certificate[] isParameter) {
        isNameExpr = isNameExpr;
        this.isFieldAccessExpr = new HashMap<String, String>();
        isNameExpr = isMethod();
        HttpParams isVariable = new BasicHttpParams();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, this.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", true);
        SchemeRegistry isVariable = new SchemeRegistry();
        isNameExpr.isMethod(new Scheme("isStringConstant", isNameExpr.isMethod(), isIntegerConstant));
        SharedPreferences isVariable = isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod("isStringConstant", true) && isNameExpr.isMethod("isStringConstant", true);
        try {
            isNameExpr = new CertPinningSSLSocketFactory(isNameExpr, isNameExpr);
            isNameExpr.isMethod(new Scheme("isStringConstant", isNameExpr != null && !isNameExpr ? isNameExpr : isNameExpr.isMethod(), isIntegerConstant));
        } catch (UnrecoverableKeyException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
        ClientConnectionManager isVariable = new ThreadSafeClientConnManager(isNameExpr, isNameExpr);
        isNameExpr = new BankdroidHttpClient(isNameExpr, isNameExpr);
        isNameExpr = new BasicHttpContext();
    }

    public String isMethod(String isParameter) throws ClientProtocolException, IOException {
        try {
            return this.isMethod(isNameExpr, new ArrayList<NameValuePair>());
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            throw isNameExpr;
        }
    }

    public String isMethod(String isParameter) throws ClientProtocolException, IOException {
        return this.isMethod(isNameExpr, new ArrayList<NameValuePair>(), true);
    }

    public String isMethod(String isParameter, List<NameValuePair> isParameter) throws ClientProtocolException, IOException {
        try {
            return isMethod(isNameExpr, isNameExpr, true);
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            throw isNameExpr;
        }
    }

    public String isMethod(String isParameter, List<NameValuePair> isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        HttpEntity isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr).isMethod();
        if (isNameExpr == null) {
            return "isStringConstant";
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    public HttpResponse isMethod(String isParameter, List<NameValuePair> isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        HttpEntity isVariable = (isNameExpr == null || isNameExpr.isMethod()) && !isNameExpr ? null : new UrlEncodedFormEntity(isNameExpr, this.isFieldAccessExpr);
        try {
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            throw isNameExpr;
        }
    }

    public HttpResponse isMethod(String isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        return isMethod(isNameExpr, isNameExpr.<NameValuePair>isMethod(), isNameExpr);
    }

    public HttpResponse isMethod(String isParameter, HttpEntity isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        try {
            if ((isNameExpr == null) && !isNameExpr) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            } else {
                return isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            }
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            throw isNameExpr;
        }
    }

    public HttpResponse isMethod(String isParameter, HttpMethod isParameter) throws ClientProtocolException, IOException {
        return isMethod(isNameExpr, null, isNameExpr);
    }

    public HttpResponse isMethod(String isParameter, HttpEntity isParameter, HttpMethod isParameter) throws ClientProtocolException, IOException {
        this.isFieldAccessExpr = isNameExpr;
        HttpResponse isVariable;
        String[] isVariable = (String[]) this.isFieldAccessExpr.isMethod().isMethod(new String[isNameExpr.isMethod()]);
        String[] isVariable = (String[]) this.isFieldAccessExpr.isMethod().isMethod(new String[isNameExpr.isMethod()]);
        HttpUriRequest isVariable;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = new HttpGet(isNameExpr);
                break;
            case isNameExpr:
                isNameExpr = new HttpPost(isNameExpr);
                ((HttpPost) isNameExpr).isMethod(isNameExpr);
                break;
            case isNameExpr:
                isNameExpr = new HttpPut(isNameExpr);
                ((HttpPut) isNameExpr).isMethod(isNameExpr);
                break;
            default:
                isNameExpr = new HttpGet(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr.isMethod(isNameExpr[isNameExpr], isNameExpr[isNameExpr]);
        }
        HttpRequestRetryHandler isVariable = new HttpRequestRetryHandler() {

            public boolean isMethod(IOException isParameter, int isParameter, HttpContext isParameter) {
                // isComment
                if (isNameExpr >= isNameExpr) {
                    return true;
                }
                if (isNameExpr instanceof NoHttpResponseException) {
                    return true;
                } else if (isNameExpr instanceof ClientProtocolException) {
                    return true;
                }
                return true;
            }
        };
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        // isComment
        // isComment
        this.isFieldAccessExpr = isNameExpr.isMethod().isMethod();
        return isNameExpr;
    }

    public InputStream isMethod(String isParameter) throws ClientProtocolException, IOException {
        return isMethod(isNameExpr, (HttpEntity) null, true);
    }

    public HttpEntity isMethod(List<NameValuePair> isParameter) {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            try {
                return new UrlEncodedFormEntity(isNameExpr, this.isFieldAccessExpr);
            } catch (UnsupportedEncodingException isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
            }
        }
        return null;
    }

    public InputStream isMethod(String isParameter, List<NameValuePair> isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        return isMethod(isNameExpr, isMethod(isNameExpr), isNameExpr);
    }

    public InputStream isMethod(String isParameter, String isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        try {
            return isMethod(isNameExpr, isNameExpr != null ? new StringEntity(isNameExpr, this.isFieldAccessExpr) : null, isNameExpr);
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            throw isNameExpr;
        }
    }

    public InputStream isMethod(String isParameter, HttpEntity isParameter, boolean isParameter) throws ClientProtocolException, IOException {
        this.isFieldAccessExpr = isNameExpr;
        String[] isVariable = (String[]) this.isFieldAccessExpr.isMethod().isMethod(new String[isNameExpr.isMethod()]);
        String[] isVariable = (String[]) this.isFieldAccessExpr.isMethod().isMethod(new String[isNameExpr.isMethod()]);
        HttpUriRequest isVariable;
        if (!isNameExpr && isNameExpr == null) {
            isNameExpr = new HttpGet(isNameExpr);
        } else {
            isNameExpr = new HttpPost(isNameExpr);
            ((HttpPost) isNameExpr).isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr.isMethod(isNameExpr[isNameExpr], isNameExpr[isNameExpr]);
        }
        this.isFieldAccessExpr = isNameExpr.isMethod().isMethod();
        HttpResponse isVariable = isNameExpr.isMethod(isNameExpr);
        HttpEntity isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod().isMethod();
    }

    public HttpContext isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public DefaultHttpClient isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(), this.isFieldAccessExpr);
    }

    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr);
    }

    public void isMethod(String isParameter, String isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod(final int isParameter) {
        isNameExpr.isMethod(new ConnectionKeepAliveStrategy() {

            @Override
            public long isMethod(HttpResponse isParameter, HttpContext isParameter) {
                return isNameExpr;
            }
        });
    }

    public String isMethod(String isParameter) {
        return this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public void isMethod() {
        this.isFieldAccessExpr.isMethod();
    }

    public HashMap<String, String> isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr ? new DefaultRedirectHandler() : new RedirectHandler() {

            public URI isMethod(HttpResponse isParameter, HttpContext isParameter) throws ProtocolException {
                return null;
            }

            public boolean isMethod(HttpResponse isParameter, HttpContext isParameter) {
                return true;
            }
        });
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private String isMethod() {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Configuration isVariable = isNameExpr.isMethod().isMethod();
        return isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod().isMethod(), isNameExpr.isFieldAccessExpr.isMethod().isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    private void isMethod(HttpHost isParameter) {
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    class isClassOrIsInterface extends DefaultHttpClient {

        isConstructor(ClientConnectionManager isParameter, HttpParams isParameter) {
            super(isNameExpr, isNameExpr);
        }

        @Override
        public <T> T isMethod(HttpHost isParameter, HttpRequest isParameter, ResponseHandler<? extends T> isParameter) throws IOException, ClientProtocolException {
            isMethod(isNameExpr);
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public <T> T isMethod(HttpHost isParameter, HttpRequest isParameter, ResponseHandler<? extends T> isParameter, HttpContext isParameter) throws IOException, ClientProtocolException {
            isMethod(isNameExpr);
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        protected RequestDirector isMethod(HttpRequestExecutor isParameter, ClientConnectionManager isParameter, ConnectionReuseStrategy isParameter, ConnectionKeepAliveStrategy isParameter, HttpRoutePlanner isParameter, HttpProcessor isParameter, HttpRequestRetryHandler isParameter, RedirectHandler isParameter, AuthenticationHandler isParameter, AuthenticationHandler isParameter, UserTokenHandler isParameter, HttpParams isParameter) {
            return new DefaultishRequestDirector(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }

    class isClassOrIsInterface extends DefaultRequestDirector {

        public isConstructor(HttpRequestExecutor isParameter, ClientConnectionManager isParameter, ConnectionReuseStrategy isParameter, ConnectionKeepAliveStrategy isParameter, HttpRoutePlanner isParameter, HttpProcessor isParameter, HttpRequestRetryHandler isParameter, RedirectHandler isParameter, AuthenticationHandler isParameter, AuthenticationHandler isParameter, UserTokenHandler isParameter, HttpParams isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public HttpResponse isMethod(HttpHost isParameter, HttpRequest isParameter, HttpContext isParameter) throws HttpException, IOException {
            isMethod(isNameExpr);
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
