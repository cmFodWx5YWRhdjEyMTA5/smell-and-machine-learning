// isComment
package de.danoeh.antennapod.config;

import android.support.annotation.NonNull;
import android.support.v7.app.MediaRouteControllerDialogFragment;
import android.support.v7.app.MediaRouteDialogFactory;
import de.danoeh.antennapod.core.CastCallbacks;
import de.danoeh.antennapod.fragment.CustomMRControllerDialogFragment;

public class isClassOrIsInterface implements CastCallbacks {

    @Override
    public MediaRouteDialogFactory isMethod() {
        return new MediaRouteDialogFactory() {

            @NonNull
            @Override
            public MediaRouteControllerDialogFragment isMethod() {
                return new CustomMRControllerDialogFragment();
            }
        };
    }
}
