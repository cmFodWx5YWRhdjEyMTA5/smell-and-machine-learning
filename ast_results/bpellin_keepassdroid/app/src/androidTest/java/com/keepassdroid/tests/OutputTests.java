// isComment
package com.keepassdroid.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import android.test.suitebuilder.TestSuiteBuilder;

public class isClassOrIsInterface extends TestSuite {

    public static Test isMethod() {
        return new TestSuiteBuilder(AllTests.class).isMethod("isStringConstant").isMethod();
    }
}
