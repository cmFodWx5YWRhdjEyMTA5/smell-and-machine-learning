// isComment
package de.westnordost.streetcomplete.quests.motorcycle_parking_capacity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.util.Map;
import javax.inject.Inject;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.data.osm.SimpleOverpassQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;
import de.westnordost.streetcomplete.quests.bike_parking_capacity.AddBikeParkingCapacityForm;

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
        return new AddMotorcycleParkingCapacityForm();
    }

    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
        isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)));
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
