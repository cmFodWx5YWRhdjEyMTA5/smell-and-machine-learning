// isComment
package github.daneren2005.dsub.view.compat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteControllerDialog;
import android.support.v7.app.MediaRouteControllerDialogFragment;
import github.daneren2005.dsub.util.ThemeUtil;
import github.daneren2005.dsub.util.Util;

public class isClassOrIsInterface extends MediaRouteControllerDialogFragment {

    @Override
    public MediaRouteControllerDialog isMethod(Context isParameter, Bundle isParameter) {
        return new MediaRouteControllerDialog(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }
}
