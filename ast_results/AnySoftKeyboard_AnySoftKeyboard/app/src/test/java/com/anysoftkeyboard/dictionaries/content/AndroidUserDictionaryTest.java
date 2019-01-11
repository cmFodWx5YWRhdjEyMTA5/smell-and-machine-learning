// isComment
package com.anysoftkeyboard.dictionaries.content;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.content.ContentValues;
import android.database.ContentObserver;
import android.provider.UserDictionary;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Shadows;
import org.robolectric.android.controller.ContentProviderController;
import org.robolectric.shadows.ShadowContentResolver;
import java.util.Collection;
import de.triplet.simpleprovider.AbstractProvider;
import de.triplet.simpleprovider.Column;
import de.triplet.simpleprovider.Table;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface {

    private AUDContentProvider isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new AUDContentProvider();
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant", isIntegerConstant, null);
    }

    @Test
    public void isMethod() throws Exception {
        AndroidUserDictionary isVariable = new AndroidUserDictionary(isMethod(), "isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        AndroidUserDictionary isVariable = new AndroidUserDictionary(isMethod(), null);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test(expected = RuntimeException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        AndroidUserDictionary isVariable = new AndroidUserDictionary(isMethod(), "isStringConstant");
        // isComment
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        AndroidUserDictionary isVariable = new AndroidUserDictionary(isMethod(), "isStringConstant");
        isNameExpr.isMethod();
        Collection<ContentObserver> isVariable = isNameExpr.isMethod(isMethod().isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod().isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
    }

    public static class isClassOrIsInterface extends AbstractProvider {

        @Override
        public String isMethod() {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
        }

        @Table
        public static class isClassOrIsInterface {

            @Column(value = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, primaryKey = true)
            public static final String isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;

            @Column(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            public static final String isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;

            @Column(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            public static final String isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;

            @Column(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
            public static final String isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }

        public void isMethod(int isParameter, String isParameter, int isParameter, String isParameter) {
            ContentValues isVariable = new ContentValues();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            if (isNameExpr == null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }
    }
}
