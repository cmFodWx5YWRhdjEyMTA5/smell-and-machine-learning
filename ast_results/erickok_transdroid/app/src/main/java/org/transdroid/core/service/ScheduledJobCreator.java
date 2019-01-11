// isComment
package org.transdroid.core.service;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class isClassOrIsInterface implements JobCreator {

    @Nullable
    @Override
    public Job isMethod(@NonNull String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new AppUpdateJob();
            case isNameExpr.isFieldAccessExpr:
                return new RssCheckerJob();
            case isNameExpr.isFieldAccessExpr:
                return new ServerCheckerJob();
            default:
                return null;
        }
    }
}
