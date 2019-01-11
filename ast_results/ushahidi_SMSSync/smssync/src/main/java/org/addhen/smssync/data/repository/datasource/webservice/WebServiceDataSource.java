// isComment
package org.addhen.smssync.data.repository.datasource.webservice;

import org.addhen.smssync.data.entity.SyncUrl;
import java.util.List;
import rx.Observable;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    Observable<List<SyncUrl>> isMethod();

    /**
     * isComment
     */
    Observable<SyncUrl> isMethod(Long isParameter);

    /**
     * isComment
     */
    Observable<List<SyncUrl>> isMethod(SyncUrl.Status isParameter);

    /**
     * isComment
     */
    List<SyncUrl> isMethod(SyncUrl.Status isParameter);

    /**
     * isComment
     */
    Observable<Long> isMethod(SyncUrl isParameter);

    /**
     * isComment
     */
    Observable<Long> isMethod(SyncUrl isParameter);

    /**
     * isComment
     */
    Observable<Long> isMethod(Long isParameter);

    List<SyncUrl> isMethod(final SyncUrl.Status isParameter);

    List<SyncUrl> isMethod();
}
