// isComment
package com.sismics.reader.rest.resource;

import com.sismics.reader.rest.dao.ThemeDao;
import com.sismics.rest.exception.ServerException;
import com.sismics.util.EnvironmentUtil;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
@Path("isStringConstant")
public class isClassOrIsInterface extends BaseResource {

    /**
     * isComment
     */
    @GET
    @Produces(isNameExpr.isFieldAccessExpr)
    public Response isMethod() throws JSONException {
        ThemeDao isVariable = new ThemeDao();
        List<String> isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod() ? null : isNameExpr.isMethod());
        } catch (Exception isParameter) {
            throw new ServerException("isStringConstant", "isStringConstant", isNameExpr);
        }
        JSONObject isVariable = new JSONObject();
        List<JSONObject> isVariable = new ArrayList<JSONObject>();
        for (String isVariable : isNameExpr) {
            JSONObject isVariable = new JSONObject();
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
    }
}
