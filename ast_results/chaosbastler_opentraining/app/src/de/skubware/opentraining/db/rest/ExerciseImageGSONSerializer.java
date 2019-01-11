// isComment
package de.skubware.opentraining.db.rest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import de.skubware.opentraining.activity.create_workout.upload_exercise.ExerciseImage;
import de.skubware.opentraining.basic.ExerciseType;
import de.skubware.opentraining.basic.License;
import de.skubware.opentraining.basic.Muscle;
import de.skubware.opentraining.basic.SportsEquipment;
import de.skubware.opentraining.db.DataProvider;
import de.skubware.opentraining.db.rest.ServerModel.Equipment;
import de.skubware.opentraining.db.rest.ServerModel.Language;
import de.skubware.opentraining.db.rest.ServerModel.MuscleCategory;

/**
 * isComment
 */
public class isClassOrIsInterface implements JsonSerializer<ExerciseImage> {

    private static final String isVariable = "isStringConstant";

    @Override
    public JsonElement isMethod(ExerciseImage isParameter, Type isParameter, JsonSerializationContext isParameter) {
        JsonObject isVariable = new JsonObject();
        FileInputStream isVariable = null;
        String isVariable = null;
        try {
            isNameExpr = new FileInputStream(isNameExpr.isMethod());
        } catch (FileNotFoundException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            isNameExpr.isMethod();
        }
        Bitmap isVariable = isNameExpr.isMethod(isNameExpr);
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr);
        byte[] isVariable = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        return isNameExpr;
    }
}
