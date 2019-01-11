// isComment
package openfoodfacts.github.scrachx.openfood.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import openfoodfacts.github.scrachx.openfood.R;
import openfoodfacts.github.scrachx.openfood.models.State;
import openfoodfacts.github.scrachx.openfood.views.listeners.OnRefreshListener;
import openfoodfacts.github.scrachx.openfood.views.listeners.OnRefreshView;

public abstract class isClassOrIsInterface extends Fragment implements SwipeRefreshLayout.OnRefreshListener, OnRefreshView {

    private SwipeRefreshLayout isVariable;

    private OnRefreshListener isVariable;

    public isConstructor() {
        super();
    }

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof OnRefreshListener) {
            isNameExpr = (OnRefreshListener) isNameExpr;
        }
    }

    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, int isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isNameExpr.isMethod(this, isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(@NonNull View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod(State isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
        }
    }
}
