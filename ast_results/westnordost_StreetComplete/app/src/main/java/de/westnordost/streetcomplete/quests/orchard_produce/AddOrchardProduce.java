// isComment
package de.westnordost.streetcomplete.quests.orchard_produce;

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
    public AbstractQuestAnswerFragment isMethod() {
        return new AddOrchardProduceForm();
    }

    @Override
    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        ArrayList<String> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            if (isNameExpr.isMethod("isStringConstant")) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            } else if (isNameExpr.isMethod("isStringConstant")) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            }
        }
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
