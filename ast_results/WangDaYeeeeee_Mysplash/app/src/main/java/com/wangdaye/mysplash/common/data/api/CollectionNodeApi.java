// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<List<Collection>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<List<Collection>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<List<Collection>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<Collection> isMethod(@Path("isStringConstant") String isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<Collection> isMethod(@Path("isStringConstant") String isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<List<Collection>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
