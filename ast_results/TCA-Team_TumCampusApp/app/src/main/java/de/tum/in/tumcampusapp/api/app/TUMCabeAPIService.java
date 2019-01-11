// isComment
package de.tum.in.tumcampusapp.api.app;

import java.util.HashMap;
import java.util.List;
import de.tum.in.tumcampusapp.api.app.model.DeviceRegister;
import de.tum.in.tumcampusapp.api.app.model.DeviceUploadFcmToken;
import de.tum.in.tumcampusapp.api.app.model.ObfuscatedIdsUpload;
import de.tum.in.tumcampusapp.api.app.model.TUMCabeStatus;
import de.tum.in.tumcampusapp.api.app.model.TUMCabeVerification;
import de.tum.in.tumcampusapp.api.app.model.UploadStatus;
import de.tum.in.tumcampusapp.component.other.locations.model.BuildingToGps;
import de.tum.in.tumcampusapp.component.other.wifimeasurement.model.WifiMeasurement;
import de.tum.in.tumcampusapp.component.tumui.feedback.model.Feedback;
import de.tum.in.tumcampusapp.component.tumui.feedback.model.Success;
import de.tum.in.tumcampusapp.component.tumui.roomfinder.model.RoomFinderCoordinate;
import de.tum.in.tumcampusapp.component.tumui.roomfinder.model.RoomFinderMap;
import de.tum.in.tumcampusapp.component.tumui.roomfinder.model.RoomFinderRoom;
import de.tum.in.tumcampusapp.component.tumui.roomfinder.model.RoomFinderSchedule;
import de.tum.in.tumcampusapp.component.ui.alarm.model.FcmNotification;
import de.tum.in.tumcampusapp.component.ui.alarm.model.FcmNotificationLocation;
import de.tum.in.tumcampusapp.component.ui.barrierfree.model.BarrierfreeContact;
import de.tum.in.tumcampusapp.component.ui.barrierfree.model.BarrierfreeMoreInfo;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.Cafeteria;
import de.tum.in.tumcampusapp.component.ui.chat.model.ChatMember;
import de.tum.in.tumcampusapp.component.ui.chat.model.ChatMessage;
import de.tum.in.tumcampusapp.component.ui.chat.model.ChatRoom;
import de.tum.in.tumcampusapp.component.ui.news.model.News;
import de.tum.in.tumcampusapp.component.ui.news.model.NewsAlert;
import de.tum.in.tumcampusapp.component.ui.news.model.NewsSources;
import de.tum.in.tumcampusapp.component.ui.studyroom.model.StudyRoomGroup;
import de.tum.in.tumcampusapp.component.ui.ticket.model.Event;
import de.tum.in.tumcampusapp.component.ui.ticket.model.Ticket;
import de.tum.in.tumcampusapp.component.ui.ticket.model.TicketType;
import de.tum.in.tumcampusapp.component.ui.ticket.payload.TicketReservationResponse;
import de.tum.in.tumcampusapp.component.ui.ticket.payload.TicketStatus;
import de.tum.in.tumcampusapp.component.ui.tufilm.model.Kino;
import de.tum.in.tumcampusapp.component.ui.updatenote.model.UpdateNote;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE_BUILDINGS_TO_GPS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE_CONTACT;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE_LIST_OF_ELEVATORS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE_LIST_OF_TOILETS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE_MORE_INFO;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_BARRIER_FREE_NERBY_FACILITIES;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_CAFETERIAS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_CHAT_MEMBERS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_CHAT_ROOMS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_DEVICE;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_EVENTS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_FEEDBACK;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_KINOS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_LOCATIONS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_MEMBERS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_NEWS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_NOTIFICATIONS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_ROOM_FINDER;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_ROOM_FINDER_AVAILABLE_MAPS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_ROOM_FINDER_COORDINATES;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_ROOM_FINDER_SCHEDULE;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_ROOM_FINDER_SEARCH;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_STUDY_ROOMS;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_TICKET;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_UPDATE_NOTE;
import static de.tum.in.tumcampusapp.api.app.TUMCabeClient.API_WIFI_HEATMAP;

public interface isClassOrIsInterface {

