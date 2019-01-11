// isComment
package de.westnordost.streetcomplete.data.osm.changes;

import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant");
        List<StringMapEntryChange> isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(StringMapEntryDelete.class, isNameExpr.isMethod(isIntegerConstant).isMethod());
        StringMapEntryDelete isVariable = (StringMapEntryDelete) isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        List<StringMapEntryChange> isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(StringMapEntryAdd.class, isNameExpr.isMethod(isIntegerConstant).isMethod());
        StringMapEntryAdd isVariable = (StringMapEntryAdd) isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        List<StringMapEntryChange> isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(StringMapEntryModify.class, isNameExpr.isMethod(isIntegerConstant).isMethod());
        StringMapEntryModify isVariable = (StringMapEntryModify) isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    @Test(expected = IllegalStateException.class)
    public void isMethod() {
        StringMapChangesBuilder isVariable = new StringMapChangesBuilder(isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
    }

    private Map<String, String> isMethod() {
        Map<String, String> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        return isNameExpr;
    }
}
