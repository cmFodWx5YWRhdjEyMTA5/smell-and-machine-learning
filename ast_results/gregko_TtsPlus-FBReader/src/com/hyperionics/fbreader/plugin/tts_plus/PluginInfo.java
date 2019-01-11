// isComment
package com.hyperionics.fbreader.plugin.tts_plus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.geometerplus.android.fbreader.api.PluginApi;
import java.util.Collections;
import java.util.List;

public class isClassOrIsInterface extends PluginApi.PluginInfo {

    @Override
    protected List<PluginApi.ActionInfo> isMethod(Context isParameter) {
        if (isNameExpr.isMethod() != null) {
            Intent isVariable = new Intent(isNameExpr.isMethod(), SpeakActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
        return isNameExpr.<PluginApi.ActionInfo>isMethod(new PluginApi.MenuActionInfo(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(), isNameExpr.isFieldAccessExpr));
    }
}
