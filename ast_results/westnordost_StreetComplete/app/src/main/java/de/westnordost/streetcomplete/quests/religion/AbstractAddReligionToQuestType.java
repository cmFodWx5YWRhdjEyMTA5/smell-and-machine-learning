// isComment
package de.westnordost.streetcomplete.quests.religion;

import android.os.Bundle;
import java.util.ArrayList;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;

public abstract class isClassOrIsInterface extends SimpleOverpassQuestType {

    public isConstructor(OverpassMapDataDao isParameter) {
        super(isNameExpr);
    }

    @Override
    public AbstractQuestAnswerFragment isMethod() {
        return new AddReligionToPlaceOfWorshipForm();
    }

    @Override
    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        ArrayList<String> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
