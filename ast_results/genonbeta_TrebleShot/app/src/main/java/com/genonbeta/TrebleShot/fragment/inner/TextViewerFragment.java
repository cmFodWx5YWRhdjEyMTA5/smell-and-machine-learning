// isComment
package com.genonbeta.TrebleShot.fragment.inner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.genonbeta.TrebleShot.R;
import com.genonbeta.TrebleShot.ui.callback.IconSupport;
import com.genonbeta.TrebleShot.ui.callback.TitleSupport;
import com.genonbeta.android.framework.app.Fragment;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * isComment
 */
public class isClassOrIsInterface extends Fragment implements IconSupport, TitleSupport {

    private TextView isVariable;

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
    }

    @Nullable
    @Override
    public View isMethod(@NonNull LayoutInflater isParameter, @Nullable ViewGroup isParameter, @Nullable Bundle isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NonNull View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @DrawableRes
    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public CharSequence isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
