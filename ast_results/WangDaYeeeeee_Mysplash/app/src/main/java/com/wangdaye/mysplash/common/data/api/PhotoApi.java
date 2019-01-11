// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.common.data.entity.unsplash.PhotoStats;
import com.wangdaye.mysplash.common.data.entity.unsplash.LikePhotoResult;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface isClassOrIsInterface {

    // isComment
    String isVariable = "isStringConstant";

    String isVariable = "isStringConstant";

    String isVariable = "isStringConstant";

    /**
     * isComment
     */
    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<PhotoStats> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @POST("isStringConstant")
    Call<LikePhotoResult> isMethod(@Path("isStringConstant") String isParameter);

    @DELETE("isStringConstant")
    Call<LikePhotoResult> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<Photo> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<Photo> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<List<Photo>> isMethod(@Query("isStringConstant") Integer isParameter, @Query("isStringConstant") Boolean isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET
    Call<ResponseBody> isMethod(@Url String isParameter);
}
