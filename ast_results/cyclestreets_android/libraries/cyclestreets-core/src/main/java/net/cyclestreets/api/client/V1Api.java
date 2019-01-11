// isComment
package net.cyclestreets.api.client;

import net.cyclestreets.api.client.dto.BlogFeedDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<String> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter, @Query("isStringConstant") int isParameter);

    @GET("isStringConstant")
    Call<String> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") long isParameter);

    @GET("isStringConstant")
    Call<BlogFeedDto> isMethod();
}
