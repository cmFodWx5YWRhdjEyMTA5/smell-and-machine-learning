// isComment
package org.qii.weiciyuan.ui.maintimeline;

import org.qii.weiciyuan.bean.GroupListBean;
import org.qii.weiciyuan.dao.maintimeline.FriendGroupDao;
import org.qii.weiciyuan.support.database.GroupDBTask;
import org.qii.weiciyuan.support.error.WeiboException;
import org.qii.weiciyuan.support.lib.MyAsyncTask;
import org.qii.weiciyuan.support.utils.GlobalContext;

/**
 * isComment
 */
public class isClassOrIsInterface extends MyAsyncTask<Void, GroupListBean, GroupListBean> {

    private WeiboException isVariable;

    private String isVariable;

    private String isVariable;

    public isConstructor(String isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected GroupListBean isMethod(Void... isParameter) {
        try {
            return new FriendGroupDao(isNameExpr).isMethod();
        } catch (WeiboException isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            isMethod(true);
        }
        return null;
    }

    @Override
    protected void isMethod(GroupListBean isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
    }
}
