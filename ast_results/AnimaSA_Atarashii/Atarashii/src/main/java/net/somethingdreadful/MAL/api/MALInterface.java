// isComment
package net.somethingdreadful.MAL.api;

import net.somethingdreadful.MAL.api.MALModels.AnimeManga.Anime;
import net.somethingdreadful.MAL.api.MALModels.AnimeManga.AnimeList;
import net.somethingdreadful.MAL.api.MALModels.AnimeManga.Manga;
import net.somethingdreadful.MAL.api.MALModels.AnimeManga.MangaList;
import net.somethingdreadful.MAL.api.MALModels.AnimeManga.Reviews;
import net.somethingdreadful.MAL.api.MALModels.AnimeManga.Schedule;
import net.somethingdreadful.MAL.api.MALModels.ForumMain;
import net.somethingdreadful.MAL.api.MALModels.Profile;
import net.somethingdreadful.MAL.api.MALModels.Recommendations;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<ResponseBody> isMethod();

    @GET("isStringConstant")
    Call<Anime> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Anime>> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Anime>> isMethod(@QueryMap Map<String, String> isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Manga>> isMethod(@QueryMap Map<String, String> isParameter);

    @GET("isStringConstant")
    Call<AnimeList> isMethod(@Path("isStringConstant") String isParameter);

    @DELETE("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<ResponseBody> isMethod(@Field("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") int isParameter, @Field("isStringConstant") float isParameter);

    @FormUrlEncoded
    @PUT("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @FieldMap Map<String, String> isParameter);

    @GET("isStringConstant")
    Call<Manga> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Manga>> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<MangaList> isMethod(@Path("isStringConstant") String isParameter);

    @DELETE("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<ResponseBody> isMethod(@Field("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") int isParameter, @Field("isStringConstant") int isParameter, @Field("isStringConstant") float isParameter);

    @FormUrlEncoded
    @PUT("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @FieldMap Map<String, String> isParameter);

    @GET("isStringConstant")
    Call<Profile> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<ArrayList<net.somethingdreadful.MAL.api.MALModels.Friend>> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<ForumMain> isMethod();

    @GET("isStringConstant")
    Call<ForumMain> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ForumMain> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ForumMain> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ForumMain> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ForumMain> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ForumMain> isMethod(@Query("isStringConstant") String isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter);

    @FormUrlEncoded
    @PUT("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Reviews>> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Reviews>> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<net.somethingdreadful.MAL.api.MALModels.History>> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Recommendations>> isMethod(@Path("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Recommendations>> isMethod(@Path("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<Schedule> isMethod();

    @GET("isStringConstant")
    Call<ArrayList<Anime>> isMethod(@Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Anime>> isMethod(@Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Manga>> isMethod(@Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Manga>> isMethod(@Query("isStringConstant") int isParameter);
}
