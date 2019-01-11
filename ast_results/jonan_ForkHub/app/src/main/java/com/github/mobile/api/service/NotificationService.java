// isComment
package com.github.mobile.api.service;

import com.github.mobile.api.model.Notification;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<List<Notification>> isMethod(@Query("isStringConstant") boolean isParameter, @Query("isStringConstant") int isParameter);

    @PATCH("isStringConstant")
    Call<ResponseBody> isMethod(@Path("isStringConstant") int isParameter);
}
