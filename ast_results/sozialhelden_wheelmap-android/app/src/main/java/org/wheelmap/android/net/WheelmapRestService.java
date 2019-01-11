// isComment
package org.wheelmap.android.net;

import org.wheelmap.android.model.api.ApiResponse;
import org.wheelmap.android.model.api.MeasurementImageUploadResponse;
import org.wheelmap.android.model.api.MeasurementInfo;
import org.wheelmap.android.model.api.MeasurementInfoWrapper;
import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

interface isClassOrIsInterface {

    @Multipart
    @POST("isStringConstant")
    Observable<Response<ApiResponse>> isMethod(@Path("isStringConstant") long isParameter, @Part MultipartBody.Part isParameter);

    @Multipart
    @POST("isStringConstant")
    Observable<Response<MeasurementImageUploadResponse>> isMethod(@Path("isStringConstant") long isParameter, @Part MultipartBody.Part isParameter);

    @POST("isStringConstant")
    Observable<Response<Void>> isMethod(@Path("isStringConstant") long isParameter, @Path("isStringConstant") long isParameter, @Body MeasurementInfoWrapper isParameter);
}
