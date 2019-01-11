// isComment
package org.qii.weiciyuan.ui.preference.filter;

import org.qii.weiciyuan.R;
import org.qii.weiciyuan.support.database.FilterDBTask;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFilterFragment {

    @Override
    protected List<String> isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(Collection<String> isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    protected List<String> isMethod(Collection<String> isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                Set<String> isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr);
                return true;
        }
        return super.isMethod(isNameExpr);
    }
}
