// isComment
package de.westnordost.streetcomplete.quests;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.quests.building_levels.AddBuildingLevels;
import de.westnordost.streetcomplete.quests.building_levels.AddBuildingLevelsForm;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddBuildingLevels(null);
    }
}
