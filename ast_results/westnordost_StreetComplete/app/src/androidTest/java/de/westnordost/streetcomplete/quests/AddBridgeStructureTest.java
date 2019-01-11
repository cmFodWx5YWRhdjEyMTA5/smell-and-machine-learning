// isComment
package de.westnordost.streetcomplete.quests;

import java.util.ArrayList;
import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.quests.bridge_structure.AddBridgeStructure;
import de.westnordost.streetcomplete.quests.recycling.AddRecyclingTypeForm;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    public void isMethod() {
        ArrayList<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddBridgeStructure(null);
    }
}
