// isComment
package org.servDroid.module;

import org.servDroid.db.LogHelper;
import org.servDroid.provider.MainOptionProvider;
import org.servDroid.ui.option.IMainOptionsList;
import com.google.inject.AbstractModule;

public class isClassOrIsInterface extends AbstractModule {

    @Override
    protected void isMethod() {
        isMethod(IMainOptionsList.class).isMethod(MainOptionProvider.class);
        isMethod(LogHelper.class);
    }
}
