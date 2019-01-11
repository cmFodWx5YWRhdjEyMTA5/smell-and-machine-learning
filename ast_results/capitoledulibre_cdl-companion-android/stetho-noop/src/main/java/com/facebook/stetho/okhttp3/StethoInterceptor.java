// isComment
package com.facebook.stetho.okhttp3;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

public class isClassOrIsInterface implements Interceptor {

    @Override
    public Response isMethod(Chain isParameter) throws IOException {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
