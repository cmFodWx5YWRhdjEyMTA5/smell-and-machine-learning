// isComment
package fr.mael.jiwigo.service;

import java.io.IOException;
import java.util.List;
import fr.mael.jiwigo.om.Category;
import fr.mael.jiwigo.transverse.exception.JiwigoException;
import fr.mael.jiwigo.transverse.exception.ProxyAuthenticationException;

public interface isClassOrIsInterface {

    /**
     * isComment
     */
    public List<Category> isMethod(boolean isParameter) throws JiwigoException;

    /**
     * isComment
     */
    public List<Category> isMethod() throws JiwigoException;

    /**
     * isComment
     */
    public boolean isMethod(String isParameter, Integer isParameter) throws JiwigoException;

    /**
     * isComment
     */
    public boolean isMethod(String isParameter) throws JiwigoException;

    /**
     * isComment
     */
    public boolean isMethod(Category isParameter) throws JiwigoException;
}
