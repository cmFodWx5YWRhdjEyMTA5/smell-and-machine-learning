// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.entity.RedmineRole;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineConnection, RedmineRole> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineRole isMethod() {
        return new RedmineRole();
    }

    @Override
    protected void isMethod(RedmineConnection isParameter, RedmineRole isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isNameExpr.isMethod() <= isIntegerConstant)
            return;
        if (isMethod("isStringConstant")) {
            String isVariable = isMethod();
            if ("isStringConstant".isMethod(isNameExpr))
                return;
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
        // isComment
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        }
    }
}
