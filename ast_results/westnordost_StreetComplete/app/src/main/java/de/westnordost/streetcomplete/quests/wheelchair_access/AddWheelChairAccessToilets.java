// isComment
package de.westnordost.streetcomplete.quests.wheelchair_access;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.util.Map;
import javax.inject.Inject;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;

public class isClassOrIsInterface extends SimpleOverpassQuestType {

    @Inject
    public isConstructor(OverpassMapDataDao isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
    }

    @Override
    public WheelchairAccessAnswerFragment isMethod() {
        return new AddWheelchairAccessToiletsForm();
    }

    @Override
    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
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
        boolean isVariable = isNameExpr.isMethod("isStringConstant");
        return isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
