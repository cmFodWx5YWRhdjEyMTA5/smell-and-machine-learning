// isComment
package openfoodfacts.github.scrachx.openfood.category.network;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * isComment
 */
@FunctionalInterface
public interface isClassOrIsInterface {

    @GET("isStringConstant")
    Single<CategoryResponse> isMethod();
}
