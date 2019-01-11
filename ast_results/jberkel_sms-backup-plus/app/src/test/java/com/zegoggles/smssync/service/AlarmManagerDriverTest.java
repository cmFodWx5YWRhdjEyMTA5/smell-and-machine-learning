// isComment
package com.zegoggles.smssync.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.firebase.jobdispatcher.Driver;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.Job;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobTrigger;
import com.firebase.jobdispatcher.JobValidator;
import com.firebase.jobdispatcher.ObservedUri;
import com.firebase.jobdispatcher.RetryStrategy;
import com.firebase.jobdispatcher.Trigger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowAlarmManager;
import org.robolectric.shadows.ShadowPendingIntent;
import java.util.Collections;
import java.util.List;
import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;
import static com.firebase.jobdispatcher.FirebaseJobDispatcher.SCHEDULE_RESULT_SUCCESS;
import static com.firebase.jobdispatcher.FirebaseJobDispatcher.SCHEDULE_RESULT_UNSUPPORTED_TRIGGER;
import static com.google.common.truth.Truth.assertThat;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private AlarmManagerDriver isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new AlarmManagerDriver(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        final Job isVariable = isMethod().isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod();
        final int isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        final Job isVariable = isMethod().isMethod("isStringConstant").isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod();
        final int isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        final Job isVariable = isMethod().isMethod();
        final int isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        final Job isVariable = isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod(new ObservedUri(isNameExpr.isMethod("isStringConstant"), isIntegerConstant)))).isMethod();
        final int isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    private Intent isMethod(String isParameter) {
        AlarmManager isVariable = (AlarmManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        ShadowAlarmManager isVariable = isMethod(isNameExpr);
        ShadowAlarmManager.ScheduledAlarm isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isStringConstant);
        PendingIntent isVariable = isNameExpr.isFieldAccessExpr;
        ShadowPendingIntent isVariable = isMethod(isNameExpr);
        ComponentName isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }

    private Job.Builder isMethod() {
        return new FirebaseJobDispatcher(new Driver() {

            @Override
            public int isMethod(Job isParameter) {
                return isIntegerConstant;
            }

            @Override
            public int isMethod(String isParameter) {
                return isIntegerConstant;
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public JobValidator isMethod() {
                return new JobValidator() {

                    @Override
                    public List<String> isMethod(JobParameters isParameter) {
                        return null;
                    }

                    @Override
                    public List<String> isMethod(JobTrigger isParameter) {
                        return null;
                    }

                    @Override
                    public List<String> isMethod(RetryStrategy isParameter) {
                        return null;
                    }
                };
            }

            @Override
            public boolean isMethod() {
                return true;
            }
        }).isMethod();
    }
}
