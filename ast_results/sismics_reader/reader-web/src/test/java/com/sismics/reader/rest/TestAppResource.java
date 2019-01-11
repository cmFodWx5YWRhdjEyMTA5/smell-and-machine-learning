// isComment
package com.sismics.reader.rest;

import com.google.common.collect.ImmutableMap;
import com.sismics.rest.exception.ClientException;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.Assert.*;

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
        isMethod();
        JSONObject isVariable = isMethod();
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        Long isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr > isIntegerConstant);
        Long isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr > isIntegerConstant && isNameExpr > isNameExpr);
        // isComment
        isMethod("isStringConstant", "isStringConstant", true);
        // isComment
        isMethod("isStringConstant");
        isMethod();
    }

    /**
     * isComment
     */
    @Test
    @Ignore
    public void isMethod() throws JSONException {
        // isComment
        isMethod("isStringConstant", "isStringConstant", true);
        // isComment
        isMethod("isStringConstant");
        isMethod();
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws JSONException {
        // isComment
        isMethod("isStringConstant", "isStringConstant", true);
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            new ClientException("isStringConstant", "isStringConstant" + isNameExpr, null);
        }
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        Long isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        Long isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        isMethod(isNameExpr >= isNameExpr);
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod() == isIntegerConstant);
        Long isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        Long isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
        isMethod(isNameExpr >= isNameExpr);
    }
}
