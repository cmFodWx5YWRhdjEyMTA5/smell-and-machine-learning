// isComment
package info.schnatterer.nusic.core.event;

import java.util.EventListener;

/**
 * isComment
 */
public interface isClassOrIsInterface<PROCESSED_ENTITY, RESULT_ENTITY> extends EventListener {

    void isMethod(int isParameter);

    /**
     * isComment
     */
    void isMethod(PROCESSED_ENTITY isParameter, int isParameter, int isParameter, Throwable isParameter);

    void isMethod(RESULT_ENTITY isParameter);

    /**
     * isComment
     */
    void isMethod(PROCESSED_ENTITY isParameter, int isParameter, int isParameter, RESULT_ENTITY isParameter, Throwable isParameter);
}
