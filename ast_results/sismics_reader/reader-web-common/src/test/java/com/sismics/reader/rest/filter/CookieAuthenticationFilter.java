// isComment
package com.sismics.reader.rest.filter;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Cookie;
import com.sismics.util.filter.TokenBasedSecurityFilter;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

/**
 * isComment
 */
public class isClassOrIsInterface extends ClientFilter {

    private String isVariable;

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public ClientResponse isMethod(ClientRequest isParameter) throws ClientHandlerException {
        Cookie isVariable = new Cookie(isNameExpr.isFieldAccessExpr, isNameExpr);
        List<Object> isVariable = new ArrayList<Object>();
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr);
        }
        ClientResponse isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }
}
