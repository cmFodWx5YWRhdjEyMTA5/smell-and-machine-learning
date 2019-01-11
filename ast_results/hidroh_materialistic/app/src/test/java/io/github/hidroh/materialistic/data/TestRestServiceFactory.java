// isComment
package io.github.hidroh.materialistic.data;

import java.util.concurrent.Executor;
import static org.mockito.Mockito.mock;

public class isClassOrIsInterface implements RestServiceFactory {

    public static final HackerNewsClient.RestService isVariable = isMethod(HackerNewsClient.RestService.class);

    public static final AlgoliaClient.RestService isVariable = isMethod(AlgoliaClient.RestService.class);

    public static final FeedbackClient.Impl.FeedbackService isVariable = isMethod(FeedbackClient.Impl.FeedbackService.class);

    public static final ReadabilityClient.Impl.MercuryService isVariable = isMethod(ReadabilityClient.Impl.MercuryService.class);

    @Override
    public RestServiceFactory isMethod(boolean isParameter) {
        return this;
    }

    @Override
    public <T> T isMethod(String isParameter, Class<T> isParameter) {
        return isMethod(isNameExpr, isNameExpr, null);
    }

    @Override
    public <T> T isMethod(String isParameter, Class<T> isParameter, Executor isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return (T) isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return (T) isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return (T) isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return (T) isNameExpr;
        }
        return isMethod(isNameExpr);
    }
}
