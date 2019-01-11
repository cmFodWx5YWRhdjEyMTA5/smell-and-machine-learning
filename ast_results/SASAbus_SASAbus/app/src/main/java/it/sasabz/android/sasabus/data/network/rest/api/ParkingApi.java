// isComment
package it.sasabz.android.sasabus.data.network.rest.api;

import it.sasabz.android.sasabus.data.network.rest.Endpoint;
import it.sasabz.android.sasabus.data.network.rest.response.ParkingResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<ParkingResponse> isMethod();

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<ParkingResponse> isMethod(@Path("isStringConstant") int isParameter);
}
