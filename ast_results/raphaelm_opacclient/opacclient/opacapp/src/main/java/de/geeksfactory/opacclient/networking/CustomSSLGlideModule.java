// isComment
package de.geeksfactory.opacclient.networking;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import okhttp3.OkHttpClient;

public class isClassOrIsInterface implements GlideModule {

    @Override
    public void isMethod(Context isParameter, GlideBuilder isParameter) {
    }

    @Override
    public void isMethod(Context isParameter, Glide isParameter) {
        try {
            KeyStore isVariable = new AndroidHttpClientFactory().isMethod();
            SSLContext isVariable = isNameExpr.isMethod("isStringConstant");
            AdditionalKeyStoresSSLSocketFactory.AdditionalKeyStoresTrustManager isVariable = new AdditionalKeyStoresSSLSocketFactory.AdditionalKeyStoresTrustManager(isNameExpr);
            isNameExpr.isMethod(null, new TrustManager[] { isNameExpr }, null);
            OkHttpClient isVariable = new OkHttpClient.Builder().isMethod(isNameExpr.isMethod(), isNameExpr).isMethod();
            OkHttpUrlLoader.Factory isVariable = new OkHttpUrlLoader.Factory(isNameExpr);
            isNameExpr.isMethod(GlideUrl.class, InputStream.class, isNameExpr);
        } catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException | KeyManagementException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }
}
