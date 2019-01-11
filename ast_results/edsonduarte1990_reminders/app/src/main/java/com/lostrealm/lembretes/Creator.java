// isComment
package com.lostrealm.lembretes;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

final class isClassOrIsInterface implements JobCreator {

    @Override
    public Job isMethod(String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                return new DownloadJob();
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                return new NotificationJob();
            default:
                return null;
        }
    }
}
