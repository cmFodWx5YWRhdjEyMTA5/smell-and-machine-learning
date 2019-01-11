// isComment
package com.j256.ormlite.android.apptools;

import android.support.v4.app.ListFragment;
import com.j256.ormlite.support.ConnectionSource;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<H extends OrmLiteSqliteOpenHelper> extends ListFragment {

    /**
     * isComment
     */
    public H isMethod() {
        if (isMethod() instanceof OrmLiteFragmentActivity<?>) {
            return ((OrmLiteFragmentActivity<H>) isMethod()).isMethod();
        } else {
            return null;
        }
    }

    /**
     * isComment
     */
    public ConnectionSource isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod() + "isStringConstant" + isNameExpr.isMethod(super.isMethod());
    }
}
