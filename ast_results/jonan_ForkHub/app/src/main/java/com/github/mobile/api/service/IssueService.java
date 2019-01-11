// isComment
package com.github.mobile.api.service;

import com.github.mobile.api.model.Issue;
import com.github.mobile.api.model.TimelineEvent;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @Headers("isStringConstant")
    @GET("isStringConstant")
    Call<Issue> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Path("isStringConstant") long isParameter);

    @Headers({ "isStringConstant", "isStringConstant", "isStringConstant" })
    @GET("isStringConstant")
    Call<List<TimelineEvent>> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Path("isStringConstant") long isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
