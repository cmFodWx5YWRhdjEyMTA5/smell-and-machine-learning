// isComment
package org.addhen.smssync.data.repository;

import org.addhen.smssync.data.entity.mapper.LogDataMapper;
import org.addhen.smssync.data.repository.datasource.log.LogDataSource;
import org.addhen.smssync.data.repository.datasource.log.LogDataSourceFactory;
import org.addhen.smssync.domain.entity.LogEntity;
import org.addhen.smssync.domain.repository.LogRepository;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

/**
 * isComment
 */
@Singleton
public class isClassOrIsInterface implements LogRepository {

    private final LogDataMapper isVariable;

    private final LogDataSourceFactory isVariable;

    private LogDataSource isVariable;

    @Inject
    public isConstructor(LogDataMapper isParameter, LogDataSourceFactory isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Observable<List<LogEntity>> isMethod() {
        isNameExpr = isNameExpr.isMethod();
        return isNameExpr.isMethod().isMethod(mLogDataMapper::map);
    }

    @Override
    public Observable<Long> isMethod(LogEntity isParameter) {
        isNameExpr = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public Observable<Long> isMethod() {
        isNameExpr = isNameExpr.isMethod();
        return isNameExpr.isMethod();
    }

    @Override
    public Observable<LogEntity> isMethod() {
        isNameExpr = isNameExpr.isMethod();
        return isNameExpr.isMethod().isMethod(isParameter -> isNameExpr.isMethod(isNameExpr));
    }
}
