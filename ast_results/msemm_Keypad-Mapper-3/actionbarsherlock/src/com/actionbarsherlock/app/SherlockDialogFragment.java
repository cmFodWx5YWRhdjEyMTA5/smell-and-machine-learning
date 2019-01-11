// isComment
package com.actionbarsherlock.app;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import com.actionbarsherlock.internal.view.menu.MenuItemWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import static com.actionbarsherlock.app.SherlockFragmentActivity.OnCreateOptionsMenuListener;
import static com.actionbarsherlock.app.SherlockFragmentActivity.OnOptionsItemSelectedListener;
import static com.actionbarsherlock.app.SherlockFragmentActivity.OnPrepareOptionsMenuListener;

public class isClassOrIsInterface extends DialogFragment implements OnCreateOptionsMenuListener, OnPrepareOptionsMenuListener, OnOptionsItemSelectedListener {

    private SherlockFragmentActivity isVariable;

    public SherlockFragmentActivity isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Activity isParameter) {
        if (!(isNameExpr instanceof SherlockFragmentActivity)) {
            throw new IllegalStateException(isMethod().isMethod() + "isStringConstant");
        }
        isNameExpr = (SherlockFragmentActivity) isNameExpr;
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr = null;
        super.isMethod();
    }

    @Override
    public final void isMethod(android.view.Menu isParameter, android.view.MenuInflater isParameter) {
        isMethod(new MenuWrapper(isNameExpr), isNameExpr.isMethod());
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
    // isComment
    }

    @Override
    public final void isMethod(android.view.Menu isParameter) {
        isMethod(new MenuWrapper(isNameExpr));
    }

    @Override
    public void isMethod(Menu isParameter) {
    // isComment
    }

    @Override
    public final boolean isMethod(android.view.MenuItem isParameter) {
        return isMethod(new MenuItemWrapper(isNameExpr));
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        // isComment
        return true;
    }
}
