// isComment
package jp.redmine.redmineclient.parser;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineIssue;
import jp.redmine.redmineclient.entity.RedmineUser;
import jp.redmine.redmineclient.entity.RedmineWatcher;

public class isClassOrIsInterface extends BaseParserInternal<RedmineIssue, RedmineWatcher> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineWatcher isMethod() {
        RedmineWatcher isVariable = new RedmineWatcher();
        RedmineUser isVariable = new RedmineUser();
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    protected void isMethod(RedmineIssue isParameter, RedmineWatcher isParameter) throws XmlPullParserException, IOException, SQLException {
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
