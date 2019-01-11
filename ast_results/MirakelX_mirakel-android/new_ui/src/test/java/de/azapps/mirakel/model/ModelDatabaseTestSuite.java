// isComment
package de.azapps.mirakel.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import de.azapps.mirakel.model.account.AccountMirakelTest;
import de.azapps.mirakel.model.file.FileMirakelTest;
import de.azapps.mirakel.model.list.ListMirakelTest;
import de.azapps.mirakel.model.recurring.RecurringTest;
import de.azapps.mirakel.model.semantic.SemanticTest;
import de.azapps.mirakel.model.tags.TagTest;
import de.azapps.mirakel.model.task.TaskTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AccountMirakelTest.class, FileMirakelTest.class, ListMirakelTest.class, RecurringTest.class, SemanticTest.class, TagTest.class, TaskTest.class })
public class isClassOrIsInterface {
}
