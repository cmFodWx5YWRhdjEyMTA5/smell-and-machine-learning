// isComment
package de.danoeh.antennapod.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteControllerDialog;
import android.support.v7.app.MediaRouteControllerDialogFragment;
import de.danoeh.antennapod.dialog.CustomMRControllerDialog;

public class isClassOrIsInterface extends MediaRouteControllerDialogFragment {

    @Override
    public MediaRouteControllerDialog isMethod(Context isParameter, Bundle isParameter) {
        return new CustomMRControllerDialog(isNameExpr);
    }
}
