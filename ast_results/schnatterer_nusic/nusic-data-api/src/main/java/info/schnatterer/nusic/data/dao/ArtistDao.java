// isComment
package info.schnatterer.nusic.data.dao;

import info.schnatterer.nusic.data.DatabaseException;
import info.schnatterer.nusic.data.model.Artist;

public interface isClassOrIsInterface extends GenericDao<Artist> {

    /**
     * isComment
     */
    Artist isMethod(long isParameter) throws DatabaseException;

    /**
     * isComment
     */
    Long isMethod(Long isParameter) throws DatabaseException;

    /**
     * isComment
     */
    void isMethod() throws DatabaseException;
}
