// isComment
package fr.ybo.transportsrennes.keolis.xml.sax;

import org.json.JSONException;
import org.json.JSONObject;
import fr.ybo.transportsrennes.keolis.modele.bus.PointDeVente;

/**
 * isComment
 */
public class isClassOrIsInterface extends KeolisHandler<PointDeVente> {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    /*isComment*/
    @Override
    public PointDeVente isMethod(JSONObject isParameter) throws JSONException {
        PointDeVente isVariable = new PointDeVente();
        isNameExpr.isFieldAccessExpr = (isNameExpr.isMethod("isStringConstant") == null ? "isStringConstant" : (isNameExpr.isMethod("isStringConstant") + "isStringConstant")) + isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = "isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod("isStringConstant") + "isStringConstant" + "isStringConstant" + isNameExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant").isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }
}
