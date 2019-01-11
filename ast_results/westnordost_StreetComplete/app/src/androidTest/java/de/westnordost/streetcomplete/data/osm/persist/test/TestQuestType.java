// isComment
package de.westnordost.streetcomplete.data.osm.persist.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Map;
import de.westnordost.osmapi.map.data.BoundingBox;
import de.westnordost.streetcomplete.data.osm.AOsmElementQuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.MapDataWithGeometryHandler;
import de.westnordost.streetcomplete.quests.AbstractQuestAnswerFragment;
import de.westnordost.osmapi.map.data.Element;

public class isClassOrIsInterface extends AOsmElementQuestType {

    @Override
    public void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter) {
    }

    @Override
    public String isMethod() {
        return null;
    }

    @Override
    public boolean isMethod(BoundingBox isParameter, MapDataWithGeometryHandler isParameter) {
        return true;
    }

    @Override
    public AbstractQuestAnswerFragment isMethod() {
        return null;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public int isMethod(@NonNull Map<String, String> isParameter) {
        return isIntegerConstant;
    }

    @Nullable
    @Override
    public Boolean isMethod(Element isParameter) {
        return true;
    }
}
