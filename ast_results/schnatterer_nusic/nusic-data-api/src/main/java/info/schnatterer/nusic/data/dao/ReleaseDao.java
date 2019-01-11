// isComment
package info.schnatterer.nusic.data.dao;

import info.schnatterer.nusic.data.DatabaseException;
import info.schnatterer.nusic.data.model.Release;
import java.util.List;

public interface isClassOrIsInterface extends GenericDao<Release> {

    /**
     * isComment
     */
    Release isMethod(String isParameter) throws DatabaseException;

    /**
     * isComment
     */
    List<Release> isMethod(long isParameter) throws DatabaseException;

    /**
     * isComment
     */
    List<Release> isMethod(long isParameter) throws DatabaseException;

    /**
     * isComment
     */
    List<Release> isMethod(long isParameter) throws DatabaseException;

    /**
     * isComment
     */
    List<Release> isMethod(long isParameter, long isParameter) throws DatabaseException;

    /**
     * isComment
     */
    void isMethod() throws DatabaseException;
}
