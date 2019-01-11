// isComment
package fr.mael.jiwigo.service;

import java.util.Date;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import fr.mael.jiwigo.dao.impl.CategoryDaoImpl;
import fr.mael.jiwigo.service.impl.CategoryServiceImpl;
import fr.mael.jiwigo.transverse.exception.JiwigoException;
import fr.mael.jiwigo.transverse.exception.ProxyAuthenticationException;
import fr.mael.jiwigo.transverse.session.SessionManager;
import fr.mael.jiwigo.transverse.session.impl.SessionManagerImpl;

@Ignore
public class isClassOrIsInterface {

    private SessionManager isVariable;

    @Before
    public void isMethod() throws JiwigoException {
        isNameExpr = new SessionManagerImpl("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws JiwigoException {
        CategoryDaoImpl isVariable = new CategoryDaoImpl();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws JiwigoException {
        Date isVariable = new Date();
        CategoryServiceImpl isVariable = new CategoryServiceImpl();
        CategoryDaoImpl isVariable = new CategoryDaoImpl();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod()));
    }
}
