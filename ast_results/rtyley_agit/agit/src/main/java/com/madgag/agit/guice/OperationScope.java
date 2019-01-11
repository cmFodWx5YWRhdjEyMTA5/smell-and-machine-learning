// isComment
package com.madgag.agit.guice;

import static com.google.common.base.Preconditions.checkState;
import com.google.common.collect.MapMaker;
import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.OutOfScopeException;
import com.google.inject.Scope;
import com.google.inject.TypeLiteral;
import com.madgag.agit.operations.CancellationSignaller;
import com.madgag.agit.operations.GitOperation;
import com.madgag.agit.operations.OperationUIContext;
import com.madgag.agit.operations.Progress;
import com.madgag.agit.operations.ProgressListener;
import com.madgag.android.blockingprompt.BlockingPromptService;
import java.util.Map;

public class isClassOrIsInterface extends ScopeBase implements Scope {

    // isComment
    private static final Key<GitOperation> isVariable = isNameExpr.isMethod(GitOperation.class);

    private static final Key<ProgressListener<Progress>> isVariable = isNameExpr.isMethod(new TypeLiteral<ProgressListener<Progress>>() {
    });

    private static final Key<BlockingPromptService> isVariable = isNameExpr.isMethod(BlockingPromptService.class);

    public static Module isMethod() {
        return new AbstractModule() {

            public void isMethod() {
                OperationScope isVariable = new OperationScope();
                isMethod(OperationScoped.class, isNameExpr);
                isMethod(OperationScope.class).isMethod(isNameExpr);
                isMethod(isNameExpr).isMethod(isNameExpr.<GitOperation>isMethod()).isMethod(OperationScoped.class);
                isMethod(isNameExpr).isMethod(isNameExpr.<ProgressListener<Progress>>isMethod()).isMethod(OperationScoped.class);
                // isComment
                isMethod(CancellationSignaller.class).isMethod(GitOperation.class);
            }
        };
    }

    private final ThreadLocal<Map<Key<?>, Object>> isVariable = new ThreadLocal<Map<Key<?>, Object>>();

    public void isMethod(GitOperation isParameter, OperationUIContext isParameter) {
        isMethod(isNameExpr.isMethod() == null, "isStringConstant");
        Map<Key<?>, Object> isVariable = new MapMaker().isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    public void isMethod() {
        isMethod(isNameExpr.isMethod() != null, "isStringConstant");
        isNameExpr.isMethod();
    }

    @Override
    protected <T> Map<Key<?>, Object> isMethod(Key<T> isParameter) {
        Map<Key<?>, Object> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            throw new OutOfScopeException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        return isNameExpr;
    }
}
