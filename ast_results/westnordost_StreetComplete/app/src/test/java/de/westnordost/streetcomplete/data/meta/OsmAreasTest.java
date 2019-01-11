// isComment
package de.westnordost.streetcomplete.data.meta;

import org.junit.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import de.westnordost.osmapi.map.data.OsmRelation;
import de.westnordost.osmapi.map.data.OsmWay;
import de.westnordost.osmapi.map.data.Way;
import static org.junit.Assert.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(new OsmRelation(isIntegerConstant, isIntegerConstant, null, null)));
        Map<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(new OsmRelation(isIntegerConstant, isIntegerConstant, null, isNameExpr)));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod(true, null)));
        isMethod(isNameExpr.isMethod(isMethod(true, null)));
    }

    @Test
    public void isMethod() {
        Map<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(true, isNameExpr)));
        isMethod(isNameExpr.isMethod(isMethod(true, isNameExpr)));
    }

    @Test
    public void isMethod() {
        Map<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(true, isNameExpr)));
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(true, isNameExpr)));
    }

    @Test
    public void isMethod() {
        Map<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(true, isNameExpr)));
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(true, isNameExpr)));
    }

    private Way isMethod(boolean isParameter, Map<String, String> isParameter) {
        List<Long> isVariable = isNameExpr ? isNameExpr.isMethod(isStringConstant, isStringConstant, isStringConstant) : isNameExpr.isMethod(isStringConstant, isStringConstant);
        return new OsmWay(isIntegerConstant, isIntegerConstant, isNameExpr, isNameExpr);
    }
}
