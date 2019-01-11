// isComment
package net.cyclestreets.routing.domain;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import net.cyclestreets.TestUtils;
import org.junit.Before;
import org.junit.Test;
import org.osmdroid.api.IGeoPoint;
import java.io.IOException;

public class isClassOrIsInterface {

    private final ObjectMapper isVariable = new ObjectMapper();

    @Before
    public void isMethod() {
        SimpleModule isVariable = new SimpleModule();
        isNameExpr.isMethod(IGeoPoint.class, new GeoPointDeserializer());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() throws IOException {
        String isVariable = isNameExpr.isMethod("isStringConstant");
        JourneyDomainObject isVariable = isNameExpr.isMethod(isNameExpr, JourneyDomainObject.class);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
