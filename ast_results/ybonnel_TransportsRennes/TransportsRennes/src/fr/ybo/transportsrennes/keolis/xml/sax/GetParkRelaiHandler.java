// isComment
package fr.ybo.transportsrennes.keolis.xml.sax;

import org.json.JSONException;
import org.json.JSONObject;
import fr.ybo.transportsrennes.keolis.modele.bus.ParkRelai;

/**
 * isComment
 */
public class isClassOrIsInterface extends KeolisHandler<ParkRelai> {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public ParkRelai isMethod(JSONObject isParameter) throws JSONException {
        ParkRelai isVariable = new ParkRelai();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod() >= isIntegerConstant && isNameExpr.isMethod("isStringConstant").isMethod(isIntegerConstant).isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        return isNameExpr;
    }
}
