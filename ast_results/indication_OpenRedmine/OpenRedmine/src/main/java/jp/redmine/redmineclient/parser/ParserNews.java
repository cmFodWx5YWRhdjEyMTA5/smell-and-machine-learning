// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineNews;
import jp.redmine.redmineclient.entity.RedmineProject;
import jp.redmine.redmineclient.entity.RedmineUser;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineProject, RedmineNews> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineNews isMethod() {
        return new RedmineNews();
    }

    @Override
    protected void isMethod(RedmineProject isParameter, RedmineNews isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isNameExpr.isMethod() <= isIntegerConstant)
            return;
        if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            RedmineUser isVariable = new RedmineUser();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            RedmineProject isVariable = new RedmineProject();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    }
}
