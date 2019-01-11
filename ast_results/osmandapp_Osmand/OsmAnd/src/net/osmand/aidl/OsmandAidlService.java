// isComment
package net.osmand.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import net.osmand.PlatformUtil;
import net.osmand.aidl.OsmandAidlApi.SearchCompleteCallback;
import net.osmand.aidl.calculateroute.CalculateRouteParams;
import net.osmand.aidl.customization.OsmandSettingsParams;
import net.osmand.aidl.customization.SetWidgetsParams;
import net.osmand.aidl.favorite.AddFavoriteParams;
import net.osmand.aidl.favorite.RemoveFavoriteParams;
import net.osmand.aidl.favorite.UpdateFavoriteParams;
import net.osmand.aidl.favorite.group.AddFavoriteGroupParams;
import net.osmand.aidl.favorite.group.RemoveFavoriteGroupParams;
import net.osmand.aidl.favorite.group.UpdateFavoriteGroupParams;
import net.osmand.aidl.gpx.AGpxFile;
import net.osmand.aidl.gpx.ASelectedGpxFile;
import net.osmand.aidl.gpx.HideGpxParams;
import net.osmand.aidl.gpx.ImportGpxParams;
import net.osmand.aidl.gpx.RemoveGpxParams;
import net.osmand.aidl.gpx.ShowGpxParams;
import net.osmand.aidl.gpx.StartGpxRecordingParams;
import net.osmand.aidl.gpx.StopGpxRecordingParams;
import net.osmand.aidl.map.SetMapLocationParams;
import net.osmand.aidl.maplayer.AddMapLayerParams;
import net.osmand.aidl.maplayer.RemoveMapLayerParams;
import net.osmand.aidl.maplayer.UpdateMapLayerParams;
import net.osmand.aidl.maplayer.point.AddMapPointParams;
import net.osmand.aidl.maplayer.point.RemoveMapPointParams;
import net.osmand.aidl.maplayer.point.ShowMapPointParams;
import net.osmand.aidl.maplayer.point.UpdateMapPointParams;
import net.osmand.aidl.mapmarker.AddMapMarkerParams;
import net.osmand.aidl.mapmarker.RemoveMapMarkerParams;
import net.osmand.aidl.mapmarker.UpdateMapMarkerParams;
import net.osmand.aidl.mapwidget.AddMapWidgetParams;
import net.osmand.aidl.mapwidget.RemoveMapWidgetParams;
import net.osmand.aidl.mapwidget.UpdateMapWidgetParams;
import net.osmand.aidl.navdrawer.SetNavDrawerItemsParams;
import net.osmand.aidl.navigation.MuteNavigationParams;
import net.osmand.aidl.navigation.NavigateGpxParams;
import net.osmand.aidl.navigation.NavigateParams;
import net.osmand.aidl.navigation.NavigateSearchParams;
import net.osmand.aidl.navigation.PauseNavigationParams;
import net.osmand.aidl.navigation.ResumeNavigationParams;
import net.osmand.aidl.navigation.StopNavigationParams;
import net.osmand.aidl.navigation.UnmuteNavigationParams;
import net.osmand.aidl.note.StartAudioRecordingParams;
import net.osmand.aidl.note.StartVideoRecordingParams;
import net.osmand.aidl.note.StopRecordingParams;
import net.osmand.aidl.note.TakePhotoNoteParams;
import net.osmand.aidl.search.SearchParams;
import net.osmand.aidl.search.SearchResult;
import net.osmand.aidl.tiles.ASqliteDbFile;
import net.osmand.plus.OsmandApplication;
import net.osmand.util.Algorithms;
import org.apache.commons.logging.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class isClassOrIsInterface extends Service {

    private static final Log isVariable = isNameExpr.isMethod(OsmandAidlService.class);

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = -isIntegerConstant;

    private Map<Long, IOsmAndAidlCallback> isVariable;

    private Handler isVariable = null;

    HandlerThread isVariable = new HandlerThread("isStringConstant");

    private long isVariable = isIntegerConstant;

    private OsmandApplication isMethod() {
        return (OsmandApplication) isMethod();
    }

    @Nullable
    private OsmandAidlApi isMethod(String isParameter) {
        isNameExpr.isMethod("isStringConstant" + isNameExpr);
        OsmandAidlApi isVariable = isMethod().isMethod();
        String isVariable = isMethod().isMethod().isMethod(isNameExpr.isMethod());
        if (isNameExpr != null && !isNameExpr.isMethod(isMethod().isMethod()) && !isNameExpr.isMethod(isNameExpr)) {
            return null;
        }
        return isNameExpr;
    }

    @Override
    public IBinder isMethod(Intent isParameter) {
        isNameExpr.isMethod();
        isNameExpr = new Handler(isNameExpr.isMethod());
        // isComment
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = new ConcurrentHashMap<>();
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    private final IOsmAndAidlInterface.Stub isVariable = new IOsmAndAidlInterface.Stub() {

        private void isMethod(Exception isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }

        @Override
        public boolean isMethod() throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(AddFavoriteGroupParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(RemoveFavoriteGroupParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(UpdateFavoriteGroupParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(AddFavoriteParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(RemoveFavoriteParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(UpdateFavoriteParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(AddMapMarkerParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                return true;
            }
        }

        @Override
        public boolean isMethod(RemoveMapMarkerParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(UpdateMapMarkerParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(AddMapWidgetParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(RemoveMapWidgetParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                return true;
            }
        }

        @Override
        public boolean isMethod(UpdateMapWidgetParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(ShowMapPointParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(AddMapPointParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(RemoveMapPointParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(UpdateMapPointParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(AddMapLayerParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(RemoveMapLayerParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(UpdateMapLayerParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(ImportGpxParams isParameter) throws RemoteException {
            if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr.isMethod())) {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                if (isNameExpr != null) {
                    if (isNameExpr.isMethod() != null) {
                        return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
                    } else if (isNameExpr.isMethod() != null) {
                        return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
                    } else if (isNameExpr.isMethod() != null) {
                        return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
                    }
                }
            }
            return true;
        }

        @Override
        public boolean isMethod(ShowGpxParams isParameter) throws RemoteException {
            if (isNameExpr != null && isNameExpr.isMethod() != null) {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return true;
        }

        @Override
        public boolean isMethod(HideGpxParams isParameter) throws RemoteException {
            if (isNameExpr != null && isNameExpr.isMethod() != null) {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return true;
        }

        @Override
        public boolean isMethod(List<ASelectedGpxFile> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(List<AGpxFile> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(RemoveGpxParams isParameter) throws RemoteException {
            if (isNameExpr != null && isNameExpr.isMethod() != null) {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return true;
        }

        @Override
        public boolean isMethod(SetMapLocationParams isParameter) throws RemoteException {
            if (isNameExpr != null) {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            }
            return true;
        }

        @Override
        public boolean isMethod(CalculateRouteParams isParameter) throws RemoteException {
            if (isNameExpr == null || isNameExpr.isMethod() == null) {
                return true;
            } else {
                /*isComment*/
                return true;
            }
        }

        @Override
        public boolean isMethod(StartGpxRecordingParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(StopGpxRecordingParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(TakePhotoNoteParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(StartVideoRecordingParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(StartAudioRecordingParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(StopRecordingParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(NavigateParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(NavigateGpxParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(PauseNavigationParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(ResumeNavigationParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(StopNavigationParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(MuteNavigationParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(UnmuteNavigationParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(SetNavDrawerItemsParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(SearchParams isParameter, final IOsmAndAidlCallback isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), new SearchCompleteCallback() {

                    @Override
                    public void isMethod(List<SearchResult> isParameter) {
                        Bundle isVariable = new Bundle();
                        if (isNameExpr.isMethod() > isIntegerConstant) {
                            isNameExpr.isMethod(isNameExpr, new ArrayList<>(isNameExpr));
                        }
                        try {
                            isNameExpr.isMethod(isNameExpr);
                        } catch (RemoteException isParameter) {
                            isMethod(isNameExpr);
                        }
                    }
                });
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public boolean isMethod(NavigateSearchParams isParameter) throws RemoteException {
            try {
                OsmandAidlApi isVariable = isMethod("isStringConstant");
                return isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
            } catch (Exception isParameter) {
                isMethod(isNameExpr);
                return true;
            }
        }

        @Override
        public long isMethod(long isParameter, IOsmAndAidlCallback isParameter) throws RemoteException {
            if (isNameExpr >= isNameExpr) {
                isNameExpr++;
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isMethod(isNameExpr, isNameExpr, isNameExpr);
                return isNameExpr;
            } else {
                return isNameExpr;
            }
        }

        @Override
        public boolean isMethod(long isParameter) throws RemoteException {
            isNameExpr.isMethod(isNameExpr);
            return true;
        }

        @Override
        public boolean isMethod(String isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(List<String> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(List<String> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(List<String> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(List<String> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        void isMethod(final long isParameter, final long isParameter, final IOsmAndAidlCallback isParameter) {
            isNameExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    try {
                        if (isNameExpr.isMethod(isNameExpr)) {
                            OsmandAidlApi isVariable = isMethod("isStringConstant");
                            if (isNameExpr != null && isNameExpr.isMethod()) {
                                isNameExpr.isMethod();
                            }
                            isMethod(isNameExpr, isNameExpr, isNameExpr);
                        }
                    } catch (RemoteException isParameter) {
                        isMethod(isNameExpr);
                    }
                }
            }, isNameExpr);
        }

        @Override
        public boolean isMethod(SetWidgetsParams isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }

        @Override
        public boolean isMethod(SetWidgetsParams isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }

        @Override
        public boolean isMethod(OsmandSettingsParams isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }

        @Override
        public boolean isMethod(List<ASqliteDbFile> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(List<ASqliteDbFile> isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(String isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public boolean isMethod(String isParameter) throws RemoteException {
            OsmandAidlApi isVariable = isMethod("isStringConstant");
            return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
        }
    };
}
