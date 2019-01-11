// isComment
package com.danielme.muspyforandroid.repository.rest.lastfm.resources;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") String isParameter);
}
