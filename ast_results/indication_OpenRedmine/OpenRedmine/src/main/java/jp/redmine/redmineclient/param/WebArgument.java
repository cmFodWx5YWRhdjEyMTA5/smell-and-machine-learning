// isComment
package jp.redmine.redmineclient.param;

public class isClassOrIsInterface extends ConnectionArgument {

    public static final String isVariable = "isStringConstant";

    public void isMethod(String isParameter) {
        isMethod(isNameExpr, isNameExpr);
    }

    public String isMethod() {
        return isMethod(isNameExpr, "isStringConstant");
    }

    public void isMethod(WebArgument isParameter) {
        isMethod(isNameExpr.isMethod());
        super.isMethod(isNameExpr);
    }
}
