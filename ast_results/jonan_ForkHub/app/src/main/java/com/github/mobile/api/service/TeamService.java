// isComment
package com.github.mobile.api.service;

import com.github.mobile.api.model.Team;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<List<Team>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<Team> isMethod(@Path("isStringConstant") long isParameter);
}
