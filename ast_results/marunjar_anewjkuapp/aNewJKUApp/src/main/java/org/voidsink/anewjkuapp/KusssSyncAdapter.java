// isComment
package org.voidsink.anewjkuapp;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import org.voidsink.anewjkuapp.kusss.KusssHandler;
import org.voidsink.anewjkuapp.notification.KusssNotificationBuilder;
import org.voidsink.anewjkuapp.update.ImportAssessmentTask;
import org.voidsink.anewjkuapp.update.ImportCourseTask;
import org.voidsink.anewjkuapp.update.ImportCurriculaTask;
import org.voidsink.anewjkuapp.update.ImportExamTask;
import org.voidsink.anewjkuapp.utils.AppUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    private static final String isVariable = KusssSyncAdapter.class.isMethod();

    // isComment
    // isComment
    private ExecutorService isVariable = null;

    public isConstructor(Context isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, boolean isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(Account isParameter, Bundle isParameter, String isParameter, ContentProviderClient isParameter, SyncResult isParameter) {
        if (isNameExpr == null || isNameExpr.isFieldAccessExpr == null) {
            isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
            isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
            return;
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
        if (!isNameExpr.isMethod().isMethod(isMethod(), isNameExpr.isMethod(isMethod(), isNameExpr), isNameExpr.isMethod(isMethod(), isNameExpr), isNameExpr.isMethod(isMethod(), isNameExpr))) {
            isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
            return;
        }
        isNameExpr.isMethod();
        this.isFieldAccessExpr = isNameExpr.isMethod();
        try {
            isNameExpr.isMethod(isNameExpr, isMethod(), new Callable[] { new ImportCurriculaTask(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod()), new ImportCourseTask(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod()), new ImportAssessmentTask(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod()), new ImportExamTask(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod()) }, true);
        } finally {
            this.isFieldAccessExpr.isMethod();
            isNameExpr.isMethod().isMethod(isMethod());
        }
    }

    @Override
    public void isMethod() {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod();
        }
    }
}
