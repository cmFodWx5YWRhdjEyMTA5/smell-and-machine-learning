// isComment
package jp.redmine.redmineclient.form.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends RefugeText<Anchor> {

    @Override
    protected Pattern isMethod() {
        return isNameExpr.isMethod("isStringConstant");
    }

    @Override
    protected String isMethod(Anchor isParameter) {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected Anchor isMethod(Matcher isParameter) {
        return new Anchor(isNameExpr.isMethod(isIntegerConstant) == null ? isNameExpr.isMethod(isIntegerConstant) : isNameExpr.isMethod(isIntegerConstant), isNameExpr.isMethod());
    }
}
