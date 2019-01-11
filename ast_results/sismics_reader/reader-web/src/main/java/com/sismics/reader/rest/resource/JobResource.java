// isComment
package com.sismics.reader.rest.resource;

import com.sismics.reader.core.dao.jpa.JobDao;
import com.sismics.reader.core.model.jpa.Job;
import com.sismics.rest.exception.ClientException;
import com.sismics.rest.exception.ForbiddenClientException;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * isComment
 */
@Path("isStringConstant")
public class isClassOrIsInterface extends BaseResource {

    /**
     * isComment
     */
    @DELETE
    @Path("isStringConstant")
    @Produces(isNameExpr.isFieldAccessExpr)
    public Response isMethod(@PathParam("isStringConstant") String isParameter) throws JSONException {
        if (!isMethod()) {
            throw new ForbiddenClientException();
        }
        // isComment
        JobDao isVariable = new JobDao();
        Job isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            throw new ClientException("isStringConstant", "isStringConstant");
        }
        if (isNameExpr.isMethod() == null || !isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
            throw new ClientException("isStringConstant", "isStringConstant");
        }
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        JSONObject isVariable = new JSONObject();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        return isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
    }
}
