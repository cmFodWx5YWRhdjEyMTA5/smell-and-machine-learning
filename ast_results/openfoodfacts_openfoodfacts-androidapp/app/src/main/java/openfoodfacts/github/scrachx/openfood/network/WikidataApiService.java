// isComment
package openfoodfacts.github.scrachx.openfood.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Call<Object> isMethod(@Path("isStringConstant") String isParameter);
}
