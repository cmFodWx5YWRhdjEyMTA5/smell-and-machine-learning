// isComment
package fr.gouv.etalab.mastodon.jobs;

/*isComment*/
import android.support.annotation.NonNull;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;
import com.evernote.android.job.JobManager;

public class isClassOrIsInterface implements JobCreator {

    @Override
    public Job isMethod(@NonNull String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new NotificationsSyncJob();
            case isNameExpr.isFieldAccessExpr:
                return new HomeTimelineSyncJob();
            case isNameExpr.isFieldAccessExpr:
                return new ScheduledTootsSyncJob();
            default:
                return null;
        }
    }

    @SuppressWarnings("isStringConstant")
    public static void isMethod(String isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    public static void isMethod(int isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
