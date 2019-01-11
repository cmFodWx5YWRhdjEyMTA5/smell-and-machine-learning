// isComment
package github.daneren2005.dsub.view.compat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteChooserDialog;
import android.support.v7.app.MediaRouteChooserDialogFragment;
import github.daneren2005.dsub.util.ThemeUtil;
import github.daneren2005.dsub.util.Util;

public class isClassOrIsInterface extends MediaRouteChooserDialogFragment {

    @Override
    public MediaRouteChooserDialog isMethod(Context isParameter, Bundle isParameter) {
        return new MediaRouteChooserDialog(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }
}
