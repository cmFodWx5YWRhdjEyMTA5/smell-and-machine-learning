// isComment
package com.gh4a.model;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Single<Response<GitHubFeed>> isMethod(@Path(value = "isStringConstant", encoded = true) String isParameter);

    @GET("isStringConstant")
    Single<Response<GitHubFeed>> isMethod();
}
