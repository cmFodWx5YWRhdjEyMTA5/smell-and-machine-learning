// isComment
package de.azapps.mirakel.model.semantic;

import com.google.common.base.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import java.util.List;
import de.azapps.mirakel.model.list.ListMirakel;
import de.azapps.mirakelandroid.BuildConfig;
import de.azapps.mirakelandroid.test.MirakelDatabaseTestCase;
import de.azapps.mirakelandroid.test.MultiApiRobolectricTestRunner;
import de.azapps.mirakelandroid.test.RandomHelper;
import static com.google.common.base.Optional.of;
import static com.google.common.truth.Truth.assertThat;

@RunWith(MultiApiRobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class isClassOrIsInterface extends MirakelDatabaseTestCase {

    // isComment
    @Test
    public void isMethod() {
        final List<Semantic> isVariable = isNameExpr.isMethod();
        final Semantic isVariable = isNameExpr.isMethod(isNameExpr);
        final String isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final List<Semantic> isVariable = isNameExpr.isMethod();
        final Semantic isVariable = isNameExpr.isMethod(isNameExpr);
        final Optional<Integer> isVariable = isNameExpr.isMethod(isIntegerConstant) > isIntegerConstant ? isNameExpr.<Integer>isMethod() : isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final List<Semantic> isVariable = isNameExpr.isMethod();
        final Semantic isVariable = isNameExpr.isMethod(isNameExpr);
        final Optional<Integer> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final List<Semantic> isVariable = isNameExpr.isMethod();
        final Semantic isVariable = isNameExpr.isMethod(isNameExpr);
        final Optional<ListMirakel> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final List<Semantic> isVariable = isNameExpr.isMethod();
        final Semantic isVariable = isNameExpr.isMethod(isNameExpr);
        final Optional<Integer> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }
}
