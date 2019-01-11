// isComment
package org.wordpress.android.ui.stats.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import org.wordpress.android.WordPress;
import org.wordpress.android.ui.stats.StatsEvents;
import org.wordpress.android.util.AppLog;
import org.wordpress.android.util.AppLog.T;
import de.greenrobot.event.EventBus;
import static org.wordpress.android.ui.stats.service.StatsServiceStarter.ARG_START_ID;

/**
 * isComment
 */
public class isClassOrIsInterface extends JobService implements StatsServiceLogic.ServiceCompletionListener {

    @Override
    public boolean isMethod(JobParameters isParameter) {
        if (isNameExpr.isMethod() != null) {
            int isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            isNameExpr.isMethod().isMethod(new StatsEvents.UpdateStatusStarted(isNameExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr + "isStringConstant");
            StatsServiceLogic isVariable = new StatsServiceLogic(this);
            isNameExpr.isMethod((WordPress) isMethod());
            isNameExpr.isMethod(new Bundle(isNameExpr.isMethod()), isNameExpr);
            return true;
        }
        return true;
    }

    @Override
    public boolean isMethod(JobParameters isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(isNameExpr, true);
        return true;
    }

    @Override
    public void isMethod(Object isParameter) {
        int isVariable = ((JobParameters) isNameExpr).isMethod().isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr + "isStringConstant");
        isNameExpr.isMethod().isMethod(new StatsEvents.UpdateStatusFinished(isNameExpr));
        isMethod((JobParameters) isNameExpr, true);
    }
}
