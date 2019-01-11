// isComment
package com.fsck.k9;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.RETURNS_DEFAULTS;
import static org.mockito.Mockito.mock;

public class isClassOrIsInterface {

    public static <T> T isMethod(Class<T> isParameter) {
        return isMethod(isNameExpr, new Answer() {

            @Override
            public Object isMethod(InvocationOnMock isParameter) throws Throwable {
                Object isVariable = isNameExpr.isMethod();
                if (isNameExpr.isMethod().isMethod().isMethod(isNameExpr)) {
                    return isNameExpr;
                } else {
                    return isNameExpr.isMethod(isNameExpr);
                }
            }
        });
    }
}
