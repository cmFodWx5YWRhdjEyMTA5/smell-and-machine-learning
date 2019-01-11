// isComment
package com.danielme.muspyforandroid.repository.rest.musicbrainz.resources;

import com.danielme.muspyforandroid.model.ArtistMb;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<ArtistMb> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);
}
