// isComment
package de.westnordost.streetcomplete.data.osm.changes;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        StringMapEntryAdd isVariable = new StringMapEntryAdd("isStringConstant", "isStringConstant");
        Map<String, String> isVariable = new HashMap<>();
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Map<String, String> isVariable = new HashMap<>();
        StringMapEntryChange isVariable = new StringMapEntryAdd("isStringConstant", "isStringConstant");
        StringMapEntryChange isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }
}
