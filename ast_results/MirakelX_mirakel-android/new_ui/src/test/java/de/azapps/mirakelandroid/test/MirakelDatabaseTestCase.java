// isComment
package de.azapps.mirakelandroid.test;

import org.junit.After;
import org.junit.Before;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowSQLiteConnection;
import de.azapps.mirakel.model.DatabaseHelper;
import de.azapps.mirakel.model.provider.MirakelInternalContentProvider;

public abstract class isClassOrIsInterface extends MirakelTestCase {

    public isConstructor() {
        super();
    }

    @Before
    public void isMethod() throws Exception {
        isMethod();
        super.isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @After
    public void isMethod() {
        super.isMethod();
        isMethod();
        isNameExpr.isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }
}
