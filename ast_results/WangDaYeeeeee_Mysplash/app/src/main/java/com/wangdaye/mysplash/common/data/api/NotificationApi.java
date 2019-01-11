// isComment
package com.wangdaye.mysplash.common.data.api;

import com.wangdaye.mysplash.common.data.entity.unsplash.NotificationFeed;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface isClassOrIsInterface {

    @Headers("isStringConstant")
    @POST("isStringConstant")
    Call<NotificationFeed> isMethod(@Body RequestBody isParameter);
}
