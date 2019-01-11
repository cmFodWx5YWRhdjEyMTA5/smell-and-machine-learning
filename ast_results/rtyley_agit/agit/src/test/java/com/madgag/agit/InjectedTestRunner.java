// isComment
package com.madgag.agit;

import static roboguice.RoboGuice.getInjector;
import android.app.Application;
import com.madgag.agit.shadow.ShadowSherlockActivity;
import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.runners.model.InitializationError;
import roboguice.RoboGuice;
import roboguice.activity.RoboActivity;
import roboguice.inject.RoboInjector;

public class isClassOrIsInterface extends RobolectricTestRunner {

    public isConstructor(Class<?> isParameter) throws InitializationError {
        super(isNameExpr);
        isMethod("isStringConstant");
    }

    @Override
    public void isMethod(Object isParameter) {
        isMethod(new RoboActivity()).isMethod(isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(ShadowSherlockActivity.class);
    }
}
