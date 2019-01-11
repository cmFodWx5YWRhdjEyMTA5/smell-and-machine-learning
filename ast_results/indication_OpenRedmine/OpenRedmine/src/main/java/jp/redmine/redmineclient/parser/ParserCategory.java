// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.entity.RedmineProjectCategory;
import jp.redmine.redmineclient.entity.RedmineUser;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineConnection, RedmineProjectCategory> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineProjectCategory isMethod() {
        return new RedmineProjectCategory();
    }

    @Override
    protected void isMethod(RedmineConnection isParameter, RedmineProjectCategory isParameter) throws XmlPullParserException, IOException, SQLException {
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
            RedmineUser isVariable = new RedmineUser();
            String isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            }
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
            isNameExpr.isMethod(isNameExpr);
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    }
}
