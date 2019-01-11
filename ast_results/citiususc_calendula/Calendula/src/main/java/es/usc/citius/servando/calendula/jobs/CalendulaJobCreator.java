// isComment
package es.usc.citius.servando.calendula.jobs;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class isClassOrIsInterface implements JobCreator {

    @Override
    public Job isMethod(String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new PurgeCacheJob();
            case isNameExpr.isFieldAccessExpr:
                return new CheckDatabaseUpdatesJob();
            default:
                return null;
        }
    }
}
