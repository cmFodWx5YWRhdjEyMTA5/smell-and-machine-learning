// isComment
package org.addhen.smssync.domain.usecase.filter;

import com.addhen.android.raiburari.domain.executor.PostExecutionThread;
import com.addhen.android.raiburari.domain.executor.ThreadExecutor;
import org.addhen.smssync.domain.entity.DomainEntityFixture;
import org.addhen.smssync.domain.entity.FilterEntity;
import org.addhen.smssync.domain.repository.FilterRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private DeleteFilterUsecase isVariable;

    @Mock
    private ThreadExecutor isVariable;

    @Mock
    private PostExecutionThread isVariable;

    @Mock
    private FilterRepository isVariable;

    @Mock
    private FilterEntity isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr.isMethod(this);
        isNameExpr = new DeleteFilterUsecase(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test(expected = RuntimeException.class)
    public void isMethod() {
        isMethod(isNameExpr);
        isNameExpr.isMethod(null);
        isNameExpr.isMethod(null);
    }
}
