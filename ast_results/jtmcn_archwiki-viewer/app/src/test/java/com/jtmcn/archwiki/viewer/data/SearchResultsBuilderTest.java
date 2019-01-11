// isComment
package com.jtmcn.archwiki.viewer.data;

import com.jtmcn.archwiki.viewer.data.SearchResult;
import com.jtmcn.archwiki.viewer.data.SearchResultsBuilder;
import org.junit.Test;
import java.util.List;
import static junit.framework.Assert.assertEquals;

public class isClassOrIsInterface {

    private final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";

    @Test
    public void isMethod() throws Exception {
        List<SearchResult> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() {
        String isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr);
        String isVariable = isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        List<SearchResult> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        List<SearchResult> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }
}
