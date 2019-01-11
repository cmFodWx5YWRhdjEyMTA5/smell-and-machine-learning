// isComment
package de.westnordost.streetcomplete.quests.railway_crossing;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Map;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;

public class isClassOrIsInterface extends SimpleOverpassQuestType {

    public isConstructor(OverpassMapDataDao isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        ArrayList<String> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
    }

    @Override
    public AbstractQuestAnswerFragment isMethod() {
        return new AddRailwayCrossingBarrierForm();
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod(@NonNull Map<String, String> isParameter) {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
