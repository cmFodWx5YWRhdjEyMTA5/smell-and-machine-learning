// isComment
package jp.redmine.redmineclient.parser;

import java.io.IOException;
import java.sql.SQLException;
import org.xmlpull.v1.XmlPullParserException;
import jp.redmine.redmineclient.entity.RedmineJournal;
import jp.redmine.redmineclient.entity.RedmineJournalChanges;

public class isClassOrIsInterface extends BaseParserInternal<RedmineJournal, RedmineJournalChanges> {

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected RedmineJournalChanges isMethod() {
        RedmineJournalChanges isVariable = new RedmineJournalChanges();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        return isNameExpr;
    }

    @Override
    protected void isMethod(RedmineJournal isParameter, RedmineJournalChanges isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        } else if (isMethod("isStringConstant")) {
            isNameExpr.isMethod(isMethod());
        }
    }

    @Override
    protected void isMethod(RedmineJournal isParameter) throws XmlPullParserException, IOException, SQLException {
        // isComment
        if (isMethod("isStringConstant")) {
            isMethod();
        } else {
            super.isMethod(isNameExpr);
        }
    }
}
