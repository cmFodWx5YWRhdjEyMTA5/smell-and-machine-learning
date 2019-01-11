// isComment
package com.android.setupwizardlib.test;

import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import com.android.setupwizardlib.items.Item;
import com.android.setupwizardlib.items.ItemGroup;
import com.android.setupwizardlib.items.ItemHierarchy;
import com.android.setupwizardlib.items.ItemInflater;

public class isClassOrIsInterface extends InstrumentationTestCase {

    @SmallTest
    public void isMethod() {
        ItemInflater isVariable = new ItemInflater(isMethod().isMethod());
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod());
    }

    @SmallTest
    public void isMethod() {
        ItemInflater isVariable = new ItemInflater(isMethod().isMethod());
        ItemHierarchy isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr instanceof ItemGroup);
        ItemGroup isVariable = (ItemGroup) isNameExpr;
        Item isVariable = (Item) isNameExpr.isMethod(isIntegerConstant);
        Item isVariable = (Item) isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod());
    }
}
