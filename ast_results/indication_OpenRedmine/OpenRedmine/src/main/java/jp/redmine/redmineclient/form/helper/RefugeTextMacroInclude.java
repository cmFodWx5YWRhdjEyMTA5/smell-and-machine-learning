// isComment
package jp.redmine.redmineclient.form.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends RefugeText<Anchor> {

    @Override
    protected Pattern isMethod() {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected String isMethod(Anchor isParameter) {
        return "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
    }

    @Override
    protected Anchor isMethod(Matcher isParameter) {
        String isVariable = isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr;
        return new Anchor(isNameExpr.isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant"), isNameExpr);
    }
}
