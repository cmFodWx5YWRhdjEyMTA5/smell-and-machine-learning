// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.BuildConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.OPTIONS;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface isClassOrIsInterface {

    @Headers({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
    @OPTIONS("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @Headers({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" + isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", "isStringConstant" })
    @GET("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @Headers({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
    @OPTIONS
    Call<ResponseBody> isMethod(@Url String isParameter);

    @Headers({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" + isNameExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", "isStringConstant" })
    @GET
    Call<ResponseBody> isMethod(@Url String isParameter);
}
