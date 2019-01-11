// isComment
package com.owncloud.android.test.ui.testSuites;

import static org.junit.Assert.*;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.owncloud.android.test.ui.actions.Actions;
import com.owncloud.android.test.ui.groups.UnfinishedTestCategory;
import com.owncloud.android.test.ui.models.FileListView;

@FixMethodOrder(isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    AndroidDriver isVariable;

    Common isVariable;

    @Rule
    public TestName isVariable = new TestName();

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new Common();
        isNameExpr = isNameExpr.isMethod();
    }

    @Test
    @Category({ UnfinishedTestCategory.class })
    public void isMethod() throws Exception {
        FileListView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod();
        // isComment
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod());
    // isComment
    }

    @After
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
    }
}
