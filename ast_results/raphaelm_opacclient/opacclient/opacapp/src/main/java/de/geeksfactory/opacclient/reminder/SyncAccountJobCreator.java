// isComment
package de.geeksfactory.opacclient.reminder;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class isClassOrIsInterface implements JobCreator {

    public static final String isVariable = "isStringConstant";

    @Nullable
    @Override
    public Job isMethod(@NonNull String isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                return new SyncAccountJob();
            default:
                return null;
        }
    }
}
