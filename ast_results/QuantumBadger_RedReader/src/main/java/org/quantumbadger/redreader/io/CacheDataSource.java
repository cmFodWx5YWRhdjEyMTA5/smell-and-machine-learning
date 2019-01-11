// isComment
package org.quantumbadger.redreader.io;

import org.quantumbadger.redreader.common.TimestampBound;
import java.util.Collection;
import java.util.HashMap;

public interface isClassOrIsInterface<K, V, F> {

    void isMethod(K isParameter, final TimestampBound isParameter, RequestResponseHandler<V, F> isParameter);

    void isMethod(Collection<K> isParameter, final TimestampBound isParameter, RequestResponseHandler<HashMap<K, V>, F> isParameter);

    void isMethod(V isParameter);

    void isMethod(Collection<V> isParameter);
}
