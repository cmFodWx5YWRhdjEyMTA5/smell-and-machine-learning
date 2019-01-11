// isComment
package jp.redmine.redmineclient.form.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends RefugeText<Anchor> {

    @Override
    protected Pattern isMethod() {
        return isNameExpr.isMethod("isStringConstant" + // isComment
        "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + // isComment
        "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + // isComment
        "isStringConstant");
    }

    @Override
    protected String isMethod(Anchor isParameter) {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected Anchor isMethod(Matcher isParameter) {
        String isVariable = isNameExpr.isMethod();
        String isVariable = isNameExpr;
        if (isNameExpr.isMethod() > isIntegerConstant && isNameExpr.isMethod(isIntegerConstant) != null && isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant")) {
            isNameExpr = isNameExpr.isMethod(isIntegerConstant);
            isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        }
        return new Anchor(isNameExpr, isNameExpr);
    }
}
