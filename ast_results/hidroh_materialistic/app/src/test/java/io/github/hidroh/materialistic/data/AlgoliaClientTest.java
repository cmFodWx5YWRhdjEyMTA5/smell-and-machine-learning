// isComment
package io.github.hidroh.materialistic.data;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;
import io.github.hidroh.materialistic.ActivityModule;
import io.github.hidroh.materialistic.DataModule;
import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
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
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Captor
    ArgumentCaptor<Item[]> isVariable;

    private AlgoliaClient isVariable;

    @Mock
    ResponseListener<Item> isVariable;

    @Mock
    ResponseListener<Item[]> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr = true;
        ObjectGraph isVariable = isNameExpr.isMethod(new TestModule());
        isNameExpr.isMethod(this);
        isNameExpr = new AlgoliaClient(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr.isFieldAccessExpr, isMethod()).isMethod(isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        AlgoliaClient.AlgoliaHits isVariable = new GsonBuilder().isMethod().isMethod("isStringConstant", AlgoliaClient.AlgoliaHits.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr.isMethod(new IOException()));
        isNameExpr.isFieldAccessExpr = true;
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        AlgoliaClient.AlgoliaHits isVariable = new GsonBuilder().isMethod().isMethod("isStringConstant", AlgoliaClient.AlgoliaHits.class);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod("isStringConstant"))).isMethod(isNameExpr.isMethod(new Throwable("isStringConstant")));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"));
    }

    @Module(injects = { AlgoliaClientTest.class, AlgoliaClient.class }, overrides = true)
    static class isClassOrIsInterface {

        @Provides
        @Singleton
        @Named(isNameExpr.isFieldAccessExpr)
        public ItemManager isMethod() {
            return isMethod(ItemManager.class);
        }

        @Provides
        @Singleton
        @Named(isNameExpr.isFieldAccessExpr)
        public Scheduler isMethod() {
            return isNameExpr.isMethod();
        }

        @Provides
        @Singleton
        public RestServiceFactory isMethod() {
            return new TestRestServiceFactory();
        }
    }
}
