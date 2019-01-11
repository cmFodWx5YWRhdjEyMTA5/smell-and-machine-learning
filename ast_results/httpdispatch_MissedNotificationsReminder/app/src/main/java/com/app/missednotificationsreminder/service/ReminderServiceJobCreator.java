// isComment
package com.app.missednotificationsreminder.service;

import android.support.annotation.NonNull;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class isClassOrIsInterface implements JobCreator {

    @Override
    public Job isMethod(@NonNull String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new RemindJob();
            default:
                return null;
        }
    }
}
