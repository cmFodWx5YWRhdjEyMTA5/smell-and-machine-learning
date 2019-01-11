// isComment
package jp.redmine.redmineclient.parser;

import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineAttachment;
import jp.redmine.redmineclient.entity.RedmineIssue;
import jp.redmine.redmineclient.entity.RedmineUser;
import jp.redmine.redmineclient.entity.TypeConverter;
import org.xmlpull.v1.XmlPullParserException;

public class isClassOrIsInterface extends BaseParserInternal<RedmineIssue, RedmineAttachment> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineAttachment isMethod() {
        return new RedmineAttachment();
    }

    @Override
    protected void isMethod(RedmineIssue isParameter, RedmineAttachment isParameter) throws XmlPullParserException, IOException, SQLException {
        if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            RedmineUser isVariable = new RedmineUser();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    }

    @Override
    protected void isMethod(RedmineIssue isParameter) throws XmlPullParserException, IOException, SQLException {
        // isComment
        if (isMethod("isStringConstant")) {
            isMethod();
        } else {
            super.isMethod(isNameExpr);
        }
    }
}
