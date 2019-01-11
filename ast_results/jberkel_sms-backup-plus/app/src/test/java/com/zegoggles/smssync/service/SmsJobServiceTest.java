// isComment
package com.zegoggles.smssync.service;

import com.firebase.jobdispatcher.JobParameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.robolectric.Robolectric.setupService;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    private SmsJobService isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(SmsJobService.class);
    }

    @Test
    public void isMethod() {
        final JobParameters isVariable = isMethod(JobParameters.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        final JobParameters isVariable = isMethod(JobParameters.class);
        boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }
}
