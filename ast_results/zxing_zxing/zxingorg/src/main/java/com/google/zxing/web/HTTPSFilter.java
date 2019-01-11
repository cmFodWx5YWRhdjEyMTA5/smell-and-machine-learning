// isComment
package com.google.zxing.web;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * isComment
 */
@WebFilter("isStringConstant")
public final class isClassOrIsInterface extends AbstractFilter {

    @Override
    public void isMethod(ServletRequest isParameter, ServletResponse isParameter, FilterChain isParameter) throws IOException, ServletException {
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            HttpServletRequest isVariable = (HttpServletRequest) isNameExpr;
            String isVariable = isNameExpr.isMethod().isMethod().isMethod("isStringConstant", "isStringConstant");
            isMethod(isNameExpr, isNameExpr);
        }
    }
}
