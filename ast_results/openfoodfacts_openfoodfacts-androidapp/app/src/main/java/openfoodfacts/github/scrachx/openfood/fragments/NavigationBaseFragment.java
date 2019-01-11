// isComment
package openfoodfacts.github.scrachx.openfood.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import openfoodfacts.github.scrachx.openfood.utils.INavigationItem;
import openfoodfacts.github.scrachx.openfood.utils.NavigationDrawerListener;

abstract class isClassOrIsInterface extends BaseFragment implements INavigationItem {

    private NavigationDrawerListener isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof NavigationDrawerListener) {
            isNameExpr = (NavigationDrawerListener) isNameExpr;
        }
    }

    @Override
    public void isMethod(@NonNull View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isMethod());
        }
    }

    @Override
    public NavigationDrawerListener isMethod() {
        return isNameExpr;
    }
}
