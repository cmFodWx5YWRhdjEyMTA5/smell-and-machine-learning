// isComment
package com.manuelmaly.hn.server;

import android.content.Context;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import java.util.HashMap;

public class isClassOrIsInterface extends BaseHTTPCommand<String> {

    public isConstructor(String isParameter, HashMap<String, String> isParameter, RequestType isParameter, boolean isParameter, String isParameter, Context isParameter, CookieStore isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant, null);
        isMethod(isNameExpr);
    }

    @Override
    protected HttpUriRequest isMethod(HttpUriRequest isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    protected ResponseHandler<String> isMethod(HttpClient isParameter) {
        return new HTMLResponseHandler(this, isNameExpr);
    }
}
