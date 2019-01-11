// isComment
package jp.redmine.redmineclient.parser;

import java.io.IOException;
import java.sql.SQLException;
import org.xmlpull.v1.XmlPullParserException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.entity.RedmineTimeActivity;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineConnection, RedmineTimeActivity> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineTimeActivity isMethod() {
        return new RedmineTimeActivity();
    }

    @Override
    protected void isMethod(RedmineConnection isParameter, RedmineTimeActivity isParameter) throws XmlPullParserException, IOException, SQLException {
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
            isNameExpr.isMethod("isStringConstant".isMethod(isMethod()));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    }
}
