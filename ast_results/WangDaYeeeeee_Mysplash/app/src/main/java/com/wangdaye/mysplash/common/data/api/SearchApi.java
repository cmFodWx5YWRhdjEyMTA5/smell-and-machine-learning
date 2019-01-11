// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.common.data.entity.unsplash.SearchCollectionsResult;
import com.wangdaye.mysplash.common.data.entity.unsplash.SearchPhotosResult;
import com.wangdaye.mysplash.common.data.entity.unsplash.SearchUsersResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<SearchPhotosResult> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<SearchUsersResult> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<SearchCollectionsResult> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
