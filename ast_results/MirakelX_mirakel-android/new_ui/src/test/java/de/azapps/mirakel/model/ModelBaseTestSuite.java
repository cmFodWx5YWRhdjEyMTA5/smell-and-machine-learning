// isComment
package de.azapps.mirakel.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import de.azapps.mirakel.model.account.AccountBaseTest;
import de.azapps.mirakel.model.file.FileBaseTest;
import de.azapps.mirakel.model.list.ListBaseTest;
import de.azapps.mirakel.model.recurring.RecurringBaseTest;
import de.azapps.mirakel.model.semantic.SemanticBaseTest;
import de.azapps.mirakel.model.tags.TagBaseTest;
import de.azapps.mirakel.model.task.TaskBaseTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AccountBaseTest.class, FileBaseTest.class, ListBaseTest.class, RecurringBaseTest.class, SemanticBaseTest.class, TagBaseTest.class, TaskBaseTest.class })
public class isClassOrIsInterface {
}
