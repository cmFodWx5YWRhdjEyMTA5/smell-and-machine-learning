// isComment
package fr.ybo.transportsbordeaux.itineraires;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import fr.ybo.opentripplanner.client.modele.Itinerary;
import fr.ybo.opentripplanner.client.modele.TripPlan;

@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface implements Serializable {

    private List<Trajet> isVariable;

    public List<Trajet> isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<Trajet>();
        }
        return isNameExpr;
    }

    public static ItineraireReponse isMethod(TripPlan isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        ItineraireReponse isVariable = new ItineraireReponse();
        if (isNameExpr.isFieldAccessExpr != null) {
            for (Itinerary isVariable : isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr));
            }
        }
        return isNameExpr;
    }
}
