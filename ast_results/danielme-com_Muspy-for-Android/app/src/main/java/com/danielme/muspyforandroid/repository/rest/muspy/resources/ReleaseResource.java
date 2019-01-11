// isComment
package com.danielme.muspyforandroid.repository.rest.muspy.resources;

import com.danielme.muspyforandroid.model.Release;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<ArrayList<Release>> isMethod(@Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<ArrayList<Release>> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
