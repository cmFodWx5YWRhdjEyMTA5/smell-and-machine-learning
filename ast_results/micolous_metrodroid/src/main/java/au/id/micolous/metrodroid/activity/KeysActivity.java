// isComment
package au.id.micolous.metrodroid.activity;

import android.app.Fragment;
import au.id.micolous.metrodroid.fragment.KeysFragment;

public class isClassOrIsInterface extends FragmentWrapperActivity {

    @Override
    protected Fragment isMethod() {
        return new KeysFragment();
    }
}
