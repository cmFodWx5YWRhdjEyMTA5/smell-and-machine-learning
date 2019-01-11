// isComment
package org.addhen.smssync.presentation.view.ui.activity;

import com.addhen.android.raiburari.presentation.di.HasComponent;
import com.addhen.android.raiburari.presentation.ui.activity.BaseActivity;
import org.addhen.smssync.R;
import org.addhen.smssync.presentation.App;
import org.addhen.smssync.presentation.di.component.AppComponent;
import org.addhen.smssync.presentation.di.component.DaggerWebServiceComponent;
import org.addhen.smssync.presentation.di.component.WebServiceComponent;
import org.addhen.smssync.presentation.view.ui.fragment.AddWebServiceFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseActivity implements HasComponent<WebServiceComponent> {

    private static final String isVariable = "isStringConstant";

    private WebServiceComponent isVariable;

    private AddWebServiceFragment isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
    }

    /**
     * isComment
     */
    public static Intent isMethod(final Context isParameter) {
        return new Intent(isNameExpr, AddWebServiceActivity.class);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
        isNameExpr = (AddWebServiceFragment) isMethod().isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod() {
        isMethod().isMethod(this);
        isNameExpr = isNameExpr.isMethod().isMethod(isMethod()).isMethod(isMethod()).isMethod();
    }

    @Override
    public WebServiceComponent isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public AppComponent isMethod() {
        return isNameExpr.isMethod();
    }
}
