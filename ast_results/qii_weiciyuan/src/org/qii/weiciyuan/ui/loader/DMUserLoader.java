// isComment
package org.qii.weiciyuan.ui.loader;

import org.qii.weiciyuan.bean.DMUserListBean;
import org.qii.weiciyuan.dao.dm.DMDao;
import org.qii.weiciyuan.support.error.WeiboException;
import android.content.Context;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractAsyncNetRequestTaskLoader<DMUserListBean> {

    private static Lock isVariable = new ReentrantLock();

    private String isVariable;

    private String isVariable;

    public isConstructor(Context isParameter, String isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public DMUserListBean isMethod() throws WeiboException {
        DMDao isVariable = new DMDao(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        DMUserListBean isVariable = null;
        isNameExpr.isMethod();
        try {
            isNameExpr = isNameExpr.isMethod();
        } finally {
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }
}
