// isComment
package fr.ybo.transportsrennes.keolis.xml.sax;

import org.json.JSONException;
import org.json.JSONObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import fr.ybo.transportsrennes.keolis.modele.bus.Departure;
import fr.ybo.transportsrennes.keolis.modele.bus.DepartureMetro;

public class isClassOrIsInterface extends KeolisHandler<Departure> {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public Departure isMethod(JSONObject isParameter) throws JSONException {
        Departure isVariable = new Departure();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod(isIntegerConstant).isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        try {
            isNameExpr.isMethod(isMethod(isNameExpr.isMethod("isStringConstant")));
        } catch (ParseException isParameter) {
            throw new JSONException(isNameExpr.isMethod());
        }
        return isNameExpr;
    }
}
