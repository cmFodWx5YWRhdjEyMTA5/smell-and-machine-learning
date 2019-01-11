// isComment
package org.openobservatory.ooniprobe.common;

import org.openobservatory.ooniprobe.model.RetrieveUrlResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<RetrieveUrlResponse> isMethod(@Query("isStringConstant") String isParameter, @Query("isStringConstant") String isParameter);
}
