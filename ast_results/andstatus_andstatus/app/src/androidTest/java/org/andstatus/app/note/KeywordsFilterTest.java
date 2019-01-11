// isComment
package org.andstatus.app.note;

import org.andstatus.app.note.KeywordsFilter.Keyword;
import org.andstatus.app.util.MyHtml;
import org.junit.Test;
import static org.andstatus.app.note.KeywordsFilter.CONTAINS_PREFIX;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant", new Keyword("isStringConstant", true));
        String isVariable = "isStringConstant";
        final Keyword isVariable = new Keyword("isStringConstant");
        isMethod(isNameExpr, isNameExpr);
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr + "isStringConstant");
        isMethod(isNameExpr, isNameExpr + "isStringConstant");
        isNameExpr = "isStringConstant" + isNameExpr;
        final Keyword isVariable = new Keyword("isStringConstant");
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        final String isVariable = isNameExpr + "isStringConstant";
        isMethod(isNameExpr, isNameExpr);
        isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr);
        isNameExpr = "isStringConstant" + isNameExpr;
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
        final Keyword isVariable = new Keyword("isStringConstant", true);
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isNameExpr += "isStringConstant";
        final Keyword isVariable = new Keyword("isStringConstant");
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod(String isParameter, Keyword... isParameter) {
        int isVariable = isNameExpr.isFieldAccessExpr;
        KeywordsFilter isVariable = new KeywordsFilter(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr.isMethod());
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr[isNameExpr], isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        }
    }

    private void isMethod(String isParameter, String isParameter) {
        final String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new KeywordsFilter(isNameExpr).isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, String isParameter) {
        final String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new KeywordsFilter(isNameExpr).isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, String isParameter) {
        final String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new KeywordsFilter(isNameExpr).isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, String isParameter) {
        final String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new KeywordsFilter(isNameExpr).isMethod(isNameExpr));
    }
}
