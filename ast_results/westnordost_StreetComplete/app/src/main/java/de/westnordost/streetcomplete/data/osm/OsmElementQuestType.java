// isComment
package de.westnordost.streetcomplete.data.osm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Map;
import de.westnordost.osmapi.map.data.BoundingBox;
import de.westnordost.osmapi.map.data.Element;
import de.westnordost.streetcomplete.data.QuestType;
import de.westnordost.streetcomplete.data.osm.changes.StringMapChangesBuilder;
import de.westnordost.streetcomplete.data.osm.download.MapDataWithGeometryHandler;

public interface isClassOrIsInterface extends QuestType {

    /**
     * isComment
     */
    void isMethod(Bundle isParameter, StringMapChangesBuilder isParameter);

    /**
     * isComment
     */
    @Nullable
    Boolean isMethod(Element isParameter);

    /**
     * isComment
     */
    String isMethod();

    /**
     * isComment
     */
    boolean isMethod(BoundingBox isParameter, MapDataWithGeometryHandler isParameter);

    /**
     * isComment
     */
    int isMethod(@NonNull Map<String, String> isParameter);

    // isComment
    // isComment
    /**
     * isComment
     */
    @NonNull
    Countries isMethod();

    /**
     * isComment
     */
    void isMethod();

    /**
     * isComment
     */
    boolean isMethod();
}
