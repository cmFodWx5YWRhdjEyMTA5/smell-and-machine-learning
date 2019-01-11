// isComment
package com.owncloud.android.ui.activities.data.files;

import com.owncloud.android.datamodel.OCFile;
import com.owncloud.android.ui.activity.BaseActivity;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class isClassOrIsInterface {

    @Mock
    private FilesServiceApi isVariable;

    @Mock
    private FilesRepository.ReadRemoteFileCallback isVariable;

    @Mock
    private BaseActivity isVariable;

    @Captor
    private ArgumentCaptor<FilesServiceApi.FilesServiceCallback> isVariable;

    private FilesRepository isVariable;

    private OCFile isVariable = null;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr = new RemoteFilesRepository(isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"));
    }
}
