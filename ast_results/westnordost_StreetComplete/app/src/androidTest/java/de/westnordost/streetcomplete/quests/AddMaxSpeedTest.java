// isComment
package de.westnordost.streetcomplete.quests;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryModify;
import de.westnordost.streetcomplete.quests.max_speed.AddMaxSpeed;
import de.westnordost.streetcomplete.quests.max_speed.AddMaxSpeedForm;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    private static final String isVariable = "isStringConstant";

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd(isNameExpr, "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd(isNameExpr, "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd(isNameExpr + "isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd(isNameExpr, "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(new StringMapEntryModify("isStringConstant", "isStringConstant", "isStringConstant"));
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddMaxSpeed(null);
    }
}
