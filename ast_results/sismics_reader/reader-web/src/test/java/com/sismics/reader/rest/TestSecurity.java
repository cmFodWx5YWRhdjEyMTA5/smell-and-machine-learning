// isComment
package com.sismics.reader.rest;

import com.google.common.collect.ImmutableMap;
import com.sismics.util.filter.HeaderBasedSecurityFilter;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseJerseyTest {

    /**
     * isComment
     */
    @Test
    public void isMethod() throws JSONException {
        // isComment
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        String isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        // isComment
        isMethod("isStringConstant", "isStringConstant", true);
        // isComment
        isMethod();
    }

    @Test
    public void isMethod() {
        final String isVariable = "isStringConstant";
        final WebResource isVariable = isMethod().isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isMethod(ClientResponse.class).isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod(ClientResponse.class).isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr).isMethod(ClientResponse.class).isMethod());
    }
}
