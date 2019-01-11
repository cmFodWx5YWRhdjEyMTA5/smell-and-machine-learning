// isComment
package de.azapps.mirakel.model.query_builder;

import android.database.Cursor;
import android.support.annotation.NonNull;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import java.util.Arrays;
import java.util.List;
import de.azapps.mirakel.model.account.AccountMirakel;
import de.azapps.mirakel.model.file.FileMirakel;
import de.azapps.mirakel.model.generic.ModelBase;
import de.azapps.mirakel.model.list.ListMirakel;
import de.azapps.mirakel.model.list.SpecialList;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder.Operation;
import de.azapps.mirakel.model.recurring.Recurring;
import de.azapps.mirakel.model.semantic.Semantic;
import de.azapps.mirakel.model.task.Task;
import de.azapps.mirakelandroid.BuildConfig;
import de.azapps.mirakelandroid.test.MirakelDatabaseTestCase;
import de.azapps.mirakelandroid.test.MultiApiRobolectricTestRunner;
import de.azapps.mirakelandroid.test.RandomHelper;
import static com.google.common.truth.Truth.assertThat;

@RunWith(MultiApiRobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class isClassOrIsInterface extends MirakelDatabaseTestCase {

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    private static void isMethod(final MirakelQueryBuilder isParameter, final Operation isParameter, final String isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + 'isStringConstant' + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    private static void isMethod(final MirakelQueryBuilder isParameter, final Operation isParameter, final String isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + 'isStringConstant' + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + 'isStringConstant');
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        final Task isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() {
        final List<Integer> isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

            @Override
            public String isMethod(final Integer isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        }));
    }

    @Test
    public void isMethod() {
        final List<String> isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant");
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    // isComment
    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        final Optional<Task> isVariable = isNameExpr.isMethod(Task.class);
        isMethod(isNameExpr).isMethod();
        final Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        Task isVariable = new Task(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        Optional<AccountMirakel> isVariable = isNameExpr.isMethod(AccountMirakel.class);
        isMethod(isNameExpr).isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        AccountMirakel isVariable = new AccountMirakel(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        Optional<FileMirakel> isVariable = isNameExpr.isMethod(FileMirakel.class);
        isMethod(isNameExpr).isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        FileMirakel isVariable = new FileMirakel(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        Optional<Recurring> isVariable = isNameExpr.isMethod(Recurring.class);
        isMethod(isNameExpr).isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        Recurring isVariable = new Recurring(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        Optional<Semantic> isVariable = isNameExpr.isMethod(Semantic.class);
        isMethod(isNameExpr).isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        Semantic isVariable = new Semantic(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        Optional<ListMirakel> isVariable = isNameExpr.isMethod(ListMirakel.class);
        isMethod(isNameExpr).isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        ListMirakel isVariable = new ListMirakel(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true);
        final Optional<SpecialList> isVariable = isNameExpr.isMethod(SpecialList.class);
        isMethod(isNameExpr).isMethod();
        Cursor isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr.isMethod().isMethod()) }, null);
        isMethod(isNameExpr.isMethod()).isMethod();
        final SpecialList isVariable = new SpecialList(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        List<Task> isVariable = isNameExpr.isMethod(Task.class);
        List<Task> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<Task>() {

            @Override
            public Task isMethod(@NonNull CursorGetter isParameter) {
                return new Task(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        final List<AccountMirakel> isVariable = isNameExpr.isMethod(AccountMirakel.class);
        final List<AccountMirakel> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<AccountMirakel>() {

            @Override
            public AccountMirakel isMethod(@NonNull CursorGetter isParameter) {
                return new AccountMirakel(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        List<FileMirakel> isVariable = isNameExpr.isMethod(FileMirakel.class);
        List<FileMirakel> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<FileMirakel>() {

            @Override
            public FileMirakel isMethod(@NonNull CursorGetter isParameter) {
                return new FileMirakel(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        List<Recurring> isVariable = isNameExpr.isMethod(Recurring.class);
        List<Recurring> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<Recurring>() {

            @Override
            public Recurring isMethod(@NonNull CursorGetter isParameter) {
                return new Recurring(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        List<Semantic> isVariable = isNameExpr.isMethod(Semantic.class);
        List<Semantic> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<Semantic>() {

            @Override
            public Semantic isMethod(@NonNull CursorGetter isParameter) {
                return new Semantic(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        List<ListMirakel> isVariable = isNameExpr.isMethod(ListMirakel.class);
        List<ListMirakel> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<ListMirakel>() {

            @Override
            public ListMirakel isMethod(@NonNull CursorGetter isParameter) {
                return new ListMirakel(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        final MirakelQueryBuilder isVariable = new MirakelQueryBuilder(isNameExpr.isFieldAccessExpr);
        List<SpecialList> isVariable = isNameExpr.isMethod(SpecialList.class);
        List<SpecialList> isVariable = new Cursor2List<>(new CursorWrapper.CursorConverter<SpecialList>() {

            @Override
            public SpecialList isMethod(@NonNull CursorGetter isParameter) {
                return new SpecialList(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, null, null)));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
