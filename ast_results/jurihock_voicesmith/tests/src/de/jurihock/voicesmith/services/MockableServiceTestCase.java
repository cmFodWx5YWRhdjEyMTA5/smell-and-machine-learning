// isComment
package de.jurihock.voicesmith.services;

import android.app.Service;
import android.content.Intent;
import android.test.ServiceTestCase;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public abstract class isClassOrIsInterface<T extends Service> extends ServiceTestCase<T> {

    /**
     * isComment
     */
    @InjectMocks
    private T isVariable;

    private final Class<T> isVariable;

    protected Class<T> isMethod() {
        return isNameExpr;
    }

    public isConstructor(Class<T> isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(Intent isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod();
    }

    protected void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isMethod(), isMethod());
        isMethod(isNameExpr);
    }

    protected void isMethod() {
        if (isMethod() == null) {
            throw new NullPointerException("isStringConstant");
        }
        isNameExpr.isMethod(this);
    }
}
