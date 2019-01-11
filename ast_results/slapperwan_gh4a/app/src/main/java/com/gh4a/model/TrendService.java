// isComment
package com.gh4a.model;

import java.util.List;
import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Single<Response<List<Trend>>> isMethod(@Path("isStringConstant") String isParameter);
}
