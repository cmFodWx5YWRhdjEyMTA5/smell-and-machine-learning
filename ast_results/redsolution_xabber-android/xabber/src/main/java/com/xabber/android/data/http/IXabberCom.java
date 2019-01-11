// isComment
package com.xabber.android.data.http;

import retrofit2.http.GET;
import rx.Single;

public interface isClassOrIsInterface {

    String isVariable = "isStringConstant";

    @GET("isStringConstant")
    Single<XabberComClient.Patreon> isMethod();
}
