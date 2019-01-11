// isComment
package de.westnordost.streetcomplete.quests.toilet_availability;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.util.Map;
import javax.inject.Inject;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.YesNoQuestAnswerFragment;

public class isClassOrIsInterface extends SimpleOverpassQuestType {

    @Inject
    public isConstructor(OverpassMapDataDao isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        // isComment
        return "isStringConstant";
    }

    public AbstractQuestAnswerFragment isMethod() {
        return new YesNoQuestAnswerFragment();
    }

    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) ? "isStringConstant" : "isStringConstant";
        isNameExpr.isMethod("isStringConstant", isNameExpr);
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
        boolean isVariable = "isStringConstant".isMethod(isNameExpr.isMethod("isStringConstant")) || "isStringConstant".isMethod(isNameExpr.isMethod("isStringConstant"));
        if (isNameExpr)
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        else
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
