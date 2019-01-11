// isComment
package com.sismics.reader.rest;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
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
        isMethod("isStringConstant");
        isMethod();
        JSONObject isVariable = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod() > isIntegerConstant);
    }
}
