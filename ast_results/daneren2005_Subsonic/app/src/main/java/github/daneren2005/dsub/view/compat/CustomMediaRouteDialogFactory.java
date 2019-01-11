// isComment
package github.daneren2005.dsub.view.compat;

import android.support.v7.app.MediaRouteChooserDialogFragment;
import android.support.v7.app.MediaRouteControllerDialogFragment;
import android.support.v7.app.MediaRouteDialogFactory;

public class isClassOrIsInterface extends MediaRouteDialogFactory {

    @Override
    public MediaRouteChooserDialogFragment isMethod() {
        return new CustomMediaRouteChooserDialogFragment();
    }

    @Override
    public MediaRouteControllerDialogFragment isMethod() {
        return new CustomMediaRouteControllerDialogFragment();
    }
}
