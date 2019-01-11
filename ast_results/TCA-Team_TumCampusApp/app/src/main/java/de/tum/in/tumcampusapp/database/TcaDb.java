// isComment
package de.tum.in.tumcampusapp.database;

import android.content.Context;
import android.content.Intent;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import de.tum.in.tumcampusapp.component.notifications.persistence.ActiveAlarm;
import de.tum.in.tumcampusapp.component.notifications.persistence.ActiveAlarmsDao;
import de.tum.in.tumcampusapp.component.notifications.persistence.ScheduledNotification;
import de.tum.in.tumcampusapp.component.notifications.persistence.ScheduledNotificationsDao;
import de.tum.in.tumcampusapp.component.other.general.NotificationDao;
import de.tum.in.tumcampusapp.component.other.general.RecentsDao;
import de.tum.in.tumcampusapp.component.other.general.model.Recent;
import de.tum.in.tumcampusapp.component.other.locations.BuildingToGpsDao;
import de.tum.in.tumcampusapp.component.other.locations.RoomLocationsDao;
import de.tum.in.tumcampusapp.component.other.locations.model.BuildingToGps;
import de.tum.in.tumcampusapp.component.other.wifimeasurement.WifiMeasurementDao;
import de.tum.in.tumcampusapp.component.other.wifimeasurement.model.WifiMeasurement;
import de.tum.in.tumcampusapp.component.tumui.calendar.CalendarDao;
import de.tum.in.tumcampusapp.component.tumui.calendar.WidgetsTimetableBlacklistDao;
import de.tum.in.tumcampusapp.component.tumui.calendar.model.CalendarItem;
import de.tum.in.tumcampusapp.component.tumui.calendar.model.WidgetsTimetableBlacklist;
import de.tum.in.tumcampusapp.component.tumui.lectures.model.RoomLocations;
import de.tum.in.tumcampusapp.component.ui.alarm.model.FcmNotification;
import de.tum.in.tumcampusapp.component.ui.cafeteria.CafeteriaDao;
import de.tum.in.tumcampusapp.component.ui.cafeteria.CafeteriaLocationDao;
import de.tum.in.tumcampusapp.component.ui.cafeteria.CafeteriaMenuDao;
import de.tum.in.tumcampusapp.component.ui.cafeteria.FavoriteDishDao;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.Cafeteria;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.CafeteriaMenu;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.FavoriteDish;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.Location;
import de.tum.in.tumcampusapp.component.ui.chat.ChatMessageDao;
import de.tum.in.tumcampusapp.component.ui.chat.ChatRoomDao;
import de.tum.in.tumcampusapp.component.ui.chat.model.ChatMessage;
import de.tum.in.tumcampusapp.component.ui.chat.model.ChatRoomDbRow;
import de.tum.in.tumcampusapp.component.ui.news.NewsDao;
import de.tum.in.tumcampusapp.component.ui.news.NewsSourcesDao;
import de.tum.in.tumcampusapp.component.ui.news.model.News;
import de.tum.in.tumcampusapp.component.ui.news.model.NewsSources;
import de.tum.in.tumcampusapp.component.ui.studyroom.StudyRoomDao;
import de.tum.in.tumcampusapp.component.ui.studyroom.StudyRoomGroupDao;
import de.tum.in.tumcampusapp.component.ui.studyroom.model.StudyRoom;
import de.tum.in.tumcampusapp.component.ui.studyroom.model.StudyRoomGroup;
import de.tum.in.tumcampusapp.component.ui.ticket.EventDao;
import de.tum.in.tumcampusapp.component.ui.ticket.TicketDao;
import de.tum.in.tumcampusapp.component.ui.ticket.TicketTypeDao;
import de.tum.in.tumcampusapp.component.ui.ticket.model.Event;
import de.tum.in.tumcampusapp.component.ui.ticket.model.Ticket;
import de.tum.in.tumcampusapp.component.ui.ticket.model.TicketType;
import de.tum.in.tumcampusapp.component.ui.transportation.TransportDao;
import de.tum.in.tumcampusapp.component.ui.transportation.model.TransportFavorites;
import de.tum.in.tumcampusapp.component.ui.transportation.model.WidgetsTransport;
import de.tum.in.tumcampusapp.component.ui.tufilm.KinoDao;
import de.tum.in.tumcampusapp.component.ui.tufilm.model.Kino;
import de.tum.in.tumcampusapp.database.migrations.Migration1to2;
import de.tum.in.tumcampusapp.database.migrations.Migration2to3;
import de.tum.in.tumcampusapp.service.BackgroundService;
import de.tum.in.tumcampusapp.service.DownloadService;
import de.tum.in.tumcampusapp.service.QueryLocationsService;
import de.tum.in.tumcampusapp.service.SendMessageService;
import de.tum.in.tumcampusapp.service.SilenceService;
import de.tum.in.tumcampusapp.utils.CacheManager;
import de.tum.in.tumcampusapp.utils.Const;
import de.tum.in.tumcampusapp.utils.sync.SyncDao;
import de.tum.in.tumcampusapp.utils.sync.model.Sync;

