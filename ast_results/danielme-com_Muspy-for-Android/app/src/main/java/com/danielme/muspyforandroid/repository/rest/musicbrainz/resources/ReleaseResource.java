// isComment
package com.danielme.muspyforandroid.repository.rest.musicbrainz.resources;

import com.danielme.muspyforandroid.model.ReleaseMBWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    @GET("isStringConstant")
    Call<ReleaseMBWrapper> isMethod(@Query("isStringConstant") String isParameter);
}
