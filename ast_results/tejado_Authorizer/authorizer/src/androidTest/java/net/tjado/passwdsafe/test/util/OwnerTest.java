// isComment
package net.tjado.passwdsafe.test.util;

import org.junit.Before;
import org.junit.Test;
import org.pwsafe.lib.file.Owner;
import java.io.Closeable;
import java.io.IOException;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertSame;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private Item isVariable;

    private Owner<Item> isVariable;

    public static class isClassOrIsInterface implements Closeable {

        public int isVariable = isIntegerConstant;

        @Override
        public void isMethod() throws IOException {
            if (isNameExpr != isIntegerConstant) {
                throw new IOException("isStringConstant");
            }
            ++isNameExpr;
        }
    }

    @Before
    public void isMethod() {
        isNameExpr = new Item();
        isNameExpr = new Owner<>(isNameExpr);
        isMethod();
    }

    @Test
    public void isMethod() {
        try {
            isMethod();
        } finally {
            isMethod();
        }
    }

    @Test
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod();
        isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod();
        isMethod();
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    private void isMethod() {
        isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    private void isMethod(@SuppressWarnings("isStringConstant") Owner<Item>.Param isParameter) {
        isMethod();
    }

    private void isMethod(Owner<Item>.Param isParameter) {
        Owner<Item> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
        isMethod();
        isNameExpr.isMethod();
        isMethod();
    }
}
