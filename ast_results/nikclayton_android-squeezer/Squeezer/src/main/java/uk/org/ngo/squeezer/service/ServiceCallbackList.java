// isComment
package uk.org.ngo.squeezer.service;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * isComment
 */
public class isClassOrIsInterface<T extends ServiceCallback> implements Iterable<T> {

    private final ServicePublisher isVariable;

    private final Map<T, Boolean> isVariable = new ConcurrentHashMap<T, Boolean>();

    public isConstructor(ServicePublisher isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }

    public ServiceCallbackList<T> isMethod(T isParameter) {
        isNameExpr.isMethod(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        return this;
    }

    public ServiceCallbackList<T> isMethod(T isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return this;
    }

    @Override
    public Iterator<T> isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    public interface isClassOrIsInterface {

        void isMethod(ServiceCallbackList isParameter, ServiceCallback isParameter);

        void isMethod(ServiceCallback isParameter);
    }
}
