// isComment
package com.sismics.reader.core.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import com.sismics.reader.core.constant.ConfigType;
import com.sismics.reader.core.model.jpa.Config;
import com.sismics.util.context.ThreadLocalContext;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public Config isMethod(ConfigType isParameter) {
        EntityManager isVariable = isNameExpr.isMethod().isMethod();
        // isComment
        if (isNameExpr == null) {
            return null;
        }
        try {
            return isNameExpr.isMethod(Config.class, isNameExpr);
        } catch (NoResultException isParameter) {
            return null;
        }
    }
}
