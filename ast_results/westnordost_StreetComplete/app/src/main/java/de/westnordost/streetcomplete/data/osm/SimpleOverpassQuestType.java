// isComment
package de.westnordost.streetcomplete.data.osm;

import android.support.annotation.Nullable;
import de.westnordost.osmapi.map.data.Element;
import de.westnordost.streetcomplete.data.osm.download.MapDataWithGeometryHandler;
import de.westnordost.streetcomplete.data.osm.download.OverpassMapDataDao;
import de.westnordost.streetcomplete.data.osm.tql.FiltersParser;
import de.westnordost.streetcomplete.data.osm.tql.OverpassQLUtil;
import de.westnordost.streetcomplete.data.osm.tql.TagFilterExpression;
import de.westnordost.osmapi.map.data.BoundingBox;
import de.westnordost.streetcomplete.util.Lazy;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AOsmElementQuestType {

    private final OverpassMapDataDao isVariable;

    private final Lazy<TagFilterExpression> isVariable;

    public isConstructor(OverpassMapDataDao isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = new Lazy<>(() -> new FiltersParser().isMethod(isMethod()));
    }

    /**
     * isComment
     */
    String isMethod(BoundingBox isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr) + isNameExpr.isMethod();
    }

    protected abstract String isMethod();

    public boolean isMethod(BoundingBox isParameter, MapDataWithGeometryHandler isParameter) {
        return isNameExpr.isMethod(isMethod(isNameExpr), isNameExpr);
    }

    @Nullable
    @Override
    public Boolean isMethod(Element isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
