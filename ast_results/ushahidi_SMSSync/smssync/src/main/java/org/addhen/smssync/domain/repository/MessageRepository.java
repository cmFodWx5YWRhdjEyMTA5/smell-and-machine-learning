// isComment
package org.addhen.smssync.domain.repository;

import com.addhen.android.raiburari.domain.repository.Repository;
import org.addhen.smssync.domain.entity.MessageEntity;
import java.util.List;
import rx.Observable;

/**
 * isComment
 */
public interface isClassOrIsInterface extends Repository<MessageEntity> {

    Observable<Integer> isMethod(String isParameter);

    Observable<Integer> isMethod();

    Observable<List<MessageEntity>> isMethod(MessageEntity.Type isParameter);

    Observable<List<MessageEntity>> isMethod(MessageEntity.Status isParameter);

    Observable<List<MessageEntity>> isMethod();

    Observable<Boolean> isMethod(MessageEntity isParameter);

    Observable<Boolean> isMethod();

    Observable<List<MessageEntity>> isMethod();

    MessageEntity isMethod(String isParameter);

    List<MessageEntity> isMethod();
}
