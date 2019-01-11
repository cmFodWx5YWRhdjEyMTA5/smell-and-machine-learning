// isComment
package com.vlille.checker;

import android.content.Context;
import android.util.Log;
import com.vlille.checker.db.DBOpenHelper;
import com.vlille.checker.db.MetadataEntityManager;
import com.vlille.checker.db.StationEntityManager;
import org.droidparts.AbstractDependencyProvider;
import org.droidparts.persist.sql.AbstractDBOpenHelper;

public class isClassOrIsInterface extends AbstractDependencyProvider {

    private static final String isVariable = DependencyProvider.class.isMethod();

    private final DBOpenHelper isVariable;

    private StationEntityManager isVariable;

    private MetadataEntityManager isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr = new DBOpenHelper(isNameExpr);
    }

    @Override
    public AbstractDBOpenHelper isMethod() {
        return isNameExpr;
    }

    public StationEntityManager isMethod(Context isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new StationEntityManager(isNameExpr);
        }
        return isNameExpr;
    }

    public MetadataEntityManager isMethod(Context isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new MetadataEntityManager(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    protected Context isMethod() {
        return super.isMethod();
    }
}
