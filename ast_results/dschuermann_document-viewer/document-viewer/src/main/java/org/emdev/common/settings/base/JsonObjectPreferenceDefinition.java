// isComment
package org.emdev.common.settings.base;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

public class isClassOrIsInterface extends BasePreferenceDefinition<JSONObject> {

    public isConstructor(final int isParameter) {
        super(isNameExpr);
    }

    public isConstructor(final String isParameter) {
        super(isNameExpr);
    }

    @Override
    public JSONObject isMethod(final SharedPreferences isParameter) {
        return isMethod(isNameExpr, "isStringConstant");
    }

    public JSONObject isMethod(final SharedPreferences isParameter, final String isParameter) {
        try {
            final String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            return new JSONObject(isNameExpr);
        } catch (final JSONException isParameter) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod());
        }
        return new JSONObject();
    }

    public void isMethod(final Editor isParameter, final JSONObject isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr != null ? isNameExpr.isMethod() : "isStringConstant");
    }

    @Override
    public void isMethod(final JSONObject isParameter, final SharedPreferences isParameter) throws JSONException {
        final JSONObject isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final JSONObject isParameter, final Editor isParameter) throws JSONException {
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }
}
