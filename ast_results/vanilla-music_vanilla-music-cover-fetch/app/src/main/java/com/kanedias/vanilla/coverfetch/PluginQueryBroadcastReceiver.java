// isComment
package com.kanedias.vanilla.coverfetch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.kanedias.vanilla.plugins.PluginConstants;
import static com.kanedias.vanilla.plugins.PluginConstants.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends BroadcastReceiver {

    /**
     * isComment
     */
    @Override
    public void isMethod(Context isParameter, Intent isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        if (isNameExpr.isMethod() == null)
            return;
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                isMethod(isNameExpr, isNameExpr);
                return;
            default:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    private void isMethod(Context isParameter, Intent isParameter) {
        Intent isVariable = new Intent(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr);
    }
}
