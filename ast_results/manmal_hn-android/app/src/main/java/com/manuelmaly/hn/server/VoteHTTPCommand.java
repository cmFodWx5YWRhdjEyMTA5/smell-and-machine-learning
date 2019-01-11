// isComment
package com.manuelmaly.hn.server;

import android.content.Context;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import java.util.HashMap;

public class isClassOrIsInterface extends BaseHTTPCommand<String> {

    public isConstructor(String isParameter, HashMap<String, String> isParameter, RequestType isParameter, boolean isParameter, String isParameter, Context isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant, null);
    }

    @Override
    protected void isMethod(DefaultHttpClient isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
    }

    @Override
    protected HttpUriRequest isMethod(HttpUriRequest isParameter) {
        return isNameExpr;
    }

    @Override
    protected ResponseHandler<String> isMethod(HttpClient isParameter) {
        return new GetHNUserTokenResponseHandler(this, isNameExpr);
    }
}
