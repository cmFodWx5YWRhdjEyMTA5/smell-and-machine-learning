// isComment
package info.schnatterer.nusic.data.dao;

import info.schnatterer.nusic.data.DatabaseException;
import info.schnatterer.nusic.data.model.Entity;
import java.util.Map;

public interface isClassOrIsInterface<T extends Entity> {

    /**
     * isComment
     */
    long isMethod(T isParameter) throws DatabaseException;

    /**
     * isComment
     */
    int isMethod(T isParameter) throws DatabaseException;

    /**
     * isComment
     */
    int isMethod(Map<String, Object> isParameter, String isParameter, String[] isParameter) throws DatabaseException;
}
