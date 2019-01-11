// isComment
package com.github.mobile.api.service;

import com.github.mobile.api.model.Issue;
import com.github.mobile.api.model.Repository;
import com.github.mobile.api.model.SearchResult;
import com.github.mobile.api.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<SearchResult<User>> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<SearchResult<Repository>> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<SearchResult<Issue>> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);
}
