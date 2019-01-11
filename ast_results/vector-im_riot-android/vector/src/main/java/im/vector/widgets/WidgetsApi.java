// isComment
package im.vector.widgets;

import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface isClassOrIsInterface {

    /**
     * isComment
     */
    @POST("isStringConstant")
    Call<Map<String, String>> isMethod(@Body Map<Object, Object> isParameter);
}
