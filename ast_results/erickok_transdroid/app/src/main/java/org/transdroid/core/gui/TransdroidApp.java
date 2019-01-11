// isComment
package org.transdroid.core.gui;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.JobConfig;
import com.evernote.android.job.JobManager;
import com.evernote.android.job.util.JobLogger;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EApplication;
import org.transdroid.core.gui.log.Log;
import org.transdroid.core.service.ScheduledJobCreator;

@EApplication
public class isClassOrIsInterface extends Application {

    @Bean
    protected Log isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        isNameExpr.isMethod(new JobLogger() {

            @Override
            public void isMethod(int isParameter, @NonNull String isParameter, @NonNull String isParameter, @Nullable Throwable isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        });
        isNameExpr.isMethod(this).isMethod(new ScheduledJobCreator());
    }
}
