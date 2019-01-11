// isComment
package jp.redmine.redmineclient.url;

import jp.redmine.redmineclient.entity.RedmineProject;
import android.net.Uri;

public class isClassOrIsInterface extends RemoteUrl {

    private String isVariable = "isStringConstant";

    public void isMethod(RedmineProject isParameter) {
        if (isNameExpr.isMethod() != null)
            isNameExpr = isNameExpr.isMethod();
        else if (isNameExpr.isMethod() != null)
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Uri.Builder isMethod(String isParameter) {
        Uri.Builder isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant" + isMethod());
        return isNameExpr;
    }
}
