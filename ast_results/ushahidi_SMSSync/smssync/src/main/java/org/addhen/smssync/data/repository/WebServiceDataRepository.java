// isComment
package org.addhen.smssync.data.repository;

import org.addhen.smssync.data.entity.mapper.WebServiceDataMapper;
import org.addhen.smssync.data.net.AppHttpClient;
import org.addhen.smssync.data.repository.datasource.webservice.WebServiceDataSource;
import org.addhen.smssync.data.repository.datasource.webservice.WebServiceDataSourceFactory;
import org.addhen.smssync.domain.entity.WebServiceEntity;
import org.addhen.smssync.domain.repository.WebServiceRepository;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

/**
 * isComment
 */
@Singleton
public class isClassOrIsInterface implements WebServiceRepository {

    private final WebServiceDataSourceFactory isVariable;

    private final WebServiceDataMapper isVariable;

    private final AppHttpClient isVariable;

    /**
     * isComment
     */
    @Inject
    public isConstructor(WebServiceDataSourceFactory isParameter, WebServiceDataMapper isParameter, AppHttpClient isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Observable<List<WebServiceEntity>> isMethod(WebServiceEntity.Status isParameter) {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(mWebServiceEntityDataMapper::map);
    }

    @Override
    public List<WebServiceEntity> isMethod(WebServiceEntity.Status isParameter) {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    @Override
    public Observable<Boolean> isMethod(WebServiceEntity isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public Observable<List<WebServiceEntity>> isMethod() {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod().isMethod(mWebServiceEntityDataMapper::map);
    }

    @Override
    public Observable<WebServiceEntity> isMethod(Long isParameter) {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr).isMethod(mWebServiceEntityDataMapper::map);
    }

    @Override
    public Observable<Long> isMethod(WebServiceEntity isParameter) {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public Observable<Long> isMethod(WebServiceEntity isParameter) {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public Observable<Long> isMethod(Long isParameter) {
        final WebServiceDataSource isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr);
    }
}
