// isComment
package org.qii.weiciyuan.ui.task;

import org.qii.weiciyuan.R;
import org.qii.weiciyuan.bean.FavBean;
import org.qii.weiciyuan.dao.fav.FavDao;
import org.qii.weiciyuan.support.error.WeiboException;
import org.qii.weiciyuan.support.lib.MyAsyncTask;
import org.qii.weiciyuan.support.utils.GlobalContext;
import android.widget.Toast;

/**
 * isComment
 */
public class isClassOrIsInterface extends MyAsyncTask<Void, FavBean, FavBean> {

    private String isVariable;

    private String isVariable;

    private WeiboException isVariable;

    public isConstructor(String isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected FavBean isMethod(Void... isParameter) {
        FavDao isVariable = new FavDao(isNameExpr, isNameExpr);
        try {
            return isNameExpr.isMethod();
        } catch (WeiboException isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            isMethod(true);
            return null;
        }
    }

    @Override
    protected void isMethod(FavBean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr == null && this.isFieldAccessExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr).isMethod();
        }
    }

    @Override
    protected void isMethod(FavBean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr).isMethod();
        }
    }
}
