// isComment
package org.servDroid.module;

import org.servDroid.helper.IStoreHelper;
import org.servDroid.helper.EmptyStoreHelper;
import com.google.inject.AbstractModule;

public class isClassOrIsInterface extends AbstractModule {

    @Override
    protected void isMethod() {
        isMethod(IStoreHelper.class).isMethod(EmptyStoreHelper.class);
    }
}
