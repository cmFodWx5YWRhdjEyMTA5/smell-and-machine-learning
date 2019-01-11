// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.entity.RedmineTracker;
import jp.redmine.redmineclient.entity.TypeConverter;

public class isClassOrIsInterface extends BaseParserInternal<RedmineConnection, RedmineTracker> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineTracker isMethod() {
        return new RedmineTracker();
    }

    @Override
    protected void isMethod(RedmineConnection isParameter, RedmineTracker isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isNameExpr.isMethod() <= isIntegerConstant)
            return;
        if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            String isVariable = isMethod();
            if ("isStringConstant".isMethod(isNameExpr))
                return;
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isMethod());
        /*isComment*/
        }
    }
}
