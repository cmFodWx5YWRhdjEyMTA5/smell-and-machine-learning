// isComment
package uk.org.ngo.squeezer.itemlist;

import java.util.List;
import java.util.Map;
import uk.org.ngo.squeezer.framework.Item;
import uk.org.ngo.squeezer.service.ServiceCallback;

public interface isClassOrIsInterface<T extends Item> extends ServiceCallback {

    void isMethod(int isParameter, int isParameter, Map<String, String> isParameter, List<T> isParameter, Class<T> isParameter);
}
