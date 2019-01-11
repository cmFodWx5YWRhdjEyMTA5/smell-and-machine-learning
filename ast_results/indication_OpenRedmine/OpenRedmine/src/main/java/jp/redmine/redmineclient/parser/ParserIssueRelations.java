// isComment
package jp.redmine.redmineclient.parser;

import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineIssue;
import jp.redmine.redmineclient.entity.RedmineIssueRelation;
import jp.redmine.redmineclient.entity.RedmineIssueRelation.RelationType;
import jp.redmine.redmineclient.entity.TypeConverter;
import org.xmlpull.v1.XmlPullParserException;

public class isClassOrIsInterface extends BaseParserInternal<RedmineIssue, RedmineIssueRelation> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineIssueRelation isMethod() {
        RedmineIssueRelation isVariable = new RedmineIssueRelation();
        return isNameExpr;
    }

    @Override
    protected void isMethod(RedmineIssue isParameter, RedmineIssueRelation isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isMethod("isStringConstant")) {
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
