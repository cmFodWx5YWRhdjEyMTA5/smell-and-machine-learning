// isComment
package com.danielme.muspyforandroid.repository.rest.muspy.resources;

import com.danielme.muspyforandroid.model.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<User> isMethod(@Header("isStringConstant") String isParameter);

    @FormUrlEncoded
    @POST("isStringConstant")
    Call<Void> isMethod(@Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter);

    @FormUrlEncoded
    @PUT("isStringConstant")
    Call<Void> isMethod(@Header("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Field("isStringConstant") String isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter, @Field("isStringConstant") boolean isParameter);
}
