// isComment
package de.azapps.mirakel;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import de.azapps.mirakel.model.ModelTestSuite;
import de.azapps.mirakel.tw_sync.TaskwarriorTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ModelTestSuite.class, TaskwarriorTestSuite.class })
public class isClassOrIsInterface {
}
