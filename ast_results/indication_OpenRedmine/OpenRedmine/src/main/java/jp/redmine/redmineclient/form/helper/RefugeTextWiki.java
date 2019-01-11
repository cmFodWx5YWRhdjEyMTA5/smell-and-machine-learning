// isComment
package jp.redmine.redmineclient.form.helper;

import android.text.TextUtils;
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
        String isVariable = isNameExpr.isMethod(isIntegerConstant);
        String isVariable = isNameExpr;
        if (isNameExpr.isMethod() > isIntegerConstant && !isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant)))
            isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        return new Anchor(isNameExpr.isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant"), isNameExpr);
    }
}
