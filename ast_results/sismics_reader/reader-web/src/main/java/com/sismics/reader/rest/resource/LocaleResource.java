// isComment
package com.sismics.reader.rest.resource;

import com.sismics.reader.core.dao.jpa.LocaleDao;
import com.sismics.reader.core.model.jpa.Locale;
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
        LocaleDao isVariable = new LocaleDao();
        List<Locale> isVariable = isNameExpr.isMethod();
        JSONObject isVariable = new JSONObject();
        List<JSONObject> isVariable = new ArrayList<JSONObject>();
        for (Locale isVariable : isNameExpr) {
            JSONObject isVariable = new JSONObject();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
    }
}
