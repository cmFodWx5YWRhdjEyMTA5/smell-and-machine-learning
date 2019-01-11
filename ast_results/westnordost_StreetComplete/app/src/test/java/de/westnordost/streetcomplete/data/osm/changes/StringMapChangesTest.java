// isComment
package de.westnordost.streetcomplete.data.osm.changes;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        List<StringMapEntryChange> isVariable = isNameExpr.isMethod();
        StringMapChanges isVariable = new StringMapChanges(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod());
        // isComment
        Map<String, String> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        StringMapEntryChange isVariable = isMethod(StringMapEntryChange.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        StringMapChanges isVariable = new StringMapChanges(isNameExpr.isMethod(isNameExpr));
        Map<String, String> isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        List<StringMapEntryChange> isVariable = new ArrayList<>();
        StringMapEntryChange isVariable = isMethod(StringMapEntryChange.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        StringMapEntryChange isVariable = isMethod(StringMapEntryChange.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        StringMapChanges isVariable = new StringMapChanges(isNameExpr);
        Map<String, String> isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr);
    }

    @Test(expected = IllegalStateException.class)
    public void isMethod() {
        Map<String, String> isVariable = isNameExpr.isMethod();
        StringMapEntryChange isVariable = isMethod(StringMapEntryChange.class);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(true);
        StringMapChanges isVariable = new StringMapChanges(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        List<StringMapEntryChange> isVariable = new ArrayList<>();
        Map<String, String> isVariable = isNameExpr.isMethod();
        StringMapEntryChange isVariable = isMethod(StringMapEntryChange.class);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(true);
        isNameExpr.isMethod(isMethod(StringMapEntryChange.class));
        isNameExpr.isMethod(isMethod(StringMapEntryChange.class));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod(StringMapEntryChange.class));
        isNameExpr.isMethod(isNameExpr);
        StringMapChanges isVariable = new StringMapChanges(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        Iterator<StringMapEntryChange> isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
