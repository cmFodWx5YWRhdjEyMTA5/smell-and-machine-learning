// isComment
package de.skubware.opentraining.db.rest;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import de.skubware.opentraining.basic.ExerciseType;
import de.skubware.opentraining.basic.Muscle;
import de.skubware.opentraining.basic.SportsEquipment;
import de.skubware.opentraining.db.rest.ServerModel.Equipment;
import de.skubware.opentraining.db.rest.ServerModel.Language;
import de.skubware.opentraining.db.rest.ServerModel.MuscleCategory;

/**
 * isComment
 */
public class isClassOrIsInterface implements JsonSerializer<ExerciseType> {

    private static final String isVariable = "isStringConstant";

    private static Map<Muscle, MuscleCategory> isVariable;

    private static Map<Locale, Language> isVariable;

    private static Map<SportsEquipment, Equipment> isVariable;

    @Override
    public JsonElement isMethod(ExerciseType isParameter, Type isParameter, JsonSerializationContext isParameter) {
        if (isNameExpr == null || isNameExpr == null || isNameExpr == null)
            throw new NullPointerException("isStringConstant" + isNameExpr + "isStringConstant");
        JsonObject isVariable = new JsonObject();
        // isComment
        if (isNameExpr.isMethod() == null || isNameExpr.isMethod().isMethod() < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        // isComment
        MuscleCategory isVariable = null;
        if (isNameExpr.isMethod().isMethod()) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod().isMethod().isMethod() + "isStringConstant" + isNameExpr.isMethod());
        }
        // isComment
        Map<Locale, String> isVariable = isNameExpr.isMethod();
        Locale isVariable = null;
        for (Locale isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod())) {
                isNameExpr = isNameExpr;
                break;
            }
        }
        Language isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            isNameExpr = isNameExpr.isMethod(new Locale("isStringConstant"));
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        return isNameExpr;
    }

    public static void isMethod(Map<Muscle, MuscleCategory> isParameter) {
        isNameExpr = new HashMap<Muscle, MuscleCategory>(isNameExpr);
    }

    public static void isMethod(Map<Locale, Language> isParameter) {
        isNameExpr = isNameExpr;
    }

    public static void isMethod(Map<SportsEquipment, Equipment> isParameter) {
        isNameExpr = isNameExpr;
    }
}
