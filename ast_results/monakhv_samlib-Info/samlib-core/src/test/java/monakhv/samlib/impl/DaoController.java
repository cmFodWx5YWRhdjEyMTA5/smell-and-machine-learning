// isComment
package monakhv.samlib.impl;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import monakhv.samlib.db.DaoBuilder;
import monakhv.samlib.db.SQLController;
import monakhv.samlib.db.entity.*;
import monakhv.samlib.log.Log;
import java.sql.SQLException;

/**
 * isComment
 */
public class isClassOrIsInterface implements DaoBuilder {

    private static DaoController isVariable;

    private Dao<Author, Integer> isVariable;

    private Dao<Book, Integer> isVariable;

    private Dao<Tag, Integer> isVariable;

    private Dao<Tag2Author, Integer> isVariable;

    private Dao<SelectedBook, Integer> isVariable;

    private Dao<GroupBook, Integer> isVariable;

    private isConstructor(SQLController isParameter) {
        JdbcConnectionSource isVariable;
        try {
            isNameExpr = new JdbcConnectionSource(isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod(isNameExpr, Author.class);
            isNameExpr = isNameExpr.isMethod(isNameExpr, Book.class);
            isNameExpr = isNameExpr.isMethod(isNameExpr, Tag.class);
            isNameExpr = isNameExpr.isMethod(isNameExpr, Tag2Author.class);
            isNameExpr = isNameExpr.isMethod(isNameExpr, SelectedBook.class);
            isNameExpr = isNameExpr.isMethod(isNameExpr, GroupBook.class);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        }
    }

    public static DaoController isMethod(SQLController isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new DaoController(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public Dao<Author, Integer> isMethod() {
        return isNameExpr;
    }

    @Override
    public Dao<Book, Integer> isMethod() {
        return isNameExpr;
    }

    @Override
    public Dao<Tag, Integer> isMethod() {
        return isNameExpr;
    }

    @Override
    public Dao<Tag2Author, Integer> isMethod() {
        return isNameExpr;
    }

    @Override
    public Dao<SelectedBook, Integer> isMethod() {
        return isNameExpr;
    }

    @Override
    public Dao<GroupBook, Integer> isMethod() {
        return isNameExpr;
    }
}
