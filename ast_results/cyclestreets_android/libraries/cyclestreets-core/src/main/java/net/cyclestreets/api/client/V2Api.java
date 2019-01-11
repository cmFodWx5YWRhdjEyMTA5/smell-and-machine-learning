// isComment
package net.cyclestreets.api.client;

import net.cyclestreets.api.client.dto.PhotomapCategoriesDto;
import net.cyclestreets.api.client.dto.PoiTypesDto;
import net.cyclestreets.api.client.dto.SendFeedbackResponseDto;
import net.cyclestreets.api.client.dto.UploadPhotoResponseDto;
import net.cyclestreets.api.client.dto.UserAuthenticateResponseDto;
import net.cyclestreets.api.client.dto.UserCreateResponseDto;
import net.cyclestreets.api.client.dto.UserJourneysDto;
import org.geojson.FeatureCollection;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<PoiTypesDto> isMethod(@Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<FeatureCollection> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<FeatureCollection> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") double isParameter, @Query("isStringConstant") double isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<FeatureCollection> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<FeatureCollection> isMethod(@Query("isStringConstant") long isParameter);

    @GET("isStringConstant")
    Call<FeatureCollection> isMethod(@Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<UserJourneysDto> isMethod(@Query("isStringConstant") String isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<UserCreateResponseDto> isMethod(@Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<UserAuthenticateResponseDto> isMethod(@Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<SendFeedbackResponseDto> isMethod(@Field("isStringConstant") String isParameter, @Field("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<PhotomapCategoriesDto> isMethod();

    @Multipart
    @POST("isStringConstant")
    Call<UploadPhotoResponseDto> isMethod(@Part("isStringConstant") RequestBody isParameter, @Part("isStringConstant") RequestBody isParameter, @Part("isStringConstant") double isParameter, @Part("isStringConstant") double isParameter, @Part("isStringConstant") long isParameter, @Part("isStringConstant") RequestBody isParameter, @Part("isStringConstant") RequestBody isParameter, @Part("isStringConstant") RequestBody isParameter, @Part MultipartBody.Part isParameter);
}
