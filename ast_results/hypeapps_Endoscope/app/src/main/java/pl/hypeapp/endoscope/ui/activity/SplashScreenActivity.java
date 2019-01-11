// isComment
package pl.hypeapp.endoscope.ui.activity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import net.grandcentrix.thirtyinch.TiActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import pl.hypeapp.endoscope.R;
import pl.hypeapp.endoscope.presenter.SplashScreenPresenter;
import pl.hypeapp.endoscope.ui.animation.SmallBang;
import pl.hypeapp.endoscope.ui.animation.SmallBangListener;
import pl.hypeapp.endoscope.util.SettingsPreferencesUtil;
import pl.hypeapp.endoscope.view.SplashScreenView;

public class isClassOrIsInterface extends TiActivity<SplashScreenPresenter, SplashScreenView> implements SplashScreenView {

    private static final int isVariable = isIntegerConstant;

    private SplashScreenPresenter isVariable;

    private SmallBang isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @NonNull
    @Override
    public SplashScreenPresenter isMethod() {
        final SettingsPreferencesUtil isVariable = new SettingsPreferencesUtil(isNameExpr.isMethod(this));
        isNameExpr = new SplashScreenPresenter(isNameExpr);
        return isNameExpr;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, isNameExpr, new SmallBangListener() {

            @Override
            public void isMethod() {
                ((AnimationDrawable) isNameExpr.isMethod()).isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }

            @Override
            public void isMethod() {
                isNameExpr.isMethod();
            }
        });
    }

    @Override
    public void isMethod() {
        Intent isVariable = new Intent(isNameExpr.this, MainMenuActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        Intent isVariable = new Intent(isNameExpr.this, HowToUseActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }
}