    // isComment
    @POST(isNameExpr)
    Call<ChatRoom> isMethod(@Body TUMCabeVerification isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<ChatRoom> isMethod(@Path("isStringConstant") int isParameter);

    @POST(isNameExpr + "isStringConstant")
    Call<ChatRoom> isMethod(@Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    @POST(isNameExpr + "isStringConstant")
    Call<ChatRoom> isMethod(@Path("isStringConstant") int isParameter, @Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    // isComment
    @PUT(isNameExpr + "isStringConstant")
    Observable<ChatMessage> isMethod(@Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    @PUT(isNameExpr + "isStringConstant")
    Observable<ChatMessage> isMethod(@Path("isStringConstant") int isParameter, @Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    // isComment
    @POST(isNameExpr + "isStringConstant")
    Observable<List<ChatMessage>> isMethod(@Path("isStringConstant") int isParameter, @Path("isStringConstant") long isParameter, @Body TUMCabeVerification isParameter);

    @POST(isNameExpr + "isStringConstant")
    Observable<List<ChatMessage>> isMethod(@Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    @POST(isNameExpr)
    Call<ChatMember> isMethod(@Body ChatMember isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<ChatMember> isMethod(@Path("isStringConstant") String isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<List<ChatMember>> isMethod(@Path("isStringConstant") String isParameter);

    @POST(isNameExpr + "isStringConstant")
    Call<List<ChatRoom>> isMethod(@Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    @POST(isNameExpr + "isStringConstant")
    Observable<TUMCabeStatus> isMethod(@Path("isStringConstant") String isParameter, @Body ObfuscatedIdsUpload isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<FcmNotification> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<String> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<FcmNotificationLocation> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    @POST(isNameExpr + "isStringConstant")
    Call<TUMCabeStatus> isMethod(@Body DeviceRegister isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<TUMCabeStatus> isMethod();

    @POST(isNameExpr + "isStringConstant")
    Call<TUMCabeStatus> isMethod(@Body DeviceUploadFcmToken isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<UploadStatus> isMethod(@Path("isStringConstant") String isParameter);

    // isComment
    @POST(isNameExpr + "isStringConstant")
    Call<TUMCabeStatus> isMethod(@Body List<WifiMeasurement> isParameter);

    // isComment
    @GET(isNameExpr + isNameExpr)
    Call<List<BarrierfreeContact>> isMethod();

    // isComment
    @GET(isNameExpr + isNameExpr)
    Call<List<BarrierfreeMoreInfo>> isMethod();

    // isComment
    @GET(isNameExpr + isNameExpr)
    Call<List<RoomFinderRoom>> isMethod();

    // isComment
    @GET(isNameExpr + isNameExpr)
    Call<List<RoomFinderRoom>> isMethod();

    // isComment
    @GET(isNameExpr + isNameExpr + "isStringConstant")
    Call<List<RoomFinderRoom>> isMethod(@Path("isStringConstant") String isParameter);

    // isComment
    @GET(isNameExpr + isNameExpr)
    Call<List<BuildingToGps>> isMethod();

    // isComment
    @GET(isNameExpr + isNameExpr + "isStringConstant")
    Call<List<RoomFinderMap>> isMethod(@Path("isStringConstant") String isParameter);

    // isComment
    @GET(isNameExpr + isNameExpr + "isStringConstant")
    Call<List<RoomFinderRoom>> isMethod(@Path("isStringConstant") String isParameter);

    // isComment
    @GET(isNameExpr + isNameExpr + "isStringConstant")
    Call<RoomFinderCoordinate> isMethod(@Path("isStringConstant") String isParameter);

    // isComment
    @GET(isNameExpr + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    Call<List<RoomFinderSchedule>> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter);

    @POST(isNameExpr)
    Call<Success> isMethod(@Body Feedback isParameter);

    @Multipart
    @POST(isNameExpr + "isStringConstant")
    Call<Success> isMethod(@Part MultipartBody.Part isParameter, @Path("isStringConstant") int isParameter, @Path("isStringConstant") String isParameter);

    @GET(isNameExpr)
    Observable<List<Cafeteria>> isMethod();

    @GET(isNameExpr + "isStringConstant")
    Flowable<List<Kino>> isMethod(@Path("isStringConstant") String isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<List<News>> isMethod(@Path("isStringConstant") String isParameter);

    @GET(isNameExpr + "isStringConstant")
    Call<List<NewsSources>> isMethod();

    @GET(isNameExpr + "isStringConstant")
    Observable<NewsAlert> isMethod();

    @GET(isNameExpr)
    Call<List<StudyRoomGroup>> isMethod();

    // isComment
    // isComment
    @GET(isNameExpr + "isStringConstant")
    Call<List<Event>> isMethod();

    // isComment
    @POST(isNameExpr + isNameExpr + "isStringConstant")
    Call<List<Ticket>> isMethod(@Body TUMCabeVerification isParameter);

    @POST(isNameExpr + isNameExpr + "isStringConstant")
    Call<Ticket> isMethod(@Path("isStringConstant") int isParameter, @Body TUMCabeVerification isParameter);

    @GET(isNameExpr + isNameExpr + "isStringConstant")
    Call<List<TicketType>> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    @POST(isNameExpr + isNameExpr + "isStringConstant")
    Call<TicketReservationResponse> isMethod(@Body TUMCabeVerification isParameter);

    // isComment
    @POST(isNameExpr + isNameExpr + "isStringConstant")
    Call<Ticket> isMethod(@Body TUMCabeVerification isParameter);

    @POST(isNameExpr + isNameExpr + "isStringConstant")
    Call<HashMap<String, Object>> isMethod(@Body TUMCabeVerification isParameter);

    @GET(isNameExpr + isNameExpr + "isStringConstant")
    Single<List<TicketStatus>> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    @GET(isNameExpr + "isStringConstant")
    Call<UpdateNote> isMethod(@Path("isStringConstant") int isParameter);
}
