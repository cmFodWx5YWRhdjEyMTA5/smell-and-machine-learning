// isComment
package de.westnordost.streetcomplete.quests;

import java.util.ArrayList;
import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryModify;
import de.westnordost.streetcomplete.quests.sport.AddSport;
import de.westnordost.streetcomplete.quests.sport.AddSportForm;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod("isStringConstant"));
        isMethod(new StringMapEntryModify("isStringConstant", "isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod("isStringConstant"));
        isMethod(new StringMapEntryModify("isStringConstant", "isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod("isStringConstant"));
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    private ArrayList<String> isMethod(String isParameter) {
        ArrayList<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddSport(null);
    }
}
