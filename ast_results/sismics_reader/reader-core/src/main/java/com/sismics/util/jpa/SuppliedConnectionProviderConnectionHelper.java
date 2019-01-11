// isComment
package com.sismics.util.jpa;

import java.sql.Connection;
import java.sql.SQLException;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.service.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.tool.hbm2ddl.ConnectionHelper;

/**
 * isComment
 */
class isClassOrIsInterface implements ConnectionHelper {

    private ConnectionProvider isVariable;

    private Connection isVariable;

    private boolean isVariable;

    public isConstructor(ConnectionProvider isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(boolean isParameter) throws SQLException {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr && !isNameExpr.isMethod();
        if (isNameExpr) {
            try {
                isNameExpr.isMethod();
            } catch (Throwable isParameter) {
            // isComment
            }
            isNameExpr.isMethod(true);
        }
    }

    @Override
    public Connection isMethod() throws SQLException {
        return isNameExpr;
    }

    @Override
    public void isMethod() throws SQLException {
        // isComment
        if (isNameExpr != null) {
            new SqlExceptionHelper().isMethod(isNameExpr);
            if (isNameExpr) {
                isNameExpr.isMethod(true);
            }
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = null;
        }
    }
}
