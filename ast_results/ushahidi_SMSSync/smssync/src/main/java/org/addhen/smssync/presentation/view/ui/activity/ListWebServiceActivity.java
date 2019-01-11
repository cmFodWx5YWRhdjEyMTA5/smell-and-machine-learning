// isComment
package org.addhen.smssync.presentation.view.ui.activity;

import com.addhen.android.raiburari.presentation.di.HasComponent;
import com.addhen.android.raiburari.presentation.ui.activity.BaseActivity;
import org.addhen.smssync.R;
import org.addhen.smssync.presentation.App;
import org.addhen.smssync.presentation.di.component.AppComponent;
import org.addhen.smssync.presentation.di.component.DaggerWebServiceComponent;
import org.addhen.smssync.presentation.di.component.WebServiceComponent;
import org.addhen.smssync.presentation.model.WebServiceModel;
import org.addhen.smssync.presentation.view.ui.fragment.ListWebServiceFragment;
import org.addhen.smssync.presentation.view.ui.navigation.Launcher;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import javax.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseActivity implements HasComponent<WebServiceComponent>, ListWebServiceFragment.WebServiceListListener {

    private static final String isVariable = "isStringConstant";

    @Inject
    Launcher isVariable;

    private ListWebServiceFragment isVariable;

    private WebServiceComponent isVariable;

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
        return new Intent(isNameExpr, ListWebServiceActivity.class);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
        isNameExpr = (ListWebServiceFragment) isMethod().isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
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
        return ((App) isMethod()).isMethod();
    }

    @Override
    public void isMethod(WebServiceModel isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
