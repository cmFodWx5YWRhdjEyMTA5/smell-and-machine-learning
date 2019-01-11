// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.entity.RedmineProject;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineConnection, RedmineProject> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineProject isMethod() {
        return new RedmineProject();
    }

    @Override
    protected void isMethod(RedmineConnection isParameter, RedmineProject isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isNameExpr.isMethod() <= isIntegerConstant)
            return;
        if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            String isVariable = isMethod();
            if ("isStringConstant".isMethod(isNameExpr))
                return;
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isMethod());
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isMethod());
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isMethod());
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod()));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            String isVariable = isMethod();
            if ("isStringConstant".isMethod(isNameExpr))
                return;
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    // isComment
    }
}
