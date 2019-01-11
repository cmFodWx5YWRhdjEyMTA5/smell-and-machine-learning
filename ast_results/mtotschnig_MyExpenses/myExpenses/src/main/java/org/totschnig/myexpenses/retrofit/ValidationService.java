// isComment
package org.totschnig.myexpenses.retrofit;

import org.totschnig.myexpenses.util.licence.Licence;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface isClassOrIsInterface {

    @PUT("isStringConstant")
    Call<Licence> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter);

    @DELETE("isStringConstant")
    Call<Void> isMethod(@Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter, @Path("isStringConstant") String isParameter);
}
