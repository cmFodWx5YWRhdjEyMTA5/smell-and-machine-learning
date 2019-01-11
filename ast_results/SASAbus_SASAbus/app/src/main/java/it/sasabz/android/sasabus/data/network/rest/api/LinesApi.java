// isComment
package it.sasabz.android.sasabus.data.network.rest.api;

import it.sasabz.android.sasabus.data.network.rest.Endpoint;
import it.sasabz.android.sasabus.data.network.rest.response.LinesAllResponse;
import it.sasabz.android.sasabus.data.network.rest.response.RealtimeResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface isClassOrIsInterface {

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<LinesAllResponse> isMethod();

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<LinesAllResponse> isMethod(@Path("isStringConstant") int isParameter);

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<LinesAllResponse> isMethod(@Path("isStringConstant") String isParameter);

    @GET(isNameExpr.isFieldAccessExpr)
    Observable<RealtimeResponse> isMethod();
}
