// isComment
package de.westnordost.streetcomplete.quests.localized_name;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryModify;
import de.westnordost.streetcomplete.quests.AOsmElementQuestTypeTest;
import de.westnordost.streetcomplete.quests.localized_name.data.PutRoadNameSuggestionsHandler;
import de.westnordost.streetcomplete.quests.localized_name.data.RoadNameSuggestionsDao;
import static org.mockito.Mockito.mock;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant" });
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant", "isStringConstant" });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant", "isStringConstant" });
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant", "isStringConstant", "isStringConstant" });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant", "isStringConstant", "isStringConstant" });
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod(new StringMapEntryModify("isStringConstant", isNameExpr.isMethod("isStringConstant"), "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod(new StringMapEntryModify("isStringConstant", isNameExpr.isMethod("isStringConstant"), "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(new StringMapEntryModify("isStringConstant", isNameExpr.isMethod("isStringConstant"), "isStringConstant"));
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(new StringMapEntryModify("isStringConstant", isNameExpr.isMethod("isStringConstant"), "isStringConstant"));
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(new StringMapEntryModify("isStringConstant", isNameExpr.isMethod("isStringConstant"), "isStringConstant"));
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddRoadName(null, isMethod(RoadNameSuggestionsDao.class), isMethod(PutRoadNameSuggestionsHandler.class));
    }
}
