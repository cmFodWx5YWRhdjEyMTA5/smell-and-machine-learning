// isComment
package net.gsantner.markor.model;

import net.gsantner.markor.util.DocumentIO;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Document isVariable = new Document();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        Document isVariable = new Document();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(true);
    }

    public String isMethod(Document isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isMethod(null, "isStringConstant"))).isMethod("isStringConstant");
        isMethod(isMethod(isMethod("isStringConstant", "isStringConstant"))).isMethod("isStringConstant");
        isMethod(isMethod(isMethod(null, "isStringConstant"))).isMethod("isStringConstant");
        isMethod(isMethod(isMethod(null, "isStringConstant"))).isMethod("isStringConstant");
        isMethod(isMethod(isMethod(null, "isStringConstant"))).isMethod("isStringConstant");
    }

    private Document isMethod(String isParameter, String isParameter) {
        Document isVariable = new Document();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }
}
