// isComment
package de.westnordost.streetcomplete.quests.opening_hours;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.quests.AOsmElementQuestTypeTest;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddOpeningHours(null);
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }
}
