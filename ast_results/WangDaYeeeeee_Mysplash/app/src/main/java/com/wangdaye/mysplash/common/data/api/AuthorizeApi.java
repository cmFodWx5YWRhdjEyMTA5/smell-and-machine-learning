// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.common.data.entity.unsplash.AccessToken;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @POST("isStringConstant")
    Call<AccessToken> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);
}
