// isComment
package it.sasabz.android.sasabus.data.network.rest.api;

import it.sasabz.android.sasabus.data.network.rest.Endpoint;
import it.sasabz.android.sasabus.data.network.rest.response.ValidityResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr)
    Call<ValidityResponse> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<ValidityResponse> isMethod(@Path("isStringConstant") String isParameter);
}
