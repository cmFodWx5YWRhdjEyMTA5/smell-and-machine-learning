// isComment
package org.geometerplus.fbreader.plugin.tts;

import java.util.*;
import android.content.*;
import android.net.Uri;
import org.geometerplus.android.fbreader.api.PluginApi;

public class isClassOrIsInterface extends PluginApi.PluginInfo {

    @Override
    protected List<PluginApi.ActionInfo> isMethod(Context isParameter) {
        return isNameExpr.<PluginApi.ActionInfo>isMethod(new PluginApi.MenuActionInfo(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(), isNameExpr.isFieldAccessExpr));
    }
}
