// isComment
package io.github.hidroh.materialistic.data;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.android.controller.ServiceController;
import org.robolectric.shadows.ShadowNetworkInfo;
import java.util.List;
import io.github.hidroh.materialistic.R;
import io.github.hidroh.materialistic.test.TestRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ServiceController<TestItemSyncJobService> isVariable;

    private TestItemSyncJobService isVariable;

    @Captor
    ArgumentCaptor<SyncDelegate.ProgressListener> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod(TestItemSyncJobService.class);
        isNameExpr = isNameExpr.isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod((ConnectivityManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        new SyncScheduler().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        List<JobInfo> isVariable = isMethod((JobScheduler) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr).isMethod();
        JobInfo isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(ItemSyncJobService.class.isMethod());
    }

    @Test
    public void isMethod() {
        JobParameters isVariable = isMethod(JobParameters.class);
        isMethod(isNameExpr.isMethod()).isMethod(new SyncDelegate.JobBuilder(isNameExpr, "isStringConstant").isMethod().isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod(SyncDelegate.Job.class));
        isNameExpr.isMethod().isMethod("isStringConstant");
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    public static class isClassOrIsInterface extends ItemSyncJobService {

        SyncDelegate isVariable = isMethod(SyncDelegate.class);

        @NonNull
        @Override
        SyncDelegate isMethod() {
            return isNameExpr;
        }
    }
}
