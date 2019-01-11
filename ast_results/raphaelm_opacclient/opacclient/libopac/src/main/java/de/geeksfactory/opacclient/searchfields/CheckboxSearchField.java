// isComment
package de.geeksfactory.opacclient.searchfields;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * isComment
 */
public class isClassOrIsInterface extends SearchField {

    public isConstructor() {
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, String isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public JSONObject isMethod() throws JSONException {
        JSONObject isVariable = super.isMethod();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        return isNameExpr;
    }
}
