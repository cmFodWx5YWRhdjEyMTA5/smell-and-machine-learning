// isComment
package com.sismics.reader.rest;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

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
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", isNameExpr));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", isNameExpr, "isStringConstant", isNameExpr));
        isMethod();
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", isNameExpr, "isStringConstant", isNameExpr));
        isMethod();
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }
}
