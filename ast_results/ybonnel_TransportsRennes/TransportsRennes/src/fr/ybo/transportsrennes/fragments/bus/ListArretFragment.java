// isComment
package fr.ybo.transportsrennes.fragments.bus;

import fr.ybo.transportscommun.activity.bus.AbstractDetailArret;
import fr.ybo.transportscommun.activity.commun.BaseActivity.BaseFragmentActivity;
import fr.ybo.transportscommun.fragments.AbstractListArretFragment;
import fr.ybo.transportsrennes.R;
import fr.ybo.transportsrennes.activity.alerts.ListAlertsForOneLine;
import fr.ybo.transportsrennes.activity.bus.DetailArret;
import fr.ybo.transportsrennes.adapters.bus.ArretAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractListArretFragment {

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod() {
        isMethod(new ArretAdapter(isMethod(), isNameExpr, isNameExpr));
    }

    @Override
    protected Class<? extends AbstractDetailArret> isMethod() {
        return DetailArret.class;
    }

    @Override
    protected Class<? extends BaseFragmentActivity> isMethod() {
        return ListAlertsForOneLine.class;
    }
}
