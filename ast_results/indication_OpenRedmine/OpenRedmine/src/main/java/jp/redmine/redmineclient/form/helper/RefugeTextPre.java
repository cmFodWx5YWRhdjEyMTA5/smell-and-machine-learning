// isComment
package jp.redmine.redmineclient.form.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends RefugeText<String> {

    @Override
    protected Pattern isMethod() {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected String isMethod(Matcher isParameter) {
        return isNameExpr.isMethod(isIntegerConstant);
    }

    @Override
    protected String isMethod(String isParameter) {
        StringBuffer isVariable = new StringBuffer();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant"));
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }
}
