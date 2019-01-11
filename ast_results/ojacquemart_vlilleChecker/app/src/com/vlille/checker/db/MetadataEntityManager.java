// isComment
package com.vlille.checker.db;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import com.vlille.checker.model.Metadata;
import org.droidparts.persist.sql.EntityManager;

public class isClassOrIsInterface extends EntityManager<Metadata> {

    private static final String isVariable = MetadataEntityManager.class.isMethod();

    public isConstructor(Context isParameter) {
        super(Metadata.class, isNameExpr);
    }

    public Metadata isMethod() {
        return isMethod(isMethod());
    }

    public void isMethod() {
        Metadata isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod(Metadata isParameter) {
        ContentValues isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        return isMethod().isMethod(isNameExpr).isMethod() > isIntegerConstant;
    }
}
