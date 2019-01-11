// isComment
package fr.ybo.transportsrennes.keolis.xml.sax;

import org.json.JSONException;
import org.json.JSONObject;
import fr.ybo.transportsrennes.keolis.modele.velos.Station;

/**
 * isComment
 */
public class isClassOrIsInterface extends KeolisHandler<Station> {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public Station isMethod(JSONObject isParameter) throws JSONException {
        Station isVariable = new Station();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod() >= isIntegerConstant && isNameExpr.isMethod("isStringConstant").isMethod(isIntegerConstant).isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }
}
