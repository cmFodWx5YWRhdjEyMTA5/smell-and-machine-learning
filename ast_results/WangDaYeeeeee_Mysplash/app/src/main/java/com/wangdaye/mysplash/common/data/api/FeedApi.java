// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.data.entity.unsplash.TrendingFeed;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr)
    Call<List<Photo>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr)
    Call<TrendingFeed> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @POST(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @DELETE(isNameExpr.isFieldAccessExpr + "isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);
}
