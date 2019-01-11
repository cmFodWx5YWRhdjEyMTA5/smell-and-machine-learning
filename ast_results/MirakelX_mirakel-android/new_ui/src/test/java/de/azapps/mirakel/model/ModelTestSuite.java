// isComment
package de.azapps.mirakel.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import de.azapps.mirakel.model.list.meta.SpecialListConditionTest;
import de.azapps.mirakel.model.query_builder.QueryBuilderTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ParceableTest.class, QueryBuilderTest.class, SpecialListConditionTest.class, ModelBaseTestSuite.class, ModelDatabaseTestSuite.class })
public class isClassOrIsInterface {
}
