// isComment
package io.github.hidroh.materialistic.data;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;
import rx.Observable;
import rx.schedulers.Schedulers;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class isClassOrIsInterface {

    @Inject
    RestServiceFactory isVariable;

    private FeedbackClient isVariable;

    private FeedbackClient.Callback isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(new TestModule()).isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = new FeedbackClient.Impl(isNameExpr, isNameExpr.isMethod());
        isNameExpr = isMethod(FeedbackClient.Callback.class);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod(FeedbackClient.Impl.Issue.class))).isMethod(isNameExpr.isMethod(null));
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod(FeedbackClient.Impl.Issue.class));
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod(FeedbackClient.Impl.Issue.class))).isMethod(isNameExpr.isMethod(new IOException()));
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod(FeedbackClient.Impl.Issue.class));
        isMethod(isNameExpr).isMethod(isMethod(true));
    }

    @Module(injects = FeedbackClientTest.class, overrides = true)
    static class isClassOrIsInterface {

        @Provides
        @Singleton
        public RestServiceFactory isMethod() {
            return new TestRestServiceFactory();
        }
    }
}
