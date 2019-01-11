// isComment
package com.madgag.agit;

import static com.madgag.agit.RDTypeListActivity.listIntent;
import static com.madgag.agit.matchers.CharSequenceMatcher.charSequence;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.madgag.agit.git.model.RDTTag;
import com.madgag.agit.git.model.RDTTag.TagSummary;
import com.madgag.agit.matchers.GitTestHelper;
import java.util.List;
import org.eclipse.jgit.lib.Repository;

public class isClassOrIsInterface extends RDTTypeListActivityStoryTestBase<RDTypeListActivity> {

    private static final String isVariable = RDTTagListActivityStoryTest.class.isMethod();

    public isConstructor() {
        super("isStringConstant", RDTypeListActivity.class);
    }

    public void isMethod() throws Exception {
        GitTestHelper isVariable = isNameExpr.isMethod(isMethod());
        Repository isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr, "isStringConstant"));
        final RDTypeListActivity isVariable = isMethod();
        ListView isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        RDTTag isVariable = new RDTTag(isNameExpr);
        List<TagSummary> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isMethod()));
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); ++isNameExpr) {
            TagSummary isVariable = isNameExpr.isMethod(isNameExpr);
            View isVariable = isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr);
            TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isMethod()));
            if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                CharSequence isVariable = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                isMethod(isNameExpr, isMethod(isMethod("isStringConstant")));
                isMethod(isNameExpr, isMethod(isMethod("isStringConstant")));
            }
        }
    }
}
