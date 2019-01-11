// isComment
package de.westnordost.streetcomplete.quests;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.quests.postbox_collection_times.AddCollectionTimesForm;
import de.westnordost.streetcomplete.quests.postbox_collection_times.AddPostboxCollectionTimes;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddPostboxCollectionTimes(null);
    }
}
