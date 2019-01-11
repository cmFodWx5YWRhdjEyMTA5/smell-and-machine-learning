// isComment
package net.dahanne.android.regalandroid.its;

import junit.framework.Test;
import junit.framework.TestSuite;
import android.test.suitebuilder.TestSuiteBuilder;

/**
 * isComment
 */
public class isClassOrIsInterface extends TestSuite {

    public static Test isMethod() {
        return new TestSuiteBuilder(AllTests.class).isMethod().isMethod();
    }
}
