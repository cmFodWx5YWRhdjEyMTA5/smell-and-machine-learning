// isComment
package com.owncloud.android.test.ui.testSuites;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import com.owncloud.android.test.ui.groups.FailingTestCategory;
import com.owncloud.android.test.ui.groups.FlexibleCategories;
import com.owncloud.android.test.ui.groups.NoIgnoreTestCategory;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestClassPrefix;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestClassSuffix;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestScanPackage;

@RunWith(FlexibleCategories.class)
@ExcludeCategory(NoIgnoreTestCategory.class)
@IncludeCategory(FailingTestCategory.class)
@TestScanPackage("isStringConstant")
@TestClassPrefix("isStringConstant")
@TestClassSuffix("isStringConstant")
public class isClassOrIsInterface {
}
