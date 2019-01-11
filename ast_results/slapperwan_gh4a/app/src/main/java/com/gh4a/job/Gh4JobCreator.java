// isComment
package com.gh4a.job;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class isClassOrIsInterface implements JobCreator {

    @Override
    public Job isMethod(String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new NotificationsJob();
            default:
                return null;
        }
    }
}
