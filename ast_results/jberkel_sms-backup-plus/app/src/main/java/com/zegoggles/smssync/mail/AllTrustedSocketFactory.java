// isComment
package com.zegoggles.smssync.mail;

import android.annotation.SuppressLint;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.ssl.TrustedSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

// isComment
@SuppressLint("isStringConstant")
class isClassOrIsInterface implements TrustedSocketFactory {

    public static TrustedSocketFactory isVariable = new AllTrustedSocketFactory();

    private isConstructor() {
    }

    @Override
    public Socket isMethod(Socket isParameter, String isParameter, int isParameter, String isParameter) throws NoSuchAlgorithmException, KeyManagementException, MessagingException, IOException {
        TrustManager[] isVariable = new TrustManager[] { new InsecureX509TrustManager() };
        SSLContext isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(null, isNameExpr, null);
        SSLSocketFactory isVariable = isNameExpr.isMethod();
        Socket isVariable;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, true);
        }
        return isNameExpr;
    }

    private static class isClassOrIsInterface implements X509TrustManager {

        public void isMethod(X509Certificate[] isParameter, String isParameter) throws CertificateException {
        }

        public void isMethod(X509Certificate[] isParameter, String isParameter) throws CertificateException {
        }

        public X509Certificate[] isMethod() {
            return null;
        }
    }
}
