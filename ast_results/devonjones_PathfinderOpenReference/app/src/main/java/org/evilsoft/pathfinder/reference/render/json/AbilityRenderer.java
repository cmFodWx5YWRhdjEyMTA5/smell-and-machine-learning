// isComment
package org.evilsoft.pathfinder.reference.render.json;

import org.evilsoft.pathfinder.reference.db.book.AbilityAdapter;
import org.evilsoft.pathfinder.reference.db.book.BookDbAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;

public class isClassOrIsInterface extends JsonRenderer {

    private BookDbAdapter isVariable;

    public isConstructor(BookDbAdapter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public JSONObject isMethod(JSONObject isParameter, Integer isParameter) throws JSONException {
        Cursor isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        try {
            boolean isVariable = isNameExpr.isMethod();
            JSONArray isVariable = new JSONArray();
            while (isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
                isNameExpr = isNameExpr.isMethod();
            }
            if (isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
        } finally {
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }
}
