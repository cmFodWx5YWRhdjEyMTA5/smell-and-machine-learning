// isComment
package com.github.mobile.api.service;

import com.github.mobile.api.model.Project;
import com.github.mobile.api.model.ProjectCard;
import com.github.mobile.api.model.ProjectColumn;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @Headers("isStringConstant")
    @GET("isStringConstant")
    Call<List<Project>> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @Headers("isStringConstant")
    @GET("isStringConstant")
    Call<List<ProjectColumn>> isMethod(@Path("isStringConstant") long isParameter, @Query("isStringConstant") int isParameter);

    @Headers("isStringConstant")
    @GET("isStringConstant")
    Call<List<ProjectCard>> isMethod(@Path("isStringConstant") long isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
