// isComment
package io.github.hidroh.materialistic.data;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;
import io.github.hidroh.materialistic.DataModule;
import io.github.hidroh.materialistic.test.InMemoryCache;
import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class isClassOrIsInterface {

    @Inject
    RestServiceFactory isVariable;

    @Inject
    LocalCache isVariable;

    private ReadabilityClient isVariable;

    private ReadabilityClient.Callback isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        ObjectGraph isVariable = isNameExpr.isMethod(new TestModule());
        isNameExpr.isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = new ReadabilityClient.Impl(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isMethod(ReadabilityClient.Callback.class);
    }

    @Test
    public void isMethod() {
        ReadabilityClient.Impl.Readable isVariable = new GsonBuilder().isMethod().isMethod("isStringConstant", ReadabilityClient.Impl.Readable.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        ReadabilityClient.Impl.Readable isVariable = new GsonBuilder().isMethod().isMethod("isStringConstant", ReadabilityClient.Impl.Readable.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr.isMethod(new IOException()));
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isMethod()).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isMethod()).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod());
    }

    @Module(injects = { ReadabilityClientTest.class, ReadabilityClient.Impl.class }, overrides = true)
    static class isClassOrIsInterface {

        @Provides
        @Singleton
        public RestServiceFactory isMethod() {
            return new TestRestServiceFactory();
        }

        @Provides
        @Singleton
        @Named(isNameExpr.isFieldAccessExpr)
        public Scheduler isMethod() {
            return isNameExpr.isMethod();
        }

        @Provides
        @Singleton
        @Named(isNameExpr.isFieldAccessExpr)
        public Scheduler isMethod() {
            return isNameExpr.isMethod();
        }

        @Provides
        @Singleton
        public LocalCache isMethod() {
            return new InMemoryCache();
        }
    }
}
