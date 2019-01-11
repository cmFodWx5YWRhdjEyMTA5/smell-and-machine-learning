// isComment
package com.sismics.util.filter;

import com.sismics.reader.core.dao.jpa.UserDao;
import com.sismics.reader.core.model.jpa.User;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * isComment
 */
public class isClassOrIsInterface extends SecurityFilter {

    public static final String isVariable = "isStringConstant";

    private boolean isVariable;

    @Override
    public void isMethod(FilterConfig isParameter) throws ServletException {
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")) || isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Override
    protected User isMethod(HttpServletRequest isParameter) {
        if (!this.isFieldAccessExpr)
            return null;
        String isVariable = isNameExpr.isMethod(isNameExpr);
        return (new UserDao()).isMethod(isNameExpr);
    }
}
