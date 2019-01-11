// isComment
package com.manuelmaly.hn.parser;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseHTMLParser<String> {

    @Override
    public String isMethod(Element isParameter) throws Exception {
        if (isNameExpr == null)
            return null;
        Elements isVariable = isNameExpr.isMethod("isStringConstant");
        if (isNameExpr.isMethod() == isIntegerConstant)
            return null;
        return isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant");
    }
}
