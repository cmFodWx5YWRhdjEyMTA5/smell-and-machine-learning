// isComment
package com.google.zxing.web;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * isComment
 */
@WebFilter({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
public final class isClassOrIsInterface extends AbstractFilter {

    @Override
    public void isMethod(ServletRequest isParameter, ServletResponse isParameter, FilterChain isParameter) {
        isMethod(isNameExpr, "isStringConstant");
    }
}
