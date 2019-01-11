// isComment
package com.xabber.android.data.xaccount;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Single;

public interface isClassOrIsInterface {

    @POST("isStringConstant")
    Single<XAccountTokenDTO> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Source isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter);

    @POST("isStringConstant")
    Single<XAccountTokenDTO> isMethod(@Body AuthManager.SocialAuthRequest isParameter);

    @POST("isStringConstant")
    Single<XAccountTokenDTO> isMethod(@Body AuthManager.Email isParameter);

    @GET("isStringConstant")
    Single<XabberAccountDTO> isMethod(@Header("isStringConstant") String isParameter);

    @PATCH("isStringConstant")
    Single<XabberAccountDTO> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Account isParameter);

    @GET("isStringConstant")
    Single<AuthManager.ListClientSettingsDTO> isMethod(@Header("isStringConstant") String isParameter);

    @PATCH("isStringConstant")
    Single<AuthManager.ListClientSettingsDTO> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.ClientSettingsWithoutOrderDTO isParameter);

    @PATCH("isStringConstant")
    Single<AuthManager.ListClientSettingsDTO> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.ClientSettingsOrderDTO isParameter);

    @HTTP(method = "isStringConstant", path = "isStringConstant", hasBody = true)
    Single<AuthManager.ListClientSettingsDTO> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Jid isParameter);

    @POST("isStringConstant")
    Single<XabberAccountDTO> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Code isParameter);

    @POST("isStringConstant")
    Single<XabberAccountDTO> isMethod(@Body AuthManager.Key isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Email isParameter);

    @DELETE("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter, @Path(value = "isStringConstant", encoded = true) int isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Endpoint isParameter);

    @HTTP(method = "isStringConstant", path = "isStringConstant", hasBody = true)
    Single<ResponseBody> isMethod(@Body AuthManager.Endpoint isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.ChangePassFields isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Body AuthManager.ResetPassFields isParameter);

    /*isComment*/
    @POST("isStringConstant")
    Single<AuthManager.XMPPCode> isMethod(@Body AuthManager.Jid isParameter);

    @POST("isStringConstant")
    Single<XabberAccountDTO> isMethod(@Body AuthManager.CodeConfirm isParameter);

    @GET("isStringConstant")
    Single<AuthManager.HostResponse> isMethod();

    @POST("isStringConstant")
    Single<XabberAccountDTO> isMethod(@Body AuthManager.SignUpFields isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.SocialAuthRequest isParameter);

    @POST("isStringConstant")
    Single<ResponseBody> isMethod(@Header("isStringConstant") String isParameter, @Body AuthManager.Provider isParameter);
}
