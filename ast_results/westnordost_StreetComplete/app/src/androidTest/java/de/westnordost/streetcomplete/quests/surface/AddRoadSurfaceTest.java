// isComment
package de.westnordost.streetcomplete.quests.surface;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.quests.AOsmElementQuestTypeTest;
import de.westnordost.streetcomplete.quests.GroupedImageListQuestAnswerFragment;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddRoadSurface(null);
    }
}
