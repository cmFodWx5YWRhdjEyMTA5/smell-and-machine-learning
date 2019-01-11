// isComment
package org.servDroid.ui.activity;

import org.servDroid.ui.fragment.LogFragment;
import org.servDroid.ui.option.IMainOptionsList;
import org.servDroid.ui.option.ServDroidOptions;
import org.servDroid.web.R;
import roboguice.inject.InjectFragment;
import android.os.Bundle;
import android.view.KeyEvent;
import com.actionbarsherlock.view.Menu;
import com.google.inject.Inject;

public class isClassOrIsInterface extends ServDroidBaseFragmentActivity {

    @Inject
    private IMainOptionsList isVariable;

    @InjectFragment(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    private LogFragment isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod().isMethod(true);
    }

    @Override
    protected void isMethod(Menu isParameter) {
        if (isNameExpr || isNameExpr == null) {
            return;
        }
        isNameExpr.isMethod(isNameExpr);
    }

    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            return true;
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod();
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod();
                break;
            default:
                break;
        }
    }
}
