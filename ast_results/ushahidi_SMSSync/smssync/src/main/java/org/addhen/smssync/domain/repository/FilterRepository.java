// isComment
package org.addhen.smssync.domain.repository;

import com.addhen.android.raiburari.domain.repository.Repository;
import org.addhen.smssync.domain.entity.FilterEntity;
import java.util.List;
import rx.Observable;

/**
 * isComment
 */
public interface isClassOrIsInterface extends Repository<FilterEntity> {

    Observable<Integer> isMethod();

    Observable<Integer> isMethod();

    Observable<List<FilterEntity>> isMethod(FilterEntity.Status isParameter);
}
