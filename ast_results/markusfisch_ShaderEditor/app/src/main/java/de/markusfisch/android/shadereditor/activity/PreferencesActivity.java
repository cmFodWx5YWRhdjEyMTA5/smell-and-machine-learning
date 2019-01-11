// isComment
package de.markusfisch.android.shadereditor.activity;

import de.markusfisch.android.shadereditor.fragment.PreferencesFragment;
import android.support.v4.app.Fragment;

public class isClassOrIsInterface extends AbstractContentActivity {

    @Override
    protected Fragment isMethod() {
        return new PreferencesFragment();
    }
}
