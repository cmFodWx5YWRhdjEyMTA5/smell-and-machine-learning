// isComment
package com.github.mobile.api.service;

import com.github.mobile.api.model.CommitComment;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface isClassOrIsInterface {

    @Headers("isStringConstant")
    @GET("isStringConstant")
    Call<List<CommitComment>> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter);
}
