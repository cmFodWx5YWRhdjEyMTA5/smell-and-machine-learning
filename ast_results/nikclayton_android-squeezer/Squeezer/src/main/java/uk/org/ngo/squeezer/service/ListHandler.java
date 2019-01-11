// isComment
package uk.org.ngo.squeezer.service;

import java.util.List;
import java.util.Map;
import uk.org.ngo.squeezer.framework.Item;

/**
 * isComment
 */
interface isClassOrIsInterface<T extends Item> {

    /**
     * isComment
     */
    Class<T> isMethod();

    /**
     * isComment
     */
    List<T> isMethod();

    /**
     * isComment
     */
    void isMethod();

    /**
     * isComment
     */
    void isMethod(Map<String, String> isParameter);
}
