// isComment
package li.klass.fhem.dagger;

import android.app.Application;
import org.jetbrains.annotations.NotNull;
import javax.inject.Singleton;
import dagger.Component;
import li.klass.fhem.AndFHEMApplication;
import li.klass.fhem.activities.AndFHEMMainActivity;
import li.klass.fhem.activities.PremiumActivity;
import li.klass.fhem.activities.StartupActivity;
import li.klass.fhem.activities.locale.ConditionQueryLocaleReceiver;
import li.klass.fhem.activities.locale.ConnectionChangeLocaleSettingActivity;
import li.klass.fhem.activities.locale.FireSettingLocaleReceiver;
import li.klass.fhem.activities.locale.SendCommandLocaleSettingActivity;
import li.klass.fhem.adapter.devices.core.GenericOverviewDetailDeviceAdapter;
import li.klass.fhem.adapter.devices.strategy.ToggleableStrategy;
import li.klass.fhem.adapter.devices.toggle.OnOffBehavior;
import li.klass.fhem.alarm.clock.update.AlarmClockIntentService;
import li.klass.fhem.appindex.AppIndexIntentService;
import li.klass.fhem.appwidget.action.AppWidgetActionBroadcastReceiver;
import li.klass.fhem.appwidget.provider.BigAppWidgetProvider;
import li.klass.fhem.appwidget.provider.MediumAppWidgetProvider;
import li.klass.fhem.appwidget.provider.SmallAppWidgetProvider;
import li.klass.fhem.appwidget.ui.selection.BigWidgetSelectionActivity;
import li.klass.fhem.appwidget.ui.selection.MediumWidgetSelectionActivity;
import li.klass.fhem.appwidget.ui.selection.SmallWidgetSelectionActivity;
import li.klass.fhem.appwidget.ui.widget.base.otherWidgets.OtherWidgetsFragment;
import li.klass.fhem.appwidget.ui.widget.big.BigWeatherForecastWidget;
import li.klass.fhem.appwidget.ui.widget.medium.DimWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.HeatingWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.MediumInformationWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.MediumWeatherForecastWidget;
import li.klass.fhem.appwidget.ui.widget.medium.OnOffWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.RoomDetailLinkWidget;
import li.klass.fhem.appwidget.ui.widget.medium.StatusWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.TargetStateWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.TemperatureWidgetView;
import li.klass.fhem.appwidget.ui.widget.medium.ToggleWidgetView;
import li.klass.fhem.appwidget.ui.widget.small.AllDevicesLinkWidget;
import li.klass.fhem.appwidget.ui.widget.small.ConversionLinkWidget;
import li.klass.fhem.appwidget.ui.widget.small.DeviceListUpdateWidget;
import li.klass.fhem.appwidget.ui.widget.small.FavoritesLinkWidget;
import li.klass.fhem.appwidget.ui.widget.small.RoomsLinkWidget;
import li.klass.fhem.appwidget.ui.widget.small.SendCommandLinkWidget;
import li.klass.fhem.appwidget.ui.widget.small.SmallPresenceWidget;
import li.klass.fhem.appwidget.ui.widget.small.SmallToggleWidget;
import li.klass.fhem.appwidget.ui.widget.small.TimersLinkWidget;
import li.klass.fhem.appwidget.update.AppWidgetListViewUpdateRemoteViewsService;
import li.klass.fhem.backup.ImportExportService;
import li.klass.fhem.connection.ui.ConnectionDetailFragment;
import li.klass.fhem.connection.ui.ConnectionListFragment;
import li.klass.fhem.conversion.ui.ConversionFragment;
import li.klass.fhem.devices.detail.ui.DeviceDetailFragment;
import li.klass.fhem.devices.list.all.ui.AllDevicesFragment;
import li.klass.fhem.devices.list.favorites.ui.FavoritesFragment;
import li.klass.fhem.fcm.history.view.FcmHistoryMessagesFragment;
import li.klass.fhem.fcm.history.view.FcmHistoryUpdatesFragment;
import li.klass.fhem.fcm.receiver.FcmIntentService;
import li.klass.fhem.floorplan.ui.FloorplanFragment;
import li.klass.fhem.fragments.device.DeviceNameListFragment;
import li.klass.fhem.fragments.device.DeviceNameListNavigationFragment;
import li.klass.fhem.fragments.device.DeviceNameSelectionFragment;
import li.klass.fhem.fragments.device.DeviceNameSelectionNavigationFragment;
import li.klass.fhem.fragments.weekprofile.FromToWeekProfileFragment;
import li.klass.fhem.fragments.weekprofile.IntervalWeekProfileFragment;
import li.klass.fhem.graph.backend.gplot.GPlotHolder;
import li.klass.fhem.graph.ui.GraphActivity;
import li.klass.fhem.room.detail.ui.RoomDetailFragment;
import li.klass.fhem.room.list.ui.RoomListFragment;
import li.klass.fhem.search.MySearchSuggestionsProvider;
import li.klass.fhem.search.SearchResultsFragment;
import li.klass.fhem.sendCommand.ui.SendCommandFragment;
import li.klass.fhem.service.intent.ExternalApiService;
import li.klass.fhem.service.intent.NotificationIntentService;
import li.klass.fhem.service.intent.RoomListUpdateIntentService;
import li.klass.fhem.service.intent.SendCommandService;
import li.klass.fhem.settings.SettingsActivity;
import li.klass.fhem.settings.SettingsFragment;
import li.klass.fhem.timer.ui.TimerDetailFragment;
import li.klass.fhem.timer.ui.TimerListFragment;
import li.klass.fhem.ui.WebViewFragment;
import li.klass.fhem.update.backend.DeviceListUpdateService;
import li.klass.fhem.update.backend.device.configuration.DeviceConfigurationProvider;
import li.klass.fhem.update.backend.device.configuration.Sanitiser;
import li.klass.fhem.update.backend.group.GroupProvider;
import li.klass.fhem.update.backend.xmllist.XmlListParser;
import li.klass.fhem.widget.deviceFunctionality.DeviceFunctionalityOrderPreference;

