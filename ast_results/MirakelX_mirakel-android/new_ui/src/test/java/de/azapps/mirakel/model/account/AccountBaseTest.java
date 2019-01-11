// isComment
package de.azapps.mirakel.model.account;

import com.google.common.base.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import java.util.List;
import de.azapps.mirakelandroid.BuildConfig;
import de.azapps.mirakelandroid.test.MirakelDatabaseTestCase;
import de.azapps.mirakelandroid.test.MultiApiRobolectricTestRunner;
import de.azapps.mirakelandroid.test.RandomHelper;
import static com.google.common.truth.Truth.assertThat;
import static de.azapps.mirakel.model.account.AccountMirakel.ACCOUNT_TYPES;

@RunWith(MultiApiRobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class isClassOrIsInterface extends MirakelDatabaseTestCase {

    // isComment
    @Test
    public void isMethod() {
        final List<AccountMirakel> isVariable = isNameExpr.isMethod();
        final AccountMirakel isVariable = isNameExpr.isMethod(isNameExpr);
        final ACCOUNT_TYPES isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final List<AccountMirakel> isVariable = isNameExpr.isMethod();
        final AccountMirakel isVariable = isNameExpr.isMethod(isNameExpr);
        final boolean isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final List<AccountMirakel> isVariable = isNameExpr.isMethod();
        final AccountMirakel isVariable = isNameExpr.isMethod(isNameExpr);
        final Optional<String> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }
}
