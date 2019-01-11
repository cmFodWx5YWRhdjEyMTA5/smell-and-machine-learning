// isComment
package fr.ybo.transportsrennes.keolis.xml.sax;

import org.json.JSONException;
import org.json.JSONObject;
import java.text.ParseException;
import fr.ybo.transportsrennes.keolis.modele.bus.Departure;

public class isClassOrIsInterface extends KeolisHandler<Departure> {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public Departure isMethod(JSONObject isParameter) throws JSONException {
        Departure isVariable = new Departure();
        try {
            isNameExpr.isMethod(isMethod(isNameExpr.isMethod("isStringConstant")));
        } catch (ParseException isParameter) {
            throw new JSONException(isNameExpr.isMethod());
        }
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant"));
        return isNameExpr;
    }
}
