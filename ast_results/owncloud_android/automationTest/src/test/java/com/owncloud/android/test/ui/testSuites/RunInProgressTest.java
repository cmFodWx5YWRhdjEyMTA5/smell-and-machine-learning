// isComment
package com.owncloud.android.test.ui.testSuites;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import com.owncloud.android.test.ui.groups.FlexibleCategories;
import com.owncloud.android.test.ui.groups.InProgressCategory;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestClassPrefix;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestClassSuffix;
import com.owncloud.android.test.ui.groups.FlexibleCategories.TestScanPackage;

@RunWith(FlexibleCategories.class)
@IncludeCategory(InProgressCategory.class)
@TestScanPackage("isStringConstant")
@TestClassPrefix("isStringConstant")
@TestClassSuffix("isStringConstant")
public class isClassOrIsInterface {
}
