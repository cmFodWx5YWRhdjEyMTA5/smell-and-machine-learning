// isComment
package net.cyclestreets.routing.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.util.GeoPoint;
import java.io.IOException;

public class isClassOrIsInterface extends JsonDeserializer<IGeoPoint> {

    @Override
    public IGeoPoint isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException {
        JsonNode isVariable = isNameExpr.isMethod();
        return new GeoPoint(isNameExpr.isMethod("isStringConstant").isMethod(), isNameExpr.isMethod("isStringConstant").isMethod());
    }
}
