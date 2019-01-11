// isComment
package fr.mael.jiwigo.service;

import java.util.List;
import fr.mael.jiwigo.om.Image;
import fr.mael.jiwigo.om.Tag;
import fr.mael.jiwigo.transverse.exception.JiwigoException;

public interface isClassOrIsInterface {

    /**
     * isComment
     */
    public List<Tag> isMethod() throws JiwigoException;

    /**
     * isComment
     */
    public boolean isMethod(String isParameter) throws JiwigoException;

    /**
     * isComment
     */
    public List<Tag> isMethod(Image isParameter) throws JiwigoException;
}
