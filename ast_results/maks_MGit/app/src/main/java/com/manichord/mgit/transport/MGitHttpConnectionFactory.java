// isComment
package com.manichord.mgit.transport;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import org.eclipse.jgit.transport.HttpTransport;
import org.eclipse.jgit.transport.http.HttpConnection;
import org.eclipse.jgit.transport.http.HttpConnectionFactory;

/**
 * isComment
 */
public class isClassOrIsInterface implements HttpConnectionFactory {

    public HttpConnection isMethod(URL isParameter) throws IOException {
        return new MGitHttpConnection(isNameExpr);
    }

    public HttpConnection isMethod(URL isParameter, Proxy isParameter) throws IOException {
        return new MGitHttpConnection(isNameExpr, isNameExpr);
    }

    public static void isMethod() {
        if (isNameExpr.isMethod() instanceof MGitHttpConnectionFactory) {
            return;
        }
        isNameExpr.isMethod(new MGitHttpConnectionFactory());
    }
}
