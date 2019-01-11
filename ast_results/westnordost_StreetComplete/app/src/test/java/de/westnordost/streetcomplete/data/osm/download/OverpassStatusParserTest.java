// isComment
package de.westnordost.streetcomplete.data.osm.download;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isMethod("isStringConstant").isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isMethod("isStringConstant").isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, (int) isMethod("isStringConstant").isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, (int) isMethod("isStringConstant" + "isStringConstant").isFieldAccessExpr);
    }

    private OverpassStatus isMethod(String isParameter) {
        try {
            InputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod("isStringConstant"));
            return new OverpassStatusParser().isMethod(isNameExpr);
        } catch (Exception isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }
}
