// isComment
package it.sasabz.android.sasabus.data.network.rest.api;

import it.sasabz.android.sasabus.data.network.rest.Endpoint;
import it.sasabz.android.sasabus.data.network.rest.response.BadgesResponse;
import it.sasabz.android.sasabus.data.network.rest.response.LeaderboardResponse;
import it.sasabz.android.sasabus.data.network.rest.response.ProfilePictureResponse;
import it.sasabz.android.sasabus.data.network.rest.response.ProfileResponse;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<BadgesResponse> isMethod();

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<BadgesResponse> isMethod();

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<BadgesResponse> isMethod();

    @PUT(isNameExpr.isFieldAccessExpr)
    Observable<Void> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<LeaderboardResponse> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<ProfileResponse> isMethod();

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<ProfileResponse> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<ProfilePictureResponse> isMethod();

    @FormUrlEncoded
    @POST(isNameExpr.isFieldAccessExpr)
    Observable<Void> isMethod(@Field("isStringConstant") String isParameter);

    @Multipart
    @POST(isNameExpr.isFieldAccessExpr)
    Observable<Void> isMethod(@Part("isStringConstant") RequestBody isParameter);
}
