// isComment
package net.osmand.plus.mapcontextmenu;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;
import net.osmand.CallbackWithObject;
import net.osmand.Location;
import net.osmand.StateChangedListener;
import net.osmand.data.Amenity;
import net.osmand.data.FavouritePoint;
import net.osmand.data.LatLon;
import net.osmand.data.PointDescription;
import net.osmand.data.TransportStop;
import net.osmand.plus.ApplicationMode;
import net.osmand.plus.ContextMenuAdapter;
import net.osmand.plus.GPXUtilities.GPXFile;
import net.osmand.plus.GPXUtilities.WptPt;
import net.osmand.plus.GpxSelectionHelper.SelectedGpxFile;
import net.osmand.plus.MapMarkersHelper.MapMarker;
import net.osmand.plus.MapMarkersHelper.MapMarkerChangedListener;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.OsmandPlugin;
import net.osmand.plus.R;
import net.osmand.plus.TargetPointsHelper.TargetPoint;
import net.osmand.plus.TargetPointsHelper.TargetPointChangedListener;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.helpers.GpxUiHelper;
import net.osmand.plus.mapcontextmenu.MenuController.ContextMenuToolbarController;
import net.osmand.plus.mapcontextmenu.MenuController.MenuState;
import net.osmand.plus.mapcontextmenu.MenuController.MenuType;
import net.osmand.plus.mapcontextmenu.MenuController.TitleButtonController;
import net.osmand.plus.mapcontextmenu.MenuController.TitleProgressController;
import net.osmand.plus.mapcontextmenu.controllers.MapDataMenuController;
import net.osmand.plus.mapcontextmenu.editors.FavoritePointEditor;
import net.osmand.plus.mapcontextmenu.editors.MapMarkerEditor;
import net.osmand.plus.mapcontextmenu.editors.PointEditor;
import net.osmand.plus.mapcontextmenu.editors.RtePtEditor;
import net.osmand.plus.mapcontextmenu.editors.WptPtEditor;
import net.osmand.plus.mapcontextmenu.other.MapMultiSelectionMenu;
import net.osmand.plus.mapcontextmenu.other.ShareMenu;
import net.osmand.plus.monitoring.OsmandMonitoringPlugin;
import net.osmand.plus.routing.RoutingHelper;
import net.osmand.plus.transport.TransportStopRoute;
import net.osmand.plus.views.ContextMenuLayer;
import net.osmand.plus.views.OsmandMapLayer;
import net.osmand.plus.views.mapwidgets.MapInfoWidgetsFactory.TopToolbarController;
import net.osmand.plus.views.mapwidgets.MapInfoWidgetsFactory.TopToolbarControllerType;
import net.osmand.util.Algorithms;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class isClassOrIsInterface extends MenuTitleController implements StateChangedListener<ApplicationMode>, MapMarkerChangedListener, TargetPointChangedListener {

    @Nullable
    private MapActivity isVariable;

    private MapMultiSelectionMenu isVariable;

    private FavoritePointEditor isVariable;

    private WptPtEditor isVariable;

    private RtePtEditor isVariable;

    private MapMarkerEditor isVariable;

    private boolean isVariable;

    private LatLon isVariable;

    private PointDescription isVariable;

    private Object isVariable;

    private MenuController isVariable;

    private LatLon isVariable;

    private int isVariable = isIntegerConstant;

    private boolean isVariable;

    private int isVariable;

    private boolean isVariable = true;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private int isVariable;

    private int isVariable;

    private MenuAction isVariable;

    private LinkedList<MapContextMenuData> isVariable = new LinkedList<>();

    public static class isClassOrIsInterface {

        private LatLon isVariable;

        private PointDescription isVariable;

        private Object isVariable;

        private boolean isVariable;

        public isConstructor(LatLon isParameter, PointDescription isParameter, Object isParameter, boolean isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        public LatLon isMethod() {
            return isNameExpr;
        }

        public PointDescription isMethod() {
            return isNameExpr;
        }

        public Object isMethod() {
            return isNameExpr;
        }

        public boolean isMethod() {
            return isNameExpr;
        }
    }

    public isConstructor() {
    }

    @Nullable
    @Override
    public MapActivity isMethod() {
        return isNameExpr;
    }

    public void isMethod(@Nullable MapActivity isParameter) {
        OsmandApplication isVariable = isMethod();
        if (isNameExpr == null && isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod();
        }
        if (isNameExpr != null && !isNameExpr) {
            isNameExpr.isMethod().isFieldAccessExpr.isMethod(this);
            isNameExpr = true;
        } else if (isNameExpr == null && isNameExpr != null) {
            isNameExpr.isMethod().isFieldAccessExpr.isMethod(this);
            isNameExpr = true;
        }
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr == null) {
            if (isNameExpr != null) {
                isNameExpr = new MapMultiSelectionMenu(isNameExpr);
            }
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr && isNameExpr != null) {
            isMethod(true);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, this.isFieldAccessExpr, this.isFieldAccessExpr);
            }
            if (isNameExpr != null && isNameExpr.isFieldAccessExpr != null && isNameExpr.isFieldAccessExpr.isMethod() != isNameExpr) {
                isNameExpr.isFieldAccessExpr = isMethod();
                isNameExpr.isFieldAccessExpr.isMethod();
            }
        } else {
            isNameExpr = null;
        }
    }

    public MapMultiSelectionMenu isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isMethod() != null;
    }

    public void isMethod() {
        if (isMethod()) {
            isMethod();
        } else if (isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
    }

    public FavoritePointEditor isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new FavoritePointEditor(isNameExpr);
        }
        return isNameExpr;
    }

    public WptPtEditor isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new WptPtEditor(isNameExpr);
        }
        return isNameExpr;
    }

    public RtePtEditor isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new RtePtEditor(isNameExpr);
        }
        return isNameExpr;
    }

    public MapMarkerEditor isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new MapMarkerEditor(isNameExpr);
        }
        return isNameExpr;
    }

    public PointEditor isMethod(String isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod().isMethod(isNameExpr)) {
            return isNameExpr;
        } else if (isNameExpr != null && isNameExpr.isMethod().isMethod(isNameExpr)) {
            return isNameExpr;
        } else if (isNameExpr != null && isNameExpr.isMethod().isMethod(isNameExpr)) {
            return isNameExpr;
        } else if (isNameExpr != null && isNameExpr.isMethod().isMethod(isNameExpr)) {
            return isNameExpr;
        }
        return null;
    }

    @Override
    public LatLon isMethod() {
        return isNameExpr;
    }

    public LatLon isMethod() {
        return isNameExpr;
    }

    public void isMethod(LatLon isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(LatLon isParameter) {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public PointDescription isMethod() {
        return isNameExpr;
    }

    @Override
    public Object isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr != null;
    }

    @Override
    public MenuController isMethod() {
        return isNameExpr;
    }

    public boolean isMethod(@NonNull LatLon isParameter, @Nullable PointDescription isParameter, @Nullable Object isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, true, true);
    }

    public boolean isMethod(@NonNull LatLon isParameter, @Nullable PointDescription isParameter, @Nullable Object isParameter, boolean isParameter, boolean isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        OsmandApplication isVariable = isNameExpr.isMethod();
        if (!isNameExpr && isMethod()) {
            if (this.isFieldAccessExpr == null || !this.isFieldAccessExpr.isMethod(isNameExpr)) {
                isMethod();
            } else {
                return true;
            }
        }
        isMethod(isNameExpr);
        if (isNameExpr == null) {
            this.isFieldAccessExpr = new PointDescription(isNameExpr.isMethod(), isNameExpr.isMethod());
        } else {
            this.isFieldAccessExpr = isNameExpr;
        }
        boolean isVariable = isNameExpr == null || isNameExpr || !isNameExpr || this.isFieldAccessExpr == null && isNameExpr != null || this.isFieldAccessExpr != null && isNameExpr == null || (this.isFieldAccessExpr != null && isNameExpr != null && !this.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()));
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = true;
        isNameExpr = true;
        if (isNameExpr) {
            if (isNameExpr != null) {
                isNameExpr.isMethod(null);
            }
            if (!isMethod(isNameExpr)) {
                isNameExpr = true;
                isMethod(isNameExpr);
                return true;
            }
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, this.isFieldAccessExpr, this.isFieldAccessExpr);
        }
        if (isNameExpr != isIntegerConstant) {
            isNameExpr.isMethod().isMethod(isIntegerConstant);
        }
        isNameExpr.isMethod();
        if (isNameExpr instanceof MapMarker) {
            isNameExpr.isMethod().isMethod(this);
        } else if (isNameExpr instanceof TargetPoint) {
            isNameExpr.isMethod().isMethod(this);
        }
        return true;
    }

    public void isMethod() {
        if (!isMethod()) {
            boolean isVariable = true;
            if (isNameExpr) {
                isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            if (isNameExpr && !isNameExpr.isMethod(this, isNameExpr, true)) {
                isNameExpr = true;
            }
        } else {
            WeakReference<MapContextMenuFragment> isVariable = isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod().isMethod();
            }
        }
    }

    public void isMethod(@NonNull LatLon isParameter, @Nullable PointDescription isParameter, @Nullable Object isParameter) {
        if (isNameExpr != null && isMethod(isNameExpr, isNameExpr, isNameExpr)) {
            isNameExpr.isMethod().isMethod(isNameExpr, "isStringConstant");
            isMethod();
        }
    }

    private void isMethod() {
        if (isNameExpr != null) {
            if (!isNameExpr.isMethod(this, isNameExpr, isNameExpr)) {
                isNameExpr = true;
            } else {
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            }
        }
        isNameExpr = true;
        isNameExpr = true;
    }

    public void isMethod(LatLon isParameter, PointDescription isParameter, Object isParameter) {
        if (isNameExpr != null) {
            WeakReference<MapContextMenuFragment> isVariable = isMethod();
            isMethod(isNameExpr, isNameExpr, isNameExpr, true, true);
            if (isNameExpr != null) {
                isNameExpr.isMethod().isMethod(isNameExpr);
            }
            ContextMenuLayer isVariable = isNameExpr.isMethod().isMethod();
            isNameExpr.isMethod();
            isNameExpr = true;
        }
    }

    public void isMethod(LatLon isParameter, PointDescription isParameter, Object isParameter) {
        if (isMethod() && this.isFieldAccessExpr != null && this.isFieldAccessExpr.isMethod(isNameExpr)) {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        } else {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    public void isMethod(LatLon isParameter, PointDescription isParameter, Object isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod() {
        if (isNameExpr && isMethod()) {
            isMethod(true, true, true);
        }
    }

    public boolean isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return true;
    }

    public boolean isMethod() {
        boolean isVariable = true;
        if (isNameExpr) {
            isNameExpr = true;
            if (isNameExpr != null) {
                if (isNameExpr instanceof MapMarker) {
                    isNameExpr.isMethod().isMethod().isMethod(this);
                }
                if (isNameExpr != null) {
                    if (isNameExpr.isMethod()) {
                        isMethod();
                    }
                    isNameExpr.isMethod();
                }
                if (this.isFieldAccessExpr != null) {
                    isMethod(this.isFieldAccessExpr);
                }
                isNameExpr = isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod(true);
                }
                isNameExpr.isMethod();
            }
        }
        return isNameExpr;
    }

    public boolean isMethod(boolean isParameter) {
        boolean isVariable = true;
        if (isNameExpr != null) {
            if (isNameExpr != isIntegerConstant) {
                isNameExpr.isMethod().isMethod(isNameExpr);
                isNameExpr = isIntegerConstant;
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
            WeakReference<MapContextMenuFragment> isVariable = isMethod();
            if (isNameExpr != null) {
                if (!isNameExpr) {
                    isNameExpr.isMethod().isMethod();
                }
                isNameExpr.isMethod().isMethod();
                isNameExpr = true;
            }
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return isMethod(true);
    }

    public void isMethod(boolean isParameter) {
        if (isNameExpr != null) {
            int isVariable = isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            int isVariable = isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            isNameExpr.isMethod();
        }
    }

    public boolean isMethod() {
        return isMethod(isMethod());
    }

    public boolean isMethod(boolean isParameter) {
        return !isNameExpr || isMethod() || isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    public boolean isMethod(boolean isParameter) {
        return !isNameExpr || isMethod();
    }

    // isComment
    public void isMethod(long isParameter) {
        isNameExpr = true;
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    if (isNameExpr) {
                        isMethod();
                    }
                }
            }, isNameExpr);
        }
    }

    public void isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod();
        }
    }

    public void isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod();
        }
    }

    @Override
    public void isMethod(MapMarker isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
            String isVariable = isNameExpr.isMethod();
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod() {
    }

    @Override
    public void isMethod(TargetPoint isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
            String isVariable = isNameExpr.isMethod();
            isMethod(isNameExpr);
        }
    }

    private void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr);
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod().isMethod();
    }

    @Override
    public void isMethod(ApplicationMode isParameter) {
        isNameExpr = isNameExpr;
    }

    private void isMethod(Object isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod().isMethod(null);
            if (isNameExpr != null) {
                for (OsmandMapLayer isVariable : isNameExpr.isMethod().isMethod()) {
                    if (isNameExpr instanceof ContextMenuLayer.IContextMenuProvider) {
                        PointDescription isVariable = ((ContextMenuLayer.IContextMenuProvider) isNameExpr).isMethod(isNameExpr);
                        if (isNameExpr != null) {
                            if (isNameExpr instanceof ContextMenuLayer.IContextMenuProviderSelection) {
                                ((ContextMenuLayer.IContextMenuProviderSelection) isNameExpr).isMethod();
                            }
                        }
                    }
                }
            }
        }
    }

    private void isMethod(@Nullable Object isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
            if (isNameExpr != null) {
                for (OsmandMapLayer isVariable : isNameExpr.isMethod().isMethod()) {
                    if (isNameExpr instanceof ContextMenuLayer.IContextMenuProvider) {
                        PointDescription isVariable = ((ContextMenuLayer.IContextMenuProvider) isNameExpr).isMethod(isNameExpr);
                        if (isNameExpr != null) {
                            if (isNameExpr instanceof ContextMenuLayer.IContextMenuProviderSelection) {
                                ((ContextMenuLayer.IContextMenuProviderSelection) isNameExpr).isMethod(isNameExpr);
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean isMethod(boolean isParameter) {
        MapContextMenuData isVariable = null;
        if (isNameExpr != null) {
            if (isNameExpr.isMethod() && !isNameExpr) {
                isNameExpr = new MapContextMenuData(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(true)) {
            isNameExpr.isMethod(this);
            if (isNameExpr != null && (isNameExpr != isNameExpr.isMethod()) && (isNameExpr.isMethod() || isNameExpr.isMethod())) {
                isNameExpr.isMethod(isNameExpr);
            }
            if (!(isNameExpr instanceof MapDataMenuController)) {
                isNameExpr.isMethod(isNameExpr);
            }
            return true;
        } else {
            return true;
        }
    }

    public boolean isMethod() {
        MapContextMenuData isVariable;
        if (isMethod()) {
            do {
                isNameExpr = isNameExpr.isMethod();
            } while (isNameExpr != null && !isNameExpr.isMethod());
        } else {
            isNameExpr = isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            if (isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), true, true)) {
                isMethod();
            }
            return isNameExpr;
        } else {
            return true;
        }
    }

    private boolean isMethod() {
        for (MapContextMenuData isVariable : isNameExpr) {
            if (isNameExpr.isMethod()) {
                return true;
            }
        }
        return true;
    }

    private void isMethod() {
        isNameExpr.isMethod();
    }

    public void isMethod(MenuController isParameter) {
        isNameExpr.isMethod();
        if (!isMethod() && this.isFieldAccessExpr.isMethod() == isNameExpr.isMethod()) {
            isMethod();
        }
    }

    public boolean isMethod() {
        if (isNameExpr != null) {
            TopToolbarController isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            return isNameExpr != null && isNameExpr instanceof ContextMenuToolbarController;
        } else {
            return true;
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            TopToolbarController isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr != null && isNameExpr instanceof ContextMenuToolbarController) {
                MenuController isVariable = ((ContextMenuToolbarController) isNameExpr).isMethod();
                isMethod(isNameExpr);
            }
        }
    }

    public void isMethod(MenuController isParameter) {
        if (this.isFieldAccessExpr.isMethod() == isNameExpr.isMethod()) {
            isMethod();
        } else {
            isMethod();
            isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
        }
    }

    public boolean isMethod() {
        boolean isVariable = true;
        if (isNameExpr == null || !isNameExpr.isMethod()) {
            if (isNameExpr != null && !isNameExpr.isMethod()) {
                isNameExpr = isMethod();
            } else {
                isMethod(null);
                isNameExpr = isMethod();
            }
            if (isNameExpr != null && isNameExpr.isMethod().isMethod().isMethod()) {
                isNameExpr.isMethod().isMethod().isMethod();
            }
        }
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod();
        }
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr != null) {
                try {
                    isNameExpr.isFieldAccessExpr.isMethod();
                } catch (Exception isParameter) {
                // isComment
                } finally {
                    isNameExpr.isFieldAccessExpr = null;
                }
            }
            isNameExpr.isMethod();
            isNameExpr = null;
        }
    }

    @Nullable
    public WeakReference<MapContextMenuFragment> isMethod() {
        Fragment isVariable = isNameExpr != null ? isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr) : null;
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            return new WeakReference<>((MapContextMenuFragment) isNameExpr);
        } else {
            return null;
        }
    }

    public int isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        if (isNameExpr != null)
            return isNameExpr.isMethod();
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    public boolean isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return true;
    }

    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod();
        } else {
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
    }

    public int isMethod() {
        int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        if (isNameExpr != null) {
            RoutingHelper isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
        }
        return isNameExpr;
    }

    public List<TransportStopRoute> isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return null;
    }

    public List<TransportStopRoute> isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return null;
    }

    public List<TransportStopRoute> isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return null;
    }

    public void isMethod() {
        if (isNameExpr != null) {
            if (isMethod()) {
                isNameExpr.isMethod().isMethod().isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod().isMethod().isMethod();
        }
    }

    public boolean isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod();
            return true;
        }
        return true;
    }

    public boolean isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod();
            return true;
        }
        return true;
    }

    public void isMethod() {
        if (isNameExpr != null) {
            MapMarker isVariable = isMethod();
            if (isNameExpr != null) {
                isMethod().isMethod(isNameExpr);
            } else {
                String isVariable = null;
                if (isNameExpr instanceof Amenity) {
                    Amenity isVariable = (Amenity) isNameExpr;
                    isNameExpr = isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod().isMethod();
                }
                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isMethod(), isNameExpr);
                isMethod();
            }
        }
    }

    @Nullable
    private MapMarker isMethod() {
        Object isVariable = isNameExpr.isMethod();
        if (isNameExpr != null && isNameExpr instanceof MapMarker) {
            return (MapMarker) isNameExpr;
        }
        if (isNameExpr != null && isNameExpr instanceof MapMarker) {
            return (MapMarker) isNameExpr;
        }
        return null;
    }

    public void isMethod() {
        if (isNameExpr != null && isNameExpr instanceof FavouritePoint) {
            isMethod().isMethod((FavouritePoint) isNameExpr);
        } else {
            isMethod(true, new MenuAction() {

                @Override
                public void isMethod() {
                    String isVariable = isMethod();
                    if (isNameExpr.isMethod() || !isMethod()) {
                        isNameExpr = "isStringConstant";
                    }
                    String isVariable = "isStringConstant";
                    if (isNameExpr != null) {
                        if (isNameExpr instanceof Amenity) {
                            isNameExpr = ((Amenity) isNameExpr).isMethod();
                        } else if (isNameExpr instanceof TransportStop) {
                            isNameExpr = ((TransportStop) isNameExpr).isMethod();
                        }
                    }
                    isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
            });
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            final ContextMenuAdapter isVariable = new ContextMenuAdapter();
            for (OsmandMapLayer isVariable : isNameExpr.isMethod().isMethod()) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr);
        }
    }

    private void isMethod(boolean isParameter, MenuAction isParameter) {
        if (isMethod() && isNameExpr) {
            isNameExpr.isFieldAccessExpr = isMethod();
            isNameExpr.isFieldAccessExpr.isMethod();
            isNameExpr = isNameExpr;
        } else {
            isNameExpr.isMethod();
        }
    }

    private ProgressDialog isMethod() {
        ProgressDialog isVariable = new ProgressDialog(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new DialogInterface.OnClickListener() {

            public void isMethod(DialogInterface isParameter, int isParameter) {
                isMethod();
            }
        });
        return isNameExpr;
    }

    public boolean isMethod() {
        if (isNameExpr != null) {
            if (isNameExpr instanceof FavouritePoint) {
                isMethod().isMethod((FavouritePoint) isNameExpr);
                return true;
            } else if (isNameExpr instanceof WptPt) {
                isMethod().isMethod((WptPt) isNameExpr);
                return true;
            }
        }
        return true;
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod().isMethod(isNameExpr, true, isNameExpr.isMethod().isMethod().isMethod().isMethod(), isMethod());
            isMethod();
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            String isVariable = isMethod();
            if (isNameExpr.isMethod() || !isMethod()) {
                isNameExpr = "isStringConstant";
            }
            final List<SelectedGpxFile> isVariable = isNameExpr.isMethod().isMethod().isMethod();
            if ((isNameExpr.isMethod() || (isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod().isFieldAccessExpr)) && isNameExpr.isMethod(OsmandMonitoringPlugin.class) != null) {
                GPXFile isVariable = isNameExpr.isMethod().isMethod().isMethod();
                isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
            } else {
                isMethod(isNameExpr);
            }
        }
    }

    public void isMethod(LatLon isParameter, String isParameter, String isParameter, int isParameter, boolean isParameter) {
        if (isNameExpr != null) {
            final List<SelectedGpxFile> isVariable = isNameExpr.isMethod().isMethod().isMethod();
            if (isNameExpr.isMethod() || (isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod().isFieldAccessExpr)) {
                GPXFile isVariable = isNameExpr.isMethod().isMethod().isMethod();
                isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            } else {
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
        }
    }

    public void isMethod() {
        if (isNameExpr != null && isNameExpr instanceof WptPt) {
            isMethod().isMethod((WptPt) isNameExpr);
        }
    }

    public void isMethod(final LatLon isParameter, final String isParameter, final String isParameter, final int isParameter, final boolean isParameter) {
        if (isNameExpr != null) {
            CallbackWithObject<GPXFile[]> isVariable = new CallbackWithObject<GPXFile[]>() {

                @Override
                public boolean isMethod(GPXFile[] isParameter) {
                    if (isNameExpr != null) {
                        GPXFile isVariable;
                        if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant) {
                            isNameExpr = isNameExpr[isIntegerConstant];
                        } else {
                            isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
                        }
                        isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    }
                    return true;
                }
            };
            isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        }
    }

    public void isMethod(final String isParameter) {
        if (isNameExpr != null) {
            CallbackWithObject<GPXFile[]> isVariable = new CallbackWithObject<GPXFile[]>() {

                @Override
                public boolean isMethod(GPXFile[] isParameter) {
                    if (isNameExpr != null) {
                        GPXFile isVariable;
                        if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant) {
                            isNameExpr = isNameExpr[isIntegerConstant];
                        } else {
                            isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
                        }
                        isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                    return true;
                }
            };
            isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        }
    }

    @Nullable
    public PointDescription isMethod() {
        if (isNameExpr != null) {
            if (isNameExpr.isMethod() && isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr))) {
                return new PointDescription(isNameExpr.isFieldAccessExpr, "isStringConstant");
            } else {
                return isNameExpr;
            }
        } else {
            return null;
        }
    }

    @Nullable
    public PointDescription isMethod() {
        PointDescription isVariable = isMethod();
        if (isNameExpr != null && isNameExpr != null) {
            if (isNameExpr.isMethod(isNameExpr.isMethod()) && !isNameExpr.isMethod(isNameExpr) && !isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr))) {
                return new PointDescription(isNameExpr.isFieldAccessExpr, isNameExpr);
            } else {
                return isNameExpr;
            }
        } else {
            return null;
        }
    }

    public void isMethod(boolean isParameter) {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
    }

    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return isIntegerConstant;
        }
    }

    public void isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod().isMethod();
    }

    public void isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod().isMethod();
    }

    public void isMethod() {
        WeakReference<MapContextMenuFragment> isVariable = isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod().isMethod();
    }

    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public void isMethod(View isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    public float isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return isDoubleConstant;
        }
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return isIntegerConstant;
        }
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return isIntegerConstant;
        }
    }

    public TitleButtonController isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    public TitleButtonController isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    public TitleButtonController isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    public TitleButtonController isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    public TitleButtonController isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    public TitleProgressController isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    public boolean isMethod() {
        return isNameExpr == null || isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr == null || isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr == null || isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr == null || isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr == null || isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public String isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return "isStringConstant";
    }

    public Drawable isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return null;
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return isIntegerConstant;
    }

    public CharSequence isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return "isStringConstant";
    }

    public int isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        return isIntegerConstant;
    }

    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    public boolean isMethod() {
        return isNameExpr != null && isNameExpr.isMethod();
    }

    public void isMethod(LinearLayout isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public boolean isMethod() {
        if (isNameExpr != null) {
            return !isNameExpr.isMethod();
        } else if (isNameExpr != null) {
            return isNameExpr.isMethod().isMethod().isMethod();
        } else {
            return true;
        }
    }

    public boolean isMethod() {
        return isMethod() == isNameExpr.isFieldAccessExpr;
    }

    private void isMethod(Location isParameter, boolean isParameter) {
        MapActivity isVariable = isMethod();
        if (isNameExpr == null && isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
        }
        if (isNameExpr != null) {
            if (isNameExpr) {
                isMethod(true, true, true);
            }
        }
    }

    public void isMethod(net.osmand.Location isParameter) {
        if (isNameExpr && isMethod()) {
            isMethod(isNameExpr, true);
        }
    }

    public void isMethod(float isParameter) {
        if (isNameExpr && isMethod()) {
            isMethod(true, true, true);
        }
    }

    public void isMethod(final boolean isParameter, final boolean isParameter, final boolean isParameter) {
        if (isNameExpr || isNameExpr == null) {
            return;
        }
        isNameExpr = true;
        isNameExpr.isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr = true;
                WeakReference<MapContextMenuFragment> isVariable = isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
            }
        });
    }

    private abstract class isClassOrIsInterface implements Runnable {

        protected ProgressDialog isVariable;
    }
}
