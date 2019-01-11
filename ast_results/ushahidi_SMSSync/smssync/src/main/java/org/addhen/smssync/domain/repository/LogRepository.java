// isComment
package org.addhen.smssync.domain.repository;

import org.addhen.smssync.domain.entity.LogEntity;
import java.util.List;
import rx.Observable;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    Observable<List<LogEntity>> isMethod();

    Observable<Long> isMethod(LogEntity isParameter);

    Observable<Long> isMethod();

    Observable<LogEntity> isMethod();
}
