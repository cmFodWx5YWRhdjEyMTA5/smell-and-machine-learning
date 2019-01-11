// isComment
package com.android.setupwizardlib.test;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.test.InstrumentationTestCase;
import android.test.mock.MockPackageManager;
import android.test.mock.MockResources;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.SparseArray;
import com.android.setupwizardlib.util.Partner;
import com.android.setupwizardlib.util.Partner.ResourceEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class isClassOrIsInterface extends InstrumentationTestCase {

    private TestContext isVariable;

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = new TestContext(isMethod().isMethod());
        isNameExpr.isMethod();
    }

    @SmallTest
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isMethod("isStringConstant", true), isMethod("isStringConstant", true));
        Partner isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @SmallTest
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = new ArrayList<>();
        Partner isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @SmallTest
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isMethod("isStringConstant", true), isMethod("isStringConstant", true));
        Partner isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @SmallTest
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isMethod("isStringConstant", true), isMethod("isStringConstant", true));
        ResourceEntry isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        int isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @SmallTest
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isMethod("isStringConstant", true), isMethod("isStringConstant", true));
        ResourceEntry isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        int isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    private ResolveInfo isMethod(String isParameter, boolean isParameter) {
        ResolveInfo isVariable = new ResolveInfo();
        isNameExpr.isFieldAccessExpr = isNameExpr;
        ActivityInfo isVariable = new ActivityInfo();
        ApplicationInfo isVariable = new ApplicationInfo();
        isNameExpr.isFieldAccessExpr = isNameExpr ? isNameExpr.isFieldAccessExpr : isIntegerConstant;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        return isNameExpr;
    }

    private static class isClassOrIsInterface extends MockResources {

        private static final Map<String, Integer> isVariable = new HashMap<>();

        private static final SparseArray<Object> isVariable = new SparseArray<>();

        private static void isMethod(String isParameter, int isParameter, Object isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }

        static {
            isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
        }

        @Override
        public int isMethod(String isParameter, String isParameter, String isParameter) {
            String isVariable = isNameExpr + "isStringConstant" + isNameExpr;
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod(isNameExpr);
            }
            return isIntegerConstant;
        }

        @Override
        public int isMethod(int isParameter) throws NotFoundException {
            if (isNameExpr.isMethod(isNameExpr) >= isIntegerConstant) {
                return (int) isNameExpr.isMethod(isNameExpr);
            } else {
                throw new NotFoundException();
            }
        }

        @Override
        public int isMethod(int isParameter) throws NotFoundException {
            if (isNameExpr.isMethod(isNameExpr) >= isIntegerConstant) {
                return (int) isNameExpr.isMethod(isNameExpr);
            } else {
                throw new NotFoundException();
            }
        }
    }

    private static class isClassOrIsInterface extends MockPackageManager {

        private Context isVariable;

        private Resources isVariable;

        public isConstructor(Context isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = new TestResources();
        }

        @Override
        public Resources isMethod(ApplicationInfo isParameter) {
            if (isNameExpr != null && "isStringConstant".isMethod(isNameExpr.isFieldAccessExpr)) {
                return isNameExpr;
            } else {
                return super.isMethod(isNameExpr);
            }
        }

        @Override
        public List<ResolveInfo> isMethod(Intent isParameter, int isParameter) {
            if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
                return ((TestContext) isNameExpr).isFieldAccessExpr;
            } else {
                return super.isMethod(isNameExpr, isNameExpr);
            }
        }
    }

    private static class isClassOrIsInterface extends ContextWrapper {

        public List<ResolveInfo> isVariable;

        public isConstructor(Context isParameter) {
            super(isNameExpr);
        }

        @Override
        public PackageManager isMethod() {
            return new TestPackageManager(this);
        }
    }
}
