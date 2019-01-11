// isComment
package com.sismics.util.jpa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.hibernate.cfg.Environment;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.internal.StandardServiceRegistryImpl;
import org.hibernate.service.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.tool.hbm2ddl.ConnectionHelper;

/**
 * isComment
 */
class isClassOrIsInterface implements ConnectionHelper {

    private Properties isVariable;

    private StandardServiceRegistryImpl isVariable;

    private Connection isVariable;

    public isConstructor(Properties isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(boolean isParameter) throws SQLException {
        isNameExpr = isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(ConnectionProvider.class).isMethod();
        if (isNameExpr && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
            isNameExpr.isMethod(true);
        }
    }

    private static StandardServiceRegistryImpl isMethod(Properties isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return (StandardServiceRegistryImpl) new ServiceRegistryBuilder().isMethod(isNameExpr).isMethod();
    }

    @Override
    public Connection isMethod() throws SQLException {
        return isNameExpr;
    }

    @Override
    public void isMethod() throws SQLException {
        try {
            isMethod();
        } finally {
            isMethod();
        }
    }

    private void isMethod() throws SQLException {
        if (isNameExpr != null) {
            try {
                new SqlExceptionHelper().isMethod(isNameExpr);
            } finally {
                try {
                    isNameExpr.isMethod(ConnectionProvider.class).isMethod(isNameExpr);
                } finally {
                    isNameExpr = null;
                }
            }
        }
    }

    private void isMethod() {
        if (isNameExpr != null) {
            try {
                isNameExpr.isMethod();
            } finally {
                isNameExpr = null;
            }
        }
    }
}
