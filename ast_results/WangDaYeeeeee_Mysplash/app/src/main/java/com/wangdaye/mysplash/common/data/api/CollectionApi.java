// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.common.data.entity.unsplash.ChangeCollectionPhotoResult;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<List<Collection>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<List<Collection>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<List<Collection>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<Collection> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<Collection> isMethod(@Path("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<List<Collection>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @POST("isStringConstant")
    Call<Collection> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") boolean isParameter);

    @POST("isStringConstant")
    Call<Collection> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") boolean isParameter);

    @PUT("isStringConstant")
    Call<Collection> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") boolean isParameter);

    @DELETE("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter);

    @POST("isStringConstant")
    Call<ChangeCollectionPhotoResult> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);

    @DELETE("isStringConstant")
    Call<ChangeCollectionPhotoResult> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);
}
