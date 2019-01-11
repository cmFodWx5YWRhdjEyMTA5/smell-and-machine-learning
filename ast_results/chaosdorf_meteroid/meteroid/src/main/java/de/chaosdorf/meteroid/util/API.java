// isComment
package de.chaosdorf.meteroid.util;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.List;
import de.chaosdorf.meteroid.model.*;

public interface isClassOrIsInterface {

    /*isComment*/
    // isComment
    @GET("isStringConstant")
    Call<List<Drink>> isMethod();

    // isComment
    @GET("isStringConstant")
    Call<Drink> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    // isComment
    @DELETE("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    @GET("isStringConstant")
    Call<List<User>> isMethod();

    // isComment
    @GET("isStringConstant")
    Call<User> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    @GET("isStringConstant")
    Call<User> isMethod();

    // isComment
    @POST("isStringConstant")
    Call<User> isMethod(@Body User isParameter);

    // isComment
    @PATCH("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter, @Body User isParameter);

    // isComment
    @DELETE("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter);

    // isComment
    @GET("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") double isParameter);

    // isComment
    @GET("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") double isParameter);

    // isComment
    @GET("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter, @Query("isStringConstant") int isParameter);

    // isComment
    @FormUrlEncoded
    @POST("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") int isParameter, @Field("isStringConstant") String isParameter);
}
