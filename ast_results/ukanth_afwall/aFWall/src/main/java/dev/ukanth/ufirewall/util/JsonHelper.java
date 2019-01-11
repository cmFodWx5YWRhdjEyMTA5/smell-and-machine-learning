// isComment
package dev.ukanth.ufirewall.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class isClassOrIsInterface {

    public static Object isMethod(Object isParameter) throws JSONException {
        if (isNameExpr instanceof Map) {
            JSONObject isVariable = new JSONObject();
            Map isVariable = (Map) isNameExpr;
            for (Object isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isMethod(isNameExpr)));
            }
            return isNameExpr;
        } else if (isNameExpr instanceof Iterable) {
            JSONArray isVariable = new JSONArray();
            for (Object isVariable : ((Iterable) isNameExpr)) {
                isNameExpr.isMethod(isNameExpr);
            }
            return isNameExpr;
        } else {
            return isNameExpr;
        }
    }

    public static boolean isMethod(JSONObject isParameter) {
        return isNameExpr.isMethod() == null;
    }

    public static Map<String, Object> isMethod(JSONObject isParameter, String isParameter) throws JSONException {
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public static Map<String, Object> isMethod(JSONObject isParameter) throws JSONException {
        Map<String, Object> isVariable = new HashMap();
        Iterator isVariable = isNameExpr.isMethod();
        while (isNameExpr.isMethod()) {
            String isVariable = (String) isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr)));
        }
        return isNameExpr;
    }

    public static List isMethod(JSONArray isParameter) throws JSONException {
        List isVariable = new ArrayList();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            isNameExpr.isMethod(isMethod(isNameExpr.isMethod(isNameExpr)));
        }
        return isNameExpr;
    }

    private static Object isMethod(Object isParameter) throws JSONException {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return null;
        } else if (isNameExpr instanceof JSONObject) {
            return isMethod((JSONObject) isNameExpr);
        } else if (isNameExpr instanceof JSONArray) {
            return isMethod((JSONArray) isNameExpr);
        } else {
            return isNameExpr;
        }
    }
}
