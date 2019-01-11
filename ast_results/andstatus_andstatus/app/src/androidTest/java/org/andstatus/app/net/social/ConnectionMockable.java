// isComment
package org.andstatus.app.net.social;

import android.support.annotation.NonNull;
import org.andstatus.app.account.MyAccount;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.net.http.HttpConnection;
import org.andstatus.app.net.http.HttpConnectionMock;

public interface isClassOrIsInterface {

    abstract HttpConnection isMethod();

    @NonNull
    default HttpConnectionMock isMethod() {
        return isMethod(isMethod());
    }

    @NonNull
    public static HttpConnectionMock isMethod(@NonNull MyAccount isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    @NonNull
    public static HttpConnectionMock isMethod(@NonNull Connection isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    @NonNull
    public static HttpConnectionMock isMethod(HttpConnection isParameter) {
        if (isNameExpr != null && HttpConnectionMock.class.isMethod(isNameExpr.isMethod())) {
            return (HttpConnectionMock) isNameExpr;
        }
        if (isNameExpr == null) {
            throw new IllegalStateException("isStringConstant");
        }
        isNameExpr.isMethod().isMethod();
        throw new IllegalStateException("isStringConstant" + isNameExpr.isMethod().isMethod() + "isStringConstant" + isNameExpr.isMethod().isMethod());
    }
}
