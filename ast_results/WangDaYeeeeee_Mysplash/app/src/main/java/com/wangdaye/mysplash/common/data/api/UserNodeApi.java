// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.common.data.entity.unsplash.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<User> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<List<User>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<List<User>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
