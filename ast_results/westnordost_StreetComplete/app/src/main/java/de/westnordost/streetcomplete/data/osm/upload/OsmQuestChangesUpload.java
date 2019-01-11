// isComment
package de.westnordost.streetcomplete.data.osm.upload;

import android.content.SharedPreferences;
import javax.inject.Inject;
import de.westnordost.osmapi.changesets.ChangesetsDao;
import de.westnordost.osmapi.map.data.Element;
import de.westnordost.streetcomplete.data.changesets.OpenChangesetsDao;
import de.westnordost.streetcomplete.data.osm.OsmQuest;
import de.westnordost.streetcomplete.data.osm.OsmQuestGiver;
import de.westnordost.streetcomplete.data.osm.persist.ElementGeometryDao;
import de.westnordost.streetcomplete.data.osm.persist.MergedElementDao;
import de.westnordost.streetcomplete.data.osm.persist.OsmQuestDao;
import de.westnordost.streetcomplete.data.statistics.QuestStatisticsDao;
import de.westnordost.osmapi.map.MapDataDao;
import de.westnordost.streetcomplete.data.tiles.DownloadedTilesDao;

public class isClassOrIsInterface extends AOsmQuestChangesUpload {

    @Inject
    public isConstructor(MapDataDao isParameter, OsmQuestDao isParameter, MergedElementDao isParameter, ElementGeometryDao isParameter, QuestStatisticsDao isParameter, OpenChangesetsDao isParameter, ChangesetsDao isParameter, DownloadedTilesDao isParameter, SharedPreferences isParameter, OsmQuestGiver isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected boolean isMethod(OsmQuest isParameter, Element isParameter) {
        Boolean isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        return isNameExpr == null || isNameExpr;
    }
}
