// isComment
package org.qii.weiciyuan.dao.maintimeline;

import org.qii.weiciyuan.dao.URLHelper;
import org.qii.weiciyuan.dao.unread.ClearUnreadDao;
import org.qii.weiciyuan.support.error.WeiboException;

/**
 * isComment
 */
public class isClassOrIsInterface extends MainCommentsTimeLineDao {

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    protected void isMethod() {
        try {
            new ClearUnreadDao(isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
        } catch (WeiboException isParameter) {
        }
    }
}
