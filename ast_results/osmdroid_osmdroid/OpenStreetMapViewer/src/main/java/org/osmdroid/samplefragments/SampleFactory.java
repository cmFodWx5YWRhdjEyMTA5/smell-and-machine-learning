// isComment
package org.osmdroid.samplefragments;

import android.os.Build;
import org.osmdroid.ISampleFactory;
import org.osmdroid.samplefragments.animations.AnimatedMarkerHandler;
import org.osmdroid.samplefragments.animations.AnimatedMarkerTimer;
import org.osmdroid.samplefragments.animations.AnimatedMarkerTypeEvaluator;
import org.osmdroid.samplefragments.animations.AnimatedMarkerValueAnimator;
import org.osmdroid.samplefragments.animations.FastZoomSpeedAnimations;
import org.osmdroid.samplefragments.animations.MinMaxZoomLevel;
import org.osmdroid.samplefragments.bookmarks.BookmarkSample;
import org.osmdroid.samplefragments.cache.CacheImport;
import org.osmdroid.samplefragments.cache.CachePurge;
import org.osmdroid.samplefragments.cache.SampleAlternateCacheDir;
import org.osmdroid.samplefragments.cache.SampleCacheDelete;
import org.osmdroid.samplefragments.cache.SampleCacheDownloader;
import org.osmdroid.samplefragments.cache.SampleCacheDownloaderArchive;
import org.osmdroid.samplefragments.cache.SampleCacheDownloaderCustomUI;
import org.osmdroid.samplefragments.cache.SampleJumboCache;
import org.osmdroid.samplefragments.cache.SampleSqliteOnly;
import org.osmdroid.samplefragments.data.AsyncTaskDemoFragment;
import org.osmdroid.samplefragments.data.Gridlines2;
import org.osmdroid.samplefragments.data.HeatMap;
import org.osmdroid.samplefragments.data.SampleGridlines;
import org.osmdroid.samplefragments.data.SampleIISTracker;
import org.osmdroid.samplefragments.data.SampleIISTrackerMotionTrails;
import org.osmdroid.samplefragments.data.SampleMarker;
import org.osmdroid.samplefragments.data.SampleItemizedOverlayMultiClick;
import org.osmdroid.samplefragments.data.SampleMarkerMultiClick;
import org.osmdroid.samplefragments.data.SampleMilitaryIconsItemizedIcons;
import org.osmdroid.samplefragments.data.SampleMilitaryIconsMarker;
import org.osmdroid.samplefragments.data.SampleOsmPath;
import org.osmdroid.samplefragments.data.SampleRace;
import org.osmdroid.samplefragments.data.SampleSimpleFastPointOverlay;
import org.osmdroid.samplefragments.data.SampleSimpleLocation;
import org.osmdroid.samplefragments.data.SampleWithMinimapItemizedOverlayWithFocus;
import org.osmdroid.samplefragments.data.SampleWithMinimapItemizedOverlayWithScale;
import org.osmdroid.samplefragments.data.WeatherGroundOverlaySample;
import org.osmdroid.samplefragments.drawing.DrawCircle10km;
import org.osmdroid.samplefragments.drawing.DrawPolygon;
import org.osmdroid.samplefragments.drawing.DrawPolygonHoles;
import org.osmdroid.samplefragments.drawing.DrawPolygonWithArrows;
import org.osmdroid.samplefragments.drawing.DrawPolygonWithoutVerticalWrapping;
import org.osmdroid.samplefragments.drawing.DrawPolygonWithoutWrapping;
import org.osmdroid.samplefragments.drawing.DrawPolylineWithArrows;
import org.osmdroid.samplefragments.drawing.PressToPlot;
import org.osmdroid.samplefragments.drawing.PressToPlotWithoutWrapping;
import org.osmdroid.samplefragments.drawing.SampleDrawPolyline;
import org.osmdroid.samplefragments.drawing.SampleDrawPolylineWithoutVerticalWrapping;
import org.osmdroid.samplefragments.drawing.SampleDrawPolylineWithoutWrapping;
import org.osmdroid.samplefragments.events.MarkerDrag;
import org.osmdroid.samplefragments.events.SampleAnimateTo;
import org.osmdroid.samplefragments.data.SampleMilestonesNonRepetitive;
import org.osmdroid.samplefragments.events.SampleAnimatedZoomToLocation;
import org.osmdroid.samplefragments.events.SampleLimitedScrollArea;
import org.osmdroid.samplefragments.events.SampleMapBootListener;
import org.osmdroid.samplefragments.events.SampleMapEventListener;
import org.osmdroid.samplefragments.events.SampleZoomRounding;
import org.osmdroid.samplefragments.events.SampleZoomToBounding;
import org.osmdroid.samplefragments.events.ZoomToBoundsOnStartup;
import org.osmdroid.samplefragments.geopackage.GeopackageFeatureTiles;
import org.osmdroid.samplefragments.geopackage.GeopackageFeatures;
import org.osmdroid.samplefragments.geopackage.GeopackageSample;
import org.osmdroid.samplefragments.layers.LayerManager;
import org.osmdroid.samplefragments.layouts.MapInAViewPagerFragment;
import org.osmdroid.samplefragments.layouts.MapInScrollView;
import org.osmdroid.samplefragments.layouts.RecyclerCardView;
import org.osmdroid.samplefragments.layouts.SampleFragmentXmlLayout;
import org.osmdroid.samplefragments.layouts.SampleSplitScreen;
import org.osmdroid.samplefragments.layouts.ScaleBarOnBottom;
import org.osmdroid.samplefragments.layouts.StreetAddressFragment;
import org.osmdroid.samplefragments.location.CompassPointerSample;
import org.osmdroid.samplefragments.location.CompassRoseSample;
import org.osmdroid.samplefragments.location.SampleCustomIconDirectedLocationOverlay;
import org.osmdroid.samplefragments.location.SampleCustomMyLocation;
import org.osmdroid.samplefragments.location.SampleFollowMe;
import org.osmdroid.samplefragments.location.SampleHeadingCompassUp;
import org.osmdroid.samplefragments.location.SampleMyLocationWithClick;
import org.osmdroid.samplefragments.location.SampleRotation;
import org.osmdroid.samplefragments.milstd2525.Plotter;
import org.osmdroid.samplefragments.tileproviders.MapsforgeTileProviderSample;
import org.osmdroid.samplefragments.tileproviders.OfflinePickerSample;
import org.osmdroid.samplefragments.tileproviders.SampleAssetsOnly;
import org.osmdroid.samplefragments.tileproviders.SampleAssetsOnlyRepetitionModes;
import org.osmdroid.samplefragments.tileproviders.SampleOfflineGemfOnly;
import org.osmdroid.samplefragments.tileproviders.SampleOfflineOnly;
import org.osmdroid.samplefragments.tileproviders.SampleVeryHighZoomLevel;
import org.osmdroid.samplefragments.tilesources.SampleBingHybrid;
import org.osmdroid.samplefragments.tilesources.SampleBingRoad;
import org.osmdroid.samplefragments.tilesources.SampleCopyrightOverlay;
import org.osmdroid.samplefragments.tilesources.SampleCustomLoadingImage;
import org.osmdroid.samplefragments.tilesources.SampleCustomTileSource;
import org.osmdroid.samplefragments.tilesources.SampleHereWeGo;
import org.osmdroid.samplefragments.tilesources.SampleInvertedTiles_NightMode;
import org.osmdroid.samplefragments.tilesources.SampleLieFi;
import org.osmdroid.samplefragments.tilesources.SampleMapBox;
import org.osmdroid.samplefragments.tilesources.SampleMapQuest;
import org.osmdroid.samplefragments.tilesources.SampleOfflineFirst;
import org.osmdroid.samplefragments.tilesources.SampleOfflineSecond;
import org.osmdroid.samplefragments.tilesources.SampleOpenSeaMap;
import org.osmdroid.samplefragments.tilesources.SampleWMSSource;
import org.osmdroid.samplefragments.tilesources.SampleWhackyColorFilter;
import org.osmdroid.samplefragments.tilesources.SepiaToneTiles;
import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
public final class isClassOrIsInterface implements ISampleFactory {

