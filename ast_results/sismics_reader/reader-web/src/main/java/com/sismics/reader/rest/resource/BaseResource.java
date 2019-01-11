// isComment
package com.sismics.reader.rest.resource;

import com.sismics.reader.rest.constant.BaseFunction;
import com.sismics.rest.exception.ForbiddenClientException;
import com.sismics.security.IPrincipal;
import com.sismics.security.UserPrincipal;
import com.sismics.util.filter.SecurityFilter;
import org.codehaus.jettison.json.JSONException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import java.security.Principal;
import java.util.Set;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    /**
     * isComment
     */
    @Context
    protected HttpServletRequest isVariable;

    /**
     * isComment
     */
    @QueryParam("isStringConstant")
    protected String isVariable;

    /**
     * isComment
     */
    protected IPrincipal isVariable;

    /**
     * isComment
     */
    protected boolean isMethod() {
        Principal isVariable = (Principal) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && isNameExpr instanceof IPrincipal) {
            this.isFieldAccessExpr = (IPrincipal) isNameExpr;
            return !this.isFieldAccessExpr.isMethod();
        } else {
            return true;
        }
    }

    /**
     * isComment
     */
    protected void isMethod(BaseFunction isParameter) throws JSONException {
        if (!isMethod(isNameExpr)) {
            throw new ForbiddenClientException();
        }
    }

    /**
     * isComment
     */
    protected boolean isMethod(BaseFunction isParameter) throws JSONException {
        if (isNameExpr == null || !(isNameExpr instanceof UserPrincipal)) {
            return true;
        }
        Set<String> isVariable = ((UserPrincipal) isNameExpr).isMethod();
        return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
