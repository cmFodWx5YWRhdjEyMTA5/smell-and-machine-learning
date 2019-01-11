// isComment
package org.servDroid.provider;

import org.servDroid.helper.IPreferenceHelper;
import org.servDroid.helper.PreferenceHelper;
import android.content.Context;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class isClassOrIsInterface implements Provider<IPreferenceHelper> {

    @Inject
    private Context isVariable;

    @Override
    public IPreferenceHelper isMethod() {
        return new PreferenceHelper(isNameExpr);
    }
}
