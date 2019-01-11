// isComment
package com.android.setupwizardlib.items;

import android.content.Context;

/**
 * isComment
 */
public class isClassOrIsInterface extends GenericInflater<ItemHierarchy> {

    private static final String isVariable = "isStringConstant";

    public interface isClassOrIsInterface {

        void isMethod(ItemHierarchy isParameter);
    }

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isMethod(Item.class.isMethod().isMethod() + "isStringConstant");
    }

    @Override
    public ItemInflater isMethod(Context isParameter) {
        return new ItemInflater(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public Context isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(ItemHierarchy isParameter, ItemHierarchy isParameter) {
        if (isNameExpr instanceof ItemParent) {
            ((ItemParent) isNameExpr).isMethod(isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr);
        }
    }
}
