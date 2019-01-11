// isComment
package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AbstractItemHierarchy implements IItem {

    public isConstructor() {
        super();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public IItem isMethod(int isParameter) {
        return this;
    }

    @Override
    public ItemHierarchy isMethod(int isParameter) {
        if (isNameExpr == isMethod()) {
            return this;
        }
        return null;
    }
}