    private final List<Class<? extends BaseSampleFragment>> isVariable = new ArrayList<>();

    private static ISampleFactory isVariable;

    public static ISampleFactory isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new SampleFactory();
        }
        return isNameExpr;
    }

    private isConstructor() {
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod(SampleWithMinimapItemizedOverlayWithFocus.class);
        // isComment
        isNameExpr.isMethod(SampleWithMinimapItemizedOverlayWithScale.class);
        // isComment
        isNameExpr.isMethod(SampleLimitedScrollArea.class);
        // isComment
        isNameExpr.isMethod(SampleFragmentXmlLayout.class);
        // isComment
        isNameExpr.isMethod(SampleOsmPath.class);
        isNameExpr.isMethod(SampleRace.class);
        // isComment
        isNameExpr.isMethod(SampleInvertedTiles_NightMode.class);
        // isComment
        isNameExpr.isMethod(SampleOfflineOnly.class);
        // isComment
        isNameExpr.isMethod(SampleAlternateCacheDir.class);
        // isComment
        isNameExpr.isMethod(SampleMilitaryIconsItemizedIcons.class);
        // isComment
        isNameExpr.isMethod(SampleMilitaryIconsMarker.class);
        // isComment
        isNameExpr.isMethod(SampleMapBox.class);
        // isComment
        isNameExpr.isMethod(SampleJumboCache.class);
        // isComment
        isNameExpr.isMethod(SampleCustomTileSource.class);
        // isComment
        isNameExpr.isMethod(SampleAnimatedZoomToLocation.class);
        // isComment
        isNameExpr.isMethod(SampleWhackyColorFilter.class);
        // isComment
        isNameExpr.isMethod(SampleCustomIconDirectedLocationOverlay.class);
        // isComment
        isNameExpr.isMethod(SampleAssetsOnly.class);
        // isComment
        isNameExpr.isMethod(SampleSqliteOnly.class);
        // isComment
        isNameExpr.isMethod(SampleCacheDownloader.class);
        // isComment
        isNameExpr.isMethod(SampleCacheDownloaderCustomUI.class);
        // isComment
        isNameExpr.isMethod(SampleCacheDownloaderArchive.class);
        // isComment
        isNameExpr.isMethod(SampleGridlines.class);
        // isComment
        isNameExpr.isMethod(SampleMapEventListener.class);
        // isComment
        isNameExpr.isMethod(SampleAnimateTo.class);
        // isComment
        isNameExpr.isMethod(SampleHeadingCompassUp.class);
        // isComment
        isNameExpr.isMethod(SampleSplitScreen.class);
        // isComment
        isNameExpr.isMethod(SampleMapBootListener.class);
        // isComment
        isNameExpr.isMethod(SampleFollowMe.class);
        // isComment
        isNameExpr.isMethod(SampleMapQuest.class);
        // isComment
        isNameExpr.isMethod(SampleHereWeGo.class);
        // isComment
        isNameExpr.isMethod(SampleCustomLoadingImage.class);
        // isComment
        isNameExpr.isMethod(AsyncTaskDemoFragment.class);
        // isComment
        isNameExpr.isMethod(CacheImport.class);
        // isComment
        isNameExpr.isMethod(CachePurge.class);
        // isComment
        isNameExpr.isMethod(SampleZoomToBounding.class);
        // isComment
        isNameExpr.isMethod(MapInAViewPagerFragment.class);
        // isComment
        isNameExpr.isMethod(ZoomToBoundsOnStartup.class);
        // isComment
        isNameExpr.isMethod(SampleSimpleLocation.class);
        // isComment
        isNameExpr.isMethod(SampleSimpleFastPointOverlay.class);
        // isComment
        isNameExpr.isMethod(SampleOpenSeaMap.class);
        // isComment
        isNameExpr.isMethod(SampleMarker.class);
        // isComment
        isNameExpr.isMethod(SampleRotation.class);
        // isComment
        isNameExpr.isMethod(HeatMap.class);
        // isComment
        isNameExpr.isMethod(MapInScrollView.class);
        // isComment
        isNameExpr.isMethod(SampleCopyrightOverlay.class);
        // isComment
        isNameExpr.isMethod(SampleIISTracker.class);
        // isComment
        isNameExpr.isMethod(SampleIISTrackerMotionTrails.class);
        // isComment
        isNameExpr.isMethod(SampleMyLocationWithClick.class);
        // isComment
        isNameExpr.isMethod(SampleDrawPolyline.class);
        // isComment
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant)
            isNameExpr.isMethod(RecyclerCardView.class);
        // isComment
        isNameExpr.isMethod(ScaleBarOnBottom.class);
        // isComment
        isNameExpr.isMethod(SampleBingHybrid.class);
        // isComment
        isNameExpr.isMethod(SampleBingRoad.class);
        // isComment
        isNameExpr.isMethod(Gridlines2.class);
        // isComment
        isNameExpr.isMethod(SepiaToneTiles.class);
        // isComment
        isNameExpr.isMethod(AnimatedMarkerTimer.class);
        // isComment
        isNameExpr.isMethod(FastZoomSpeedAnimations.class);
        // isComment
        isNameExpr.isMethod(SampleOfflineGemfOnly.class);
        // isComment
        isNameExpr.isMethod(DrawPolygon.class);
        isNameExpr.isMethod(DrawPolygonHoles.class);
        isNameExpr.isMethod(SampleWMSSource.class);
        isNameExpr.isMethod(SampleAssetsOnlyRepetitionModes.class);
        isNameExpr.isMethod(SampleDrawPolylineWithoutWrapping.class);
        isNameExpr.isMethod(DrawPolygonWithoutWrapping.class);
        // isComment
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            isNameExpr.isMethod(AnimatedMarkerHandler.class);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            isNameExpr.isMethod(AnimatedMarkerTypeEvaluator.class);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            isNameExpr.isMethod(AnimatedMarkerValueAnimator.class);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant)
            isNameExpr.isMethod(MapsforgeTileProviderSample.class);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant)
            isNameExpr.isMethod(OfflinePickerSample.class);
        // isComment
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant) {
            isNameExpr.isMethod(GeopackageSample.class);
            isNameExpr.isMethod(GeopackageFeatures.class);
            isNameExpr.isMethod(GeopackageFeatureTiles.class);
        }
        // isComment
        isNameExpr.isMethod(SampleVeryHighZoomLevel.class);
        isNameExpr.isMethod(MinMaxZoomLevel.class);
        isNameExpr.isMethod(PressToPlot.class);
        isNameExpr.isMethod(PressToPlotWithoutWrapping.class);
        isNameExpr.isMethod(DrawPolygonWithoutVerticalWrapping.class);
        isNameExpr.isMethod(SampleDrawPolylineWithoutVerticalWrapping.class);
        isNameExpr.isMethod(DrawPolylineWithArrows.class);
        isNameExpr.isMethod(DrawPolygonWithArrows.class);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant)
            // isComment
            isNameExpr.isMethod(StreetAddressFragment.class);
        isNameExpr.isMethod(SampleCustomMyLocation.class);
        isNameExpr.isMethod(DrawCircle10km.class);
        isNameExpr.isMethod(MarkerDrag.class);
        isNameExpr.isMethod(SampleCacheDelete.class);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant)
            isNameExpr.isMethod(Plotter.class);
        isNameExpr.isMethod(WeatherGroundOverlaySample.class);
        isNameExpr.isMethod(CompassPointerSample.class);
        isNameExpr.isMethod(CompassRoseSample.class);
        isNameExpr.isMethod(SampleZoomRounding.class);
        isNameExpr.isMethod(LayerManager.class);
        isNameExpr.isMethod(BookmarkSample.class);
        isNameExpr.isMethod(SampleLieFi.class);
        isNameExpr.isMethod(SampleItemizedOverlayMultiClick.class);
        isNameExpr.isMethod(SampleMarkerMultiClick.class);
        isNameExpr.isMethod(SampleMilestonesNonRepetitive.class);
        isNameExpr.isMethod(SampleOfflineFirst.class);
        isNameExpr.isMethod(SampleOfflineSecond.class);
    }

    public void isMethod(Class<? extends BaseSampleFragment> isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public BaseSampleFragment isMethod(int isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr).isMethod();
        } catch (InstantiationException isParameter) {
            isNameExpr.isMethod();
        } catch (IllegalAccessException isParameter) {
            isNameExpr.isMethod();
        }
        return null;
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }
}
