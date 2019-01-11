// isComment
package net.grandcentrix.tray.core;

import junit.framework.Assert;
import junit.framework.TestCase;
import net.grandcentrix.tray.mock.MockTrayStorage;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;
import android.annotation.SuppressLint;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class isClassOrIsInterface extends TestCase {

    @SuppressLint("isStringConstant")
    @SuppressWarnings({ "isStringConstant", "isStringConstant", "isStringConstant" })
    public void isMethod() throws Exception {
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(isDoubleConstant));
        isMethod(isNameExpr.isMethod(isStringConstant));
        isMethod(isNameExpr.isMethod(true));
        isMethod(isNameExpr.isMethod(new String("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Integer(isIntegerConstant)));
        isMethod(isNameExpr.isMethod(new Float(isDoubleConstant)));
        isMethod(isNameExpr.isMethod(new Long(isStringConstant)));
        isMethod(isNameExpr.isMethod(new Boolean(true)));
        isMethod(isNameExpr.isMethod(null));
        // isComment
        isMethod(isNameExpr.isMethod(new Object()));
        isMethod(isNameExpr.isMethod(new Date()));
        isMethod(isNameExpr.isMethod(isDoubleConstant));
        isMethod(isNameExpr.isMethod(new Double(isDoubleConstant)));
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod().isMethod(), isIntegerConstant);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isIntegerConstant);
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    public void isMethod() throws Exception {
        final TrayStorage isVariable = new MockTrayStorage("isStringConstant") {

            @Override
            public boolean isMethod() {
                return true;
            }
        };
        final MockSimplePreferences isVariable = new MockSimplePreferences(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod().isMethod(), isIntegerConstant);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isIntegerConstant);
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        final Collection<TrayItem> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        final Collection<TrayItem> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        final TrayItem isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        final HashMap<String, String> isVariable = new HashMap<>();
        new MockSimplePreferences(isIntegerConstant) {

            @Override
            protected void isMethod(final int isParameter) {
                super.isMethod(isNameExpr);
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            }
        };
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    public void isMethod() throws Exception {
        int isVariable = isIntegerConstant;
        try {
            new MockSimplePreferences(isNameExpr);
            isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr)));
        }
        isNameExpr = -isIntegerConstant;
        try {
            new MockSimplePreferences(isNameExpr);
            isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr)));
        }
    }

    public void isMethod() throws Exception {
        final MockTrayStorage isVariable = new MockTrayStorage("isStringConstant");
        new MockSimplePreferences(isNameExpr, isIntegerConstant);
        try {
            new MockSimplePreferences(isNameExpr, isIntegerConstant);
            isMethod();
        } catch (IllegalStateException isParameter) {
            isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
        }
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        try {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
            isMethod();
        } catch (IllegalStateException isParameter) {
        // isComment
        }
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", isStringConstant));
        isMethod(isStringConstant, isNameExpr.isMethod("isStringConstant", isStringConstant));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", isDoubleConstant));
        isMethod(isDoubleConstant, isNameExpr.isMethod("isStringConstant", isDoubleConstant));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", true));
        isMethod(true, isNameExpr.isMethod("isStringConstant", true));
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", isStringConstant));
        isMethod(isStringConstant, isNameExpr.isMethod("isStringConstant", isStringConstant));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", isDoubleConstant));
        isMethod(isDoubleConstant, isNameExpr.isMethod("isStringConstant", isDoubleConstant));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant", true));
        isMethod(true, isNameExpr.isMethod("isStringConstant", true));
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        final Collection<TrayItem> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod("isStringConstant"));
        final Collection<TrayItem> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod("isStringConstant"));
        final Collection<TrayItem> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant"));
        // isComment
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    public void isMethod() throws Exception {
        final HashMap<String, String> isVariable = new HashMap<>();
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant) {

            @Override
            protected void isMethod(final int isParameter) {
                super.isMethod(isNameExpr);
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            }

            @Override
            protected void isMethod(final int isParameter, final int isParameter) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            }

            @Override
            protected void isMethod(final int isParameter, final int isParameter) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant");
            }
        };
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod();
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    public void isMethod() throws Exception {
        final TrayStorage isVariable = isNameExpr.isMethod(TrayStorage.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(new TrayException("isStringConstant"));
        final MockSimplePreferences isVariable = new MockSimplePreferences(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod());
        isMethod((Boolean) isNameExpr.isMethod(isNameExpr, "isStringConstant"));
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        final TrayStorage isVariable = isNameExpr.isMethod(TrayStorage.class);
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(true);
        final MockSimplePreferences isVariable = new MockSimplePreferences(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod());
    }

    public void isMethod() throws Exception {
        final MockSimplePreferences isVariable = new MockSimplePreferences(isIntegerConstant);
        try {
            isNameExpr.isMethod("isStringConstant", "isStringConstant");
            isNameExpr.isMethod();
        } catch (IllegalArgumentException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }
}
