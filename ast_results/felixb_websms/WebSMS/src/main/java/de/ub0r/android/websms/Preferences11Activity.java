// isComment
package de.ub0r.android.websms;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import java.util.List;
import de.ub0r.android.lib.IPreferenceContainer;
import de.ub0r.android.lib.Utils;

/**
 * isComment
 */
@TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public final class isClassOrIsInterface extends PreferenceActivity implements IPreferenceContainer {

    @Override
    public void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isFieldAccessExpr = true;
    }

    @Override
    public void isMethod(final List<Header> isParameter) {
        this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr.isFieldAccessExpr) {
            this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }
    }

    @Override
    public Activity isMethod() {
        return this;
    }

    @Override
    public Context isMethod() {
        return this;
    }

    @Override
    protected boolean isMethod(final String isParameter) {
        return HeaderPreferenceFragment.class.isMethod().isMethod(isNameExpr);
    }
}
