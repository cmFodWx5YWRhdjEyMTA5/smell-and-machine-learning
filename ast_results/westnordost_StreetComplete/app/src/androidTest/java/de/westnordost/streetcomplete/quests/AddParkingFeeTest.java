// isComment
package de.westnordost.streetcomplete.quests;

import de.westnordost.streetcomplete.data.osm.OsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapEntryAdd;
import de.westnordost.streetcomplete.quests.parking_fee.AddParkingFee;
import de.westnordost.streetcomplete.quests.parking_fee.AddParkingFeeForm;

public class isClassOrIsInterface extends AOsmElementQuestTypeTest {

    @Override
    protected OsmElementQuestType isMethod() {
        return new AddParkingFee(null);
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(new StringMapEntryAdd("isStringConstant", "isStringConstant"), new StringMapEntryAdd("isStringConstant", "isStringConstant"));
    }
}
