// isComment
package org.flyve.inventory.agent.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.flyve.inventory.agent.R;
import org.flyve.inventory.agent.core.help.Help;
import org.flyve.inventory.agent.core.help.HelpPresenter;
import org.flyve.inventory.agent.utils.Helpers;

public class isClassOrIsInterface extends Fragment implements Help.View {

    private static final String isVariable = "isStringConstant";

    private Help.Presenter isVariable;

    /**
     * isComment
     */
    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        // isComment
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = new HelpPresenter(this);
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.this.isMethod(), isNameExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr.this.isMethod(), isNameExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
    }
}
