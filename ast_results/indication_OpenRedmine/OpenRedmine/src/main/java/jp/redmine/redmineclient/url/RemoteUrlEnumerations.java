// isComment
package jp.redmine.redmineclient.url;

import android.net.Uri;

public class isClassOrIsInterface extends RemoteUrl {

    public enum EnumerationType {

        IssuePriorities, TimeEntryActivities
    }

    private EnumerationType isVariable;

    /**
     * isComment
     */
    public EnumerationType isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(EnumerationType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected String isMethod() {
        switch(isNameExpr) {
            case isNameExpr:
                return "isStringConstant";
            case isNameExpr:
                return "isStringConstant";
            default:
                return "isStringConstant";
        }
    }

    @Override
    public Uri.Builder isMethod(String isParameter) {
        Uri.Builder isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isMethod() + "isStringConstant" + isMethod());
        return isNameExpr;
    }
}
