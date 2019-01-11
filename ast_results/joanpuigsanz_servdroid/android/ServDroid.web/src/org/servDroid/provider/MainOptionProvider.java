// isComment
package org.servDroid.provider;

import org.servDroid.ui.option.IMainOptionsList;
import org.servDroid.ui.option.MainOptionList;
import android.content.Context;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class isClassOrIsInterface implements Provider<IMainOptionsList> {

    @Inject
    private Context isVariable;

    @Override
    public IMainOptionsList isMethod() {
        return new MainOptionList();
    }
}
