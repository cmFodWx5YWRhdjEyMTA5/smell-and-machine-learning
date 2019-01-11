// isComment
package de.skubware.opentraining.activity.create_workout.upload_exercise;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import de.skubware.opentraining.basic.ExerciseType;
import de.skubware.opentraining.db.rest.ServerModel;

public interface isClassOrIsInterface {

    @POST("isStringConstant")
    public Response isMethod(@Body ExerciseType isParameter);

    @POST("isStringConstant")
    public Response isMethod(@Body ExerciseType isParameter);

    @GET("isStringConstant")
    public ServerModel.Equipment[] isMethod();

    @GET("isStringConstant")
    public ServerModel.MuscleCategory[] isMethod();

    @GET("isStringConstant")
    public ServerModel.Language[] isMethod();
}
