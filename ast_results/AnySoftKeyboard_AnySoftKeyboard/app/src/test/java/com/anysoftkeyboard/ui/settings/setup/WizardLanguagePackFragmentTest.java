// isComment
package com.anysoftkeyboard.ui.settings.setup;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.app.Application;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import com.anysoftkeyboard.RobolectricFragmentTestCase;
import com.menny.android.anysoftkeyboard.R;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.robolectric.Shadows;
import java.util.Locale;
import androidx.test.core.app.ApplicationProvider;

public class isClassOrIsInterface extends RobolectricFragmentTestCase<WizardLanguagePackFragment> {

    @After
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    protected WizardLanguagePackFragment isMethod() {
        return new WizardLanguagePackFragment();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        WizardLanguagePackFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        ImageView isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()).isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        WizardLanguagePackFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        ImageView isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()).isMethod());
        View.OnClickListener isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        View.OnClickListener isVariable = isNameExpr.isMethod((View) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod());
        isNameExpr.isMethod(null);
        Intent isVariable = isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isNameExpr);
    }
}
