// isComment
package com.github.pires.obd.reader.net;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    @POST("isStringConstant")
    Response isMethod(@Body ObdReading isParameter);
}