@Singleton
@Component(modules = { ApplicationModule.class, DatabaseModule.class })
public interface isClassOrIsInterface {

    DeviceConfigurationProvider isMethod();

    XmlListParser isMethod();

    GPlotHolder isMethod();

    GroupProvider isMethod();

    Sanitiser isMethod();

    Application isMethod();

    OnOffBehavior isMethod();

    void isMethod(DeviceFunctionalityOrderPreference isParameter);

    void isMethod(AndFHEMMainActivity isParameter);

    void isMethod(GraphActivity isParameter);

    void isMethod(StartupActivity isParameter);

    void isMethod(SmallWidgetSelectionActivity isParameter);

    void isMethod(MediumWidgetSelectionActivity isParameter);

    void isMethod(BigWidgetSelectionActivity isParameter);

    void isMethod(PremiumActivity isParameter);

    void isMethod(GenericOverviewDetailDeviceAdapter isParameter);

    void isMethod(TemperatureWidgetView isParameter);

    void isMethod(ToggleWidgetView isParameter);

    void isMethod(SmallPresenceWidget isParameter);

    void isMethod(SmallToggleWidget isParameter);

    void isMethod(StatusWidgetView isParameter);

    void isMethod(MediumInformationWidgetView isParameter);

    void isMethod(HeatingWidgetView isParameter);

    void isMethod(MediumWeatherForecastWidget isParameter);

    void isMethod(BigWeatherForecastWidget isParameter);

    void isMethod(DimWidgetView isParameter);

    void isMethod(TargetStateWidgetView isParameter);

    void isMethod(RoomDetailLinkWidget isParameter);

    void isMethod(FavoritesLinkWidget isParameter);

    void isMethod(RoomsLinkWidget isParameter);

    void isMethod(AllDevicesLinkWidget isParameter);

    void isMethod(ConversionLinkWidget isParameter);

    void isMethod(TimersLinkWidget isParameter);

    void isMethod(SendCommandLinkWidget isParameter);

    void isMethod(DeviceListUpdateWidget isParameter);

    void isMethod(OnOffWidgetView isParameter);

    void isMethod(AppWidgetListViewUpdateRemoteViewsService isParameter);

    void isMethod(SmallAppWidgetProvider isParameter);

    void isMethod(MediumAppWidgetProvider isParameter);

    void isMethod(BigAppWidgetProvider isParameter);

    void isMethod(FavoritesFragment isParameter);

    void isMethod(RoomListFragment isParameter);

    void isMethod(AllDevicesFragment isParameter);

    void isMethod(ConversionFragment isParameter);

    void isMethod(DeviceDetailFragment isParameter);

    void isMethod(FromToWeekProfileFragment isParameter);

    void isMethod(IntervalWeekProfileFragment isParameter);

    void isMethod(FloorplanFragment isParameter);

    void isMethod(RoomDetailFragment isParameter);

    void isMethod(SendCommandFragment isParameter);

    void isMethod(DeviceNameListFragment isParameter);

    void isMethod(DeviceNameSelectionFragment isParameter);

    void isMethod(DeviceNameListNavigationFragment isParameter);

    void isMethod(TimerListFragment isParameter);

    void isMethod(TimerDetailFragment isParameter);

    void isMethod(ConnectionListFragment isParameter);

    void isMethod(ConnectionDetailFragment isParameter);

    void isMethod(WebViewFragment isParameter);

    void isMethod(OtherWidgetsFragment isParameter);

    void isMethod(DeviceNameSelectionNavigationFragment isParameter);

    void isMethod(DeviceListUpdateService isParameter);

    void isMethod(AppIndexIntentService isParameter);

    void isMethod(FcmIntentService isParameter);

    void isMethod(SendCommandService isParameter);

    void isMethod(RoomListUpdateIntentService isParameter);

    void isMethod(NotificationIntentService isParameter);

    void isMethod(ExternalApiService isParameter);

    void isMethod(AlarmClockIntentService isParameter);

    void isMethod(ImportExportService isParameter);

    void isMethod(AndFHEMApplication isParameter);

    void isMethod(ConditionQueryLocaleReceiver isParameter);

    void isMethod(OnOffBehavior isParameter);

    void isMethod(ToggleableStrategy isParameter);

    void isMethod(ConnectionChangeLocaleSettingActivity isParameter);

    void isMethod(SendCommandLocaleSettingActivity isParameter);

    void isMethod(SearchResultsFragment isParameter);

    void isMethod(FireSettingLocaleReceiver isParameter);

    void isMethod(MySearchSuggestionsProvider isParameter);

    void isMethod(FcmHistoryMessagesFragment isParameter);

    void isMethod(FcmHistoryUpdatesFragment isParameter);

    void isMethod(SettingsActivity isParameter);

    void isMethod(SettingsFragment isParameter);

    void isMethod(@NotNull AppWidgetActionBroadcastReceiver isParameter);
}
