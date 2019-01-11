// isComment
package fr.ybo.transportsrennes.keolis.xml.sax;

import org.json.JSONException;
import org.json.JSONObject;
import fr.ybo.transportsrennes.keolis.modele.bus.Alert;

/**
 * isComment
 */
public class isClassOrIsInterface extends KeolisHandler<Alert> {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public Alert isMethod(JSONObject isParameter) throws JSONException {
        Alert isVariable = new Alert();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }
}
