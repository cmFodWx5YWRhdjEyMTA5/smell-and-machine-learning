// isComment
package cgeo.geocaching.maps.mapsforge;

import cgeo.geocaching.maps.AbstractMapSource;
import cgeo.geocaching.maps.interfaces.MapProvider;
import cgeo.geocaching.maps.mapsforge.v6.layers.DownloadLayer;
import cgeo.geocaching.maps.mapsforge.v6.layers.ITileLayer;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.download.tilesource.OpenStreetMapMapnik;
import org.mapsforge.map.model.MapViewPosition;
import org.mapsforge.v3.android.maps.mapgenerator.MapGeneratorInternal;

public class isClassOrIsInterface extends AbstractMapSource {

    private final MapGeneratorInternal isVariable;

    isConstructor(final String isParameter, final MapProvider isParameter, final String isParameter, final MapGeneratorInternal isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public MapGeneratorInternal isMethod() {
        return isNameExpr;
    }

    public ITileLayer isMethod(final TileCache isParameter, final MapViewPosition isParameter) {
        return new DownloadLayer(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }
}
