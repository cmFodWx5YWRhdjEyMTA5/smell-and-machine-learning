// isComment
package org.addhen.smssync.data.repository.datasource.log;

import org.addhen.smssync.data.cache.FileManager;
import org.addhen.smssync.data.entity.Log;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

/**
 * isComment
 */
@Singleton
public class isClassOrIsInterface implements LogDataSource {

    private final FileManager isVariable;

    @Inject
    public isConstructor(FileManager isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Observable<List<Log>> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Observable<Long> isMethod(Log isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Observable<Long> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Observable<Log> isMethod() {
        return isNameExpr.isMethod();
    }
}
