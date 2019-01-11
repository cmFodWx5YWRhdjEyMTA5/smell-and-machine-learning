// isComment
package org.emdev.common.settings.base;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class isClassOrIsInterface extends BasePreferenceDefinition<JSONArray> {

    public isConstructor(final int isParameter) {
        super(isNameExpr);
    }

    @Override
    public JSONArray isMethod(final SharedPreferences isParameter) {
        return isMethod(isNameExpr, "isStringConstant");
    }

    public JSONArray isMethod(final SharedPreferences isParameter, final String isParameter) {
        try {
            final String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            return new JSONArray(isNameExpr);
        } catch (final JSONException isParameter) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod());
        }
        return new JSONArray();
    }

    public void isMethod(final Editor isParameter, final JSONArray isParameter) {
        final String isVariable = isNameExpr != null ? isNameExpr.isMethod() : "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final JSONObject isParameter, final SharedPreferences isParameter) throws JSONException {
        final JSONArray isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(final JSONObject isParameter, final Editor isParameter) throws JSONException {
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }
}
