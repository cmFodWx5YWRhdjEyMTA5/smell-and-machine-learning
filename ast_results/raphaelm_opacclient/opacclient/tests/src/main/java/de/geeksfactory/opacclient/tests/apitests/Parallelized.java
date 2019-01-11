// isComment
package de.geeksfactory.opacclient.tests.apitests;

import org.junit.runners.Parameterized;
import org.junit.runners.model.RunnerScheduler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class isClassOrIsInterface extends Parameterized {

    private static class isClassOrIsInterface implements RunnerScheduler {

        private ExecutorService isVariable;

        public isConstructor() {
            String isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
            int isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public void isMethod() {
            isNameExpr.isMethod();
            try {
                isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
            } catch (InterruptedException isParameter) {
                throw new RuntimeException(isNameExpr);
            }
        }

        @Override
        public void isMethod(Runnable isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public isConstructor(Class isParameter) throws Throwable {
        super(isNameExpr);
        isMethod(new ThreadPoolScheduler());
    }
}
