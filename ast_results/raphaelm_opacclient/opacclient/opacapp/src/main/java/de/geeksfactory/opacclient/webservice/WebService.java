// isComment
package de.geeksfactory.opacclient.webservice;

import org.joda.time.DateTime;
import java.util.List;
import de.geeksfactory.opacclient.objects.Library;
import de.geeksfactory.opacclient.reporting.Report;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface isClassOrIsInterface {

    @POST("isStringConstant")
    Call<Report> isMethod(@Body Report isParameter);

    @GET("isStringConstant")
    Call<List<Library>> isMethod(@Query("isStringConstant") DateTime isParameter, @Query("isStringConstant") int isParameter, @Query("isStringConstant") Integer isParameter, @Query("isStringConstant") String isParameter);
}
