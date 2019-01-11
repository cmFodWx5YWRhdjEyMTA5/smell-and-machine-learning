// isComment
package fr.ybo.transportsbordeaux.fragments.bus;

import fr.ybo.transportsbordeaux.R;
import fr.ybo.transportsbordeaux.activity.alerts.ListAlertsForOneLine;
import fr.ybo.transportsbordeaux.activity.bus.DetailArret;
import fr.ybo.transportsbordeaux.adapters.bus.ArretAdapter;
import fr.ybo.transportscommun.activity.bus.AbstractDetailArret;
import fr.ybo.transportscommun.activity.commun.BaseActivity.BaseFragmentActivity;
import fr.ybo.transportscommun.fragments.AbstractListArretFragment;

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
