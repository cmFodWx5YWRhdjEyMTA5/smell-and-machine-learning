// isComment
package fr.ybo.transportsrennes.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.ybo.opentripplanner.client.Constantes;

class isClassOrIsInterface {

    private static Gson isVariable = null;

    public static synchronized Gson isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new GsonBuilder().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        }
        return isNameExpr;
    }
}
