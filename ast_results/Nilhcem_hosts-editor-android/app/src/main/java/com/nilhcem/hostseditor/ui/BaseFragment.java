// isComment
package com.nilhcem.hostseditor.ui;

import android.app.Activity;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.nilhcem.hostseditor.BuildConfig;
import com.nilhcem.hostseditor.HostsEditorApplication;
import com.squareup.otto.Bus;
import javax.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface extends SherlockFragment {

    @Inject
    protected Bus isVariable;

    protected HostsEditorApplication isVariable;

    protected SherlockFragmentActivity isVariable;

    @Override
    public void isMethod(Activity isParameter) {
        if (isNameExpr.isFieldAccessExpr && !(isNameExpr instanceof SherlockFragmentActivity)) {
            throw new UnsupportedOperationException("isStringConstant");
        }
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr = (SherlockFragmentActivity) isNameExpr;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(this);
        super.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr = null;
        isNameExpr = null;
        super.isMethod();
    }
}
