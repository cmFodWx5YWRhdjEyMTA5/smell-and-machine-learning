// isComment
package com.sismics.reader.rest;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharStreams;
import com.sismics.reader.core.model.context.AppContext;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import javax.ws.rs.core.MediaType;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
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
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        // isComment
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr));
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        int isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr > isIntegerConstant);
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        JSONObject isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = (JSONObject) isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr = (JSONObject) isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod(), "isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod();
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }

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
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        JSONObject isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod(new Date(isNameExpr.isMethod("isStringConstant")).isMethod(new Date()));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        JSONObject isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        final String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(() -> {
            // isComment
            isMethod();
            // isComment
            isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            isMethod();
            JSONObject isVariable = isMethod();
            JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
            isMethod(isNameExpr);
            isMethod(isIntegerConstant, isNameExpr.isMethod());
        });
        // isComment
        isMethod();
        // isComment
        isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant") > isIntegerConstant);
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        FormDataMultiPart isVariable = new FormDataMultiPart();
        InputStream isVariable = this.isMethod().isMethod("isStringConstant");
        FormDataBodyPart isVariable = new FormDataBodyPart("isStringConstant", new BufferedInputStream(isNameExpr), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
        isMethod();
        // isComment
        isNameExpr.isMethod().isMethod();
        isMethod("isStringConstant");
        isMethod();
        JSONObject isVariable = isMethod();
        int isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr > isIntegerConstant);
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod().isMethod();
        isMethod("isStringConstant");
        isMethod();
        String isVariable = isNameExpr.isMethod(new InputStreamReader(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        FormDataMultiPart isVariable = new FormDataMultiPart();
        InputStream isVariable = this.isMethod().isMethod("isStringConstant");
        FormDataBodyPart isVariable = new FormDataBodyPart("isStringConstant", new BufferedInputStream(isNameExpr), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
        isMethod();
        // isComment
        isNameExpr.isMethod().isMethod();
        isMethod("isStringConstant");
        isMethod();
        JSONObject isVariable = isMethod();
        int isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr > isIntegerConstant);
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        JSONObject isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    @Test
    @Ignore
    public void isMethod() throws JSONException {
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        FormDataMultiPart isVariable = new FormDataMultiPart();
        InputStream isVariable = this.isMethod().isMethod("isStringConstant");
        FormDataBodyPart isVariable = new FormDataBodyPart("isStringConstant", new BufferedInputStream(isNameExpr), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
        isMethod();
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        JSONObject isVariable = isMethod();
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    @Ignore
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
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        JSONArray isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        // isComment
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        // isComment
        isMethod("isStringConstant");
        isMethod();
        isNameExpr = isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        // isComment
        isMethod("isStringConstant" + isNameExpr);
        isMethod();
        isNameExpr = isMethod();
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }
}
