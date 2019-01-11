// isComment
package org.asdtm.fas.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import org.asdtm.fas.R;
import org.asdtm.fas.fragment.HomeMovieFragment;
import org.asdtm.fas.fragment.HomeTVFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class isClassOrIsInterface extends BaseActivity {

    private static final String isVariable = HomeActivity.class.isMethod();

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        FragmentManager isVariable = isMethod();
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isNameExpr = new HomeMovieFragment();
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod();
        }
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isNameExpr = new HomeTVFragment();
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod();
        }
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isMethod(new Intent(this, MoviesActivity.class));
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isMethod(new Intent(this, TvActivity.class));
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        MenuInflater isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return true;
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(new Intent(this, SearchActivity.class));
                return true;
        }
        return super.isMethod(isNameExpr);
    }
}
