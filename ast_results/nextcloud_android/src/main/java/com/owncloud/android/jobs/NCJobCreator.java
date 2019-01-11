// isComment
package com.owncloud.android.jobs;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class isClassOrIsInterface implements JobCreator {

    @Override
    public Job isMethod(String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return new ContactsBackupJob();
            case isNameExpr.isFieldAccessExpr:
                return new ContactsImportJob();
            case isNameExpr.isFieldAccessExpr:
                return new AccountRemovalJob();
            case isNameExpr.isFieldAccessExpr:
                return new FilesSyncJob();
            case isNameExpr.isFieldAccessExpr:
                return new OfflineSyncJob();
            case isNameExpr.isFieldAccessExpr:
                return new NotificationJob();
            case isNameExpr.isFieldAccessExpr:
                return new MediaFoldersDetectionJob();
            default:
                return null;
        }
    }
}
