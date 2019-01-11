// isComment
package de.azapps.mirakel.model.tags;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import java.util.List;
import de.azapps.mirakelandroid.BuildConfig;
import de.azapps.mirakelandroid.test.MirakelDatabaseTestCase;
import de.azapps.mirakelandroid.test.MultiApiRobolectricTestRunner;
import de.azapps.mirakelandroid.test.RandomHelper;
import static com.google.common.truth.Truth.assertThat;

@RunWith(MultiApiRobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class isClassOrIsInterface extends MirakelDatabaseTestCase {

    // isComment
    @Test
    public void isMethod() {
        final List<Tag> isVariable = isNameExpr.isMethod();
        final Tag isVariable = isNameExpr.isMethod(isNameExpr);
        final int isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }
}
