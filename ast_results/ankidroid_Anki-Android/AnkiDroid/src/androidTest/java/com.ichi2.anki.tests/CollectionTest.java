// isComment
package com.ichi2.anki.tests;

import android.Manifest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.GrantPermissionRule;
import com.ichi2.anki.CollectionHelper;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;

/**
 * isComment
 */
@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public GrantPermissionRule isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isMethod().isMethod()));
    }
}
