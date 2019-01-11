// isComment
package org.sufficientlysecure.keychain;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.sufficientlysecure.keychain.shadows.ShadowWorkManager;

public class isClassOrIsInterface extends RobolectricTestRunner {

    public isConstructor(Class<?> isParameter) throws InitializationError {
        super(isNameExpr);
    }

    @Override
    protected Config isMethod() {
        return new Config.Builder().isMethod(isIntegerConstant).isMethod(WorkaroundBuildConfig.class).isMethod(new Class[] { ShadowWorkManager.class }).isMethod();
    }
}
