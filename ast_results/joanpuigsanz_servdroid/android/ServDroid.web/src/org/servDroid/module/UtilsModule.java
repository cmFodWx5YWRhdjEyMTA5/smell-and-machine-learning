// isComment
package org.servDroid.module;

import org.servDroid.helper.IPreferenceHelper;
import org.servDroid.helper.IServiceHelper;
import org.servDroid.helper.ServiceHelper;
import org.servDroid.provider.PreferenceHelperProvider;
import com.google.inject.AbstractModule;

public class isClassOrIsInterface extends AbstractModule {

    @Override
    protected void isMethod() {
        isMethod(IPreferenceHelper.class).isMethod(PreferenceHelperProvider.class);
        isMethod(IServiceHelper.class).isMethod(ServiceHelper.class);
    }
}
