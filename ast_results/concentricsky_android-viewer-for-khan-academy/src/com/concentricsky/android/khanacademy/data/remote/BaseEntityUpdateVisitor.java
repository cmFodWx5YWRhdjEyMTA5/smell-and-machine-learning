// isComment
package com.concentricsky.android.khanacademy.data.remote;

import com.concentricsky.android.khanacademy.data.db.EntityBase;
import com.concentricsky.android.khanacademy.data.db.Topic;
import com.concentricsky.android.khanacademy.data.db.Video;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends EntityBase> implements EntityVisitor {

    private T isVariable;

    public isConstructor(T isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(Topic isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Video isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(EntityBase.Impl isParameter) {
        isMethod(isNameExpr);
    }

    private void isMethod(EntityBase isParameter) {
        String isVariable = isNameExpr.isMethod();
        if (!isMethod(isNameExpr, String.class)) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod();
        if (!isMethod(isNameExpr, String.class)) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod();
        if (!isMethod(isNameExpr, String.class)) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod();
        if (!isMethod(isNameExpr, String.class)) {
            isNameExpr.isMethod(isNameExpr);
        }
        Topic isVariable = isNameExpr.isMethod();
        if (!isMethod(isNameExpr, Topic.class)) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    protected boolean isMethod(Object isParameter, Class<?> isParameter) {
        if (String.class.isMethod(isNameExpr)) {
            return null == isNameExpr || "isStringConstant".isMethod(isNameExpr);
        } else if (Integer.class.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr);
        } else if (Topic.class.isMethod(isNameExpr)) {
            return null == isNameExpr;
        }
        throw new UnsupportedOperationException(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod()));
    }
}
