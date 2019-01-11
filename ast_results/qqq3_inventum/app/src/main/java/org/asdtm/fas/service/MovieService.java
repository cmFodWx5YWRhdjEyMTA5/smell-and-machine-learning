// isComment
package org.asdtm.fas.service;

import org.asdtm.fas.model.Movie;
import org.asdtm.fas.model.MovieResults;
import org.asdtm.fas.model.VideoResults;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<Movie> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<VideoResults> isMethod(@Path("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);

    @GET("isStringConstant")
    Call<MovieResults> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<MovieResults> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<MovieResults> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<MovieResults> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);
}
