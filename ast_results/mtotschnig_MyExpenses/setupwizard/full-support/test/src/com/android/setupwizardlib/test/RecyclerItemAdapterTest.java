// isComment
package com.android.setupwizardlib.test;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import com.android.setupwizardlib.items.Item;
import com.android.setupwizardlib.items.ItemGroup;
import com.android.setupwizardlib.items.ItemHierarchy;
import com.android.setupwizardlib.items.RecyclerItemAdapter;
import java.util.Arrays;
import java.util.HashSet;

public class isClassOrIsInterface extends AndroidTestCase {

    private Item[] isVariable = new Item[isIntegerConstant];

    private ItemGroup isVariable = new ItemGroup();

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            Item isVariable = new Item();
            isNameExpr.isMethod("isStringConstant" + isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            // isComment
            // isComment
            isNameExpr.isMethod((isNameExpr % isIntegerConstant) * isIntegerConstant + isIntegerConstant);
            isNameExpr[isNameExpr] = isNameExpr;
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @SmallTest
    public void isMethod() {
        RecyclerItemAdapter isVariable = new RecyclerItemAdapter(isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr[isIntegerConstant], isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isIntegerConstant));
        // isComment
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isIntegerConstant));
    }

    @SmallTest
    public void isMethod() {
        RecyclerItemAdapter isVariable = new RecyclerItemAdapter(isNameExpr);
        ItemHierarchy isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr, isNameExpr);
    }
}
