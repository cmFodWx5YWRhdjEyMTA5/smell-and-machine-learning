// isComment
package org.addhen.smssync.domain.usecase.filter;

import com.addhen.android.raiburari.domain.executor.PostExecutionThread;
import com.addhen.android.raiburari.domain.executor.ThreadExecutor;
import org.addhen.smssync.domain.repository.FilterRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private ListFilterUsecase isVariable;

    @Mock
    private ThreadExecutor isVariable;

    @Mock
    private PostExecutionThread isVariable;

    @Mock
    private FilterRepository isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr.isMethod(this);
        isNameExpr = new ListFilterUsecase(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
    }
}
