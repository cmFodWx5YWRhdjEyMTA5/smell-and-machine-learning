// isComment
package org.totschnig.myexpenses.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<List<Issue>> isMethod();

    @POST("isStringConstant")
    Call<Void> isMethod(@Body Vote isParameter);
}
