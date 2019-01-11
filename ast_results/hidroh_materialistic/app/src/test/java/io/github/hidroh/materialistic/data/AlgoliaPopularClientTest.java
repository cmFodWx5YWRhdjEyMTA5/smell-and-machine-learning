// isComment
package io.github.hidroh.materialistic.data;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class isClassOrIsInterface {

    private final String isVariable;

    @Inject
    RestServiceFactory isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    private AlgoliaPopularClient isVariable;

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Parameterized.Parameters
    public static List<Object[]> isMethod() {
        return isNameExpr.isMethod(new Object[] { isNameExpr.isFieldAccessExpr }, new Object[] { isNameExpr.isFieldAccessExpr }, new Object[] { isNameExpr.isFieldAccessExpr }, new Object[] { isNameExpr.isFieldAccessExpr });
    }

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr);
        ObjectGraph isVariable = isNameExpr.isMethod(new TestModule());
        isNameExpr.isMethod(this);
        isNameExpr = new AlgoliaPopularClient(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isMethod())).isMethod(isNameExpr.isMethod(new IOException()));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isMethod(ResponseListener.class));
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod("isStringConstant"));
    }

    @Module(injects = { AlgoliaPopularClientTest.class, AlgoliaPopularClient.class }, overrides = true)
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
