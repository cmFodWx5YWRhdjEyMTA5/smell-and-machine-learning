// isComment
package com.danielme.muspyforandroid.repository.rest.coverartarchive;

import com.danielme.muspyforandroid.model.Cover;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<Cover> isMethod(@Path("isStringConstant") String isParameter);
}
