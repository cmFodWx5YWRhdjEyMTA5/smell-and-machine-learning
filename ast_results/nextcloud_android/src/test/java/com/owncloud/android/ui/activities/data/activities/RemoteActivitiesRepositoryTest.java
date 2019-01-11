// isComment
package com.owncloud.android.ui.activities.data.activities;

import com.owncloud.android.lib.common.OwnCloudClient;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class isClassOrIsInterface {

    @Mock
    ActivitiesServiceApi isVariable;

    @Mock
    ActivitiesRepository.LoadActivitiesCallback isVariable;

    @Mock
    OwnCloudClient isVariable;

    @Captor
    private ArgumentCaptor<ActivitiesServiceApi.ActivitiesServiceCallback> isVariable;

    private ActivitiesRepository isVariable;

    private List<Object> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr = new RemoteActivitiesRepository(isNameExpr);
        isNameExpr = new ArrayList<>();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, "isStringConstant");
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isMethod(isNameExpr), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"));
    }
}
