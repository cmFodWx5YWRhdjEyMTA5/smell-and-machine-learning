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
import com.owncloud.android.test.ui.groups.NoIgnoreTestCategory;
import com.owncloud.android.test.ui.groups.SmokeTestCategory;
import com.owncloud.android.test.ui.models.FileListView;
import com.owncloud.android.test.ui.models.WaitAMomentPopUp;

@FixMethodOrder(isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    AndroidDriver isVariable;

    Common isVariable;

    private Boolean isVariable = true;

    private final String isVariable = "isStringConstant";

    private String isVariable = "isStringConstant";

    @Rule
    public TestName isVariable = new TestName();

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new Common();
        isNameExpr = isNameExpr.isMethod();
    }

    @Test
    @Category({ NoIgnoreTestCategory.class, SmokeTestCategory.class })
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        FileListView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        WaitAMomentPopUp isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr = isNameExpr.isMethod().isMethod());
        isNameExpr = isNameExpr;
        isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
    }

    @After
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr) {
            FileListView isVariable = new FileListView(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
    }
}
