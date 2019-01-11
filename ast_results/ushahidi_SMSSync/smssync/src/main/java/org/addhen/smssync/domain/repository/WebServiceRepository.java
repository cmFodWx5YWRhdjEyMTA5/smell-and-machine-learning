// isComment
package org.addhen.smssync.domain.repository;

import com.addhen.android.raiburari.domain.repository.Repository;
import org.addhen.smssync.domain.entity.WebServiceEntity;
import java.util.List;
import rx.Observable;

/**
 * isComment
 */
public interface isClassOrIsInterface extends Repository<WebServiceEntity> {

    /**
     * isComment
     */
    Observable<List<WebServiceEntity>> isMethod(WebServiceEntity.Status isParameter);

    /**
     * isComment
     */
    List<WebServiceEntity> isMethod(WebServiceEntity.Status isParameter);

    /**
     * isComment
     */
    Observable<Boolean> isMethod(WebServiceEntity isParameter);
}
