// isComment
package org.wahtod.wififixer.legacy;

import android.content.Context;
import org.wahtod.wififixer.WFMonitorService;
import org.wahtod.wififixer.prefs.PrefUtil;

public class isClassOrIsInterface extends VersionedScreenState {

    @Override
    public boolean isMethod(Context isParameter) {
        return !isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