@Database(version = isIntegerConstant, entities = { Cafeteria.class, CafeteriaMenu.class, FavoriteDish.class, Sync.class, BuildingToGps.class, Kino.class, Event.class, Ticket.class, TicketType.class, ChatMessage.class, Location.class, News.class, NewsSources.class, CalendarItem.class, RoomLocations.class, WidgetsTimetableBlacklist.class, WifiMeasurement.class, Recent.class, StudyRoomGroup.class, StudyRoom.class, FcmNotification.class, TransportFavorites.class, WidgetsTransport.class, ChatRoomDbRow.class, ScheduledNotification.class, ActiveAlarm.class })
@TypeConverters(Converters.class)
public abstract class isClassOrIsInterface extends RoomDatabase {

    private static final Migration[] isVariable = { new Migration1to2(), new Migration2to3() };

    private static TcaDb isVariable;

    public static synchronized TcaDb isMethod(Context isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), TcaDb.class, isNameExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr).isMethod();
        }
        return isNameExpr;
    }

    public abstract CafeteriaDao isMethod();

    public abstract CafeteriaMenuDao isMethod();

    public abstract FavoriteDishDao isMethod();

    public abstract SyncDao isMethod();

    public abstract BuildingToGpsDao isMethod();

    public abstract KinoDao isMethod();

    public abstract EventDao isMethod();

    public abstract TicketDao isMethod();

    public abstract TicketTypeDao isMethod();

    public abstract CafeteriaLocationDao isMethod();

    public abstract ChatMessageDao isMethod();

    public abstract NewsDao isMethod();

    public abstract NewsSourcesDao isMethod();

    public abstract CalendarDao isMethod();

    public abstract RoomLocationsDao isMethod();

    public abstract WidgetsTimetableBlacklistDao isMethod();

    public abstract WifiMeasurementDao isMethod();

    public abstract RecentsDao isMethod();

    public abstract StudyRoomGroupDao isMethod();

    public abstract StudyRoomDao isMethod();

    public abstract NotificationDao isMethod();

    public abstract TransportDao isMethod();

    public abstract ChatRoomDao isMethod();

    public abstract ScheduledNotificationsDao isMethod();

    public abstract ActiveAlarmsDao isMethod();

    /**
     * isComment
     */
    public static void isMethod(Context isParameter) {
        // isComment
        Class<?>[] isVariable = new Class<?>[] { QueryLocationsService.class, SendMessageService.class, SilenceService.class, DownloadService.class, BackgroundService.class };
        for (Class<?> isVariable : isNameExpr) {
            isNameExpr.isMethod(new Intent(isNameExpr, isNameExpr));
        }
        // isComment
        CacheManager isVariable = new CacheManager(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod();
    }
}
