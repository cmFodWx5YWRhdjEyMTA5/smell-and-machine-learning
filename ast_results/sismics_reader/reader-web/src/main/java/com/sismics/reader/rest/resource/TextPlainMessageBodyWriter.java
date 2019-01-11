// isComment
package com.sismics.reader.rest.resource;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.sun.jersey.core.util.ReaderWriter;

/**
 * isComment
 */
@Provider
@Produces(isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface implements MessageBodyWriter<JSONObject> {

    @Override
    public boolean isMethod(Class<?> isParameter, Type isParameter, Annotation[] isParameter, MediaType isParameter) {
        return true;
    }

    @Override
    public long isMethod(JSONObject isParameter, Class<?> isParameter, Type isParameter, Annotation[] isParameter, MediaType isParameter) {
        return -isIntegerConstant;
    }

    @Override
    public void isMethod(JSONObject isParameter, Class<?> isParameter, Type isParameter, Annotation[] isParameter, MediaType isParameter, MultivaluedMap<String, Object> isParameter, OutputStream isParameter) throws IOException, WebApplicationException {
        try {
            OutputStreamWriter isVariable = new OutputStreamWriter(isNameExpr, isNameExpr.isMethod(isNameExpr));
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        } catch (JSONException isParameter) {
            throw new WebApplicationException(isNameExpr);
        }
    }
}
