// isComment
package de.westnordost.streetcomplete.quests.parking_type;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;

public class isClassOrIsInterface extends SimpleOverpassQuestType {

    @Inject
    public isConstructor(OverpassMapDataDao isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    public AbstractQuestAnswerFragment isMethod() {
        return new AddParkingTypeForm();
    }

    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        List<String> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null && isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
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
