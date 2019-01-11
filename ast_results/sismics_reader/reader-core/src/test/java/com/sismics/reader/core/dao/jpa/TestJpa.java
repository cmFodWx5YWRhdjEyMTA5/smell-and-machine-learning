// isComment
package com.sismics.reader.core.dao.jpa;

import com.sismics.reader.BaseTransactionalTest;
import com.sismics.reader.core.model.jpa.User;
import com.sismics.reader.core.util.TransactionUtil;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseTransactionalTest {

    @Test
    public void isMethod() throws Exception {
        // isComment
        UserDao isVariable = new UserDao();
        User isVariable = new User();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
