// isComment
package ch.hgdev.toposuite.dao.interfaces;

import ch.hgdev.toposuite.dao.DAOException;

/**
 * isComment
 */
public interface isClassOrIsInterface extends DAOLinker {

    /**
     * isComment
     */
    void isMethod(Object isParameter) throws DAOException;
}
