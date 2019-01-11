// isComment
package li.klass.fhem.ui;

import androidx.annotation.Nullable;
import li.klass.fhem.R;
import li.klass.fhem.appwidget.ui.widget.base.otherWidgets.OtherWidgetsFragment;
import li.klass.fhem.connection.ui.ConnectionDetailFragment;
import li.klass.fhem.connection.ui.ConnectionListFragment;
import li.klass.fhem.conversion.ui.ConversionFragment;
import li.klass.fhem.devices.detail.ui.DeviceDetailFragment;
import li.klass.fhem.devices.list.all.ui.AllDevicesFragment;
import li.klass.fhem.devices.list.favorites.ui.FavoritesFragment;
import li.klass.fhem.fcm.history.view.FcmHistoryFragment;
import li.klass.fhem.floorplan.ui.FloorplanFragment;
import li.klass.fhem.fragments.core.BaseFragment;
import li.klass.fhem.fragments.device.DeviceNameListNavigationFragment;
import li.klass.fhem.fragments.device.DeviceNameSelectionFragment;
import li.klass.fhem.fragments.device.DeviceNameSelectionNavigationFragment;
import li.klass.fhem.fragments.weekprofile.FromToWeekProfileFragment;
import li.klass.fhem.fragments.weekprofile.IntervalWeekProfileFragment;
import li.klass.fhem.room.detail.ui.RoomDetailFragment;
import li.klass.fhem.room.list.ui.RoomListFragment;
import li.klass.fhem.search.SearchResultsFragment;
import li.klass.fhem.sendCommand.ui.SendCommandFragment;
import li.klass.fhem.timer.ui.TimerDetailFragment;
import li.klass.fhem.timer.ui.TimerListFragment;

public enum FragmentType {

    FAVORITES(FavoritesFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    ROOM_LIST(RoomListFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    ALL_DEVICES(AllDevicesFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, RoomListFragment.class),
    CONVERSION(ConversionFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    DEVICE_DETAIL(DeviceDetailFragment.class, DeviceNameListNavigationFragment.class),
    FROM_TO_WEEK_PROFILE(FromToWeekProfileFragment.class),
    INTERVAL_WEEK_PROFILE(IntervalWeekProfileFragment.class),
    FLOORPLAN(FloorplanFragment.class),
    ROOM_DETAIL(RoomDetailFragment.class, RoomListFragment.class),
    SEND_COMMAND(SendCommandFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    DEVICE_SELECTION(DeviceNameSelectionFragment.class, DeviceNameSelectionNavigationFragment.class),
    TIMER_OVERVIEW(TimerListFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    TIMER_DETAIL(TimerDetailFragment.class),
    CONNECTION_LIST(ConnectionListFragment.class),
    CONNECTION_DETAIL(ConnectionDetailFragment.class, ConnectionListFragment.class),
    WEB_VIEW(WebViewFragment.class),
    OTHER_WIDGETS_FRAGMENT(OtherWidgetsFragment.class),
    SEARCH(SearchResultsFragment.class),
    FCM_HISTORY(FcmHistoryFragment.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);

    private Class<? extends BaseFragment> isVariable;

    private Class<? extends BaseFragment> isVariable;

    private int isVariable;

    isConstructor(Class<? extends BaseFragment> isParameter) {
        this(isNameExpr, -isIntegerConstant, null);
    }

    isConstructor(Class<? extends BaseFragment> isParameter, int isParameter, Class<? extends BaseFragment> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(Class<? extends BaseFragment> isParameter, Class<? extends BaseFragment> isParameter) {
        this(isNameExpr, -isIntegerConstant, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    public static FragmentType isMethod(String isParameter) {
        try {
            Class<? extends BaseFragment> isVariable = (Class<? extends BaseFragment>) isNameExpr.isMethod(isNameExpr);
            return isNameExpr.isMethod(isNameExpr);
        } catch (ClassNotFoundException isParameter) {
            return null;
        }
    }

    public static FragmentType isMethod(int isParameter) {
        for (FragmentType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        return null;
    }

    public static FragmentType isMethod(Class<? extends BaseFragment> isParameter) {
        for (FragmentType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    @Nullable
    public static FragmentType isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (Exception isParameter) {
            return null;
        }
    }

    public Class<? extends BaseFragment> isMethod() {
        return isNameExpr;
    }

    public Class<? extends BaseFragment> isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr != -isIntegerConstant;
    }

    public int isMethod() {
        return isNameExpr;
    }
}
