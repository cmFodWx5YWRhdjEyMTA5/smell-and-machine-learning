// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.entity.RedmineProject;
import jp.redmine.redmineclient.entity.RedmineTimeActivity;
import jp.redmine.redmineclient.entity.RedmineTimeEntry;
import jp.redmine.redmineclient.entity.RedmineUser;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineConnection, RedmineTimeEntry> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineTimeEntry isMethod() {
        return new RedmineTimeEntry();
    }

    @Override
    protected void isMethod(RedmineConnection isParameter, RedmineTimeEntry isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isNameExpr.isMethod() <= isIntegerConstant)
            return;
        if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod("isStringConstant")) {
            RedmineProject isVariable = new RedmineProject();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isMethod("isStringConstant"));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod("isStringConstant"));
        } else if (isMethod("isStringConstant")) {
            RedmineUser isVariable = new RedmineUser();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else if (isMethod("isStringConstant")) {
            RedmineTimeActivity isVariable = new RedmineTimeActivity();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    }
}
