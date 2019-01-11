// isComment
package it.sasabz.android.sasabus.data.network.rest.api;

import it.sasabz.android.sasabus.data.network.rest.Endpoint;
import it.sasabz.android.sasabus.data.network.rest.response.EventBeaconResponse;
import it.sasabz.android.sasabus.data.network.rest.response.EventResponse;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<EventResponse> isMethod();

    @PUT(isNameExpr.isFieldAccessExpr)
    Observable<EventBeaconResponse> isMethod(@Path("isStringConstant") int isParameter, @Path("isStringConstant") int isParameter);
}
