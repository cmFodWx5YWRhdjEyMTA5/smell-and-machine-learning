// isComment
package de.azapps.mirakel.model.list.meta;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import java.util.ArrayList;
import java.util.List;
import de.azapps.mirakel.model.list.SpecialList;
import de.azapps.mirakel.model.list.SpecialListsWhereDeserializer;
import de.azapps.mirakel.model.list.meta.SpecialListsConjunctionList.CONJUNCTION;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakelandroid.BuildConfig;
import de.azapps.mirakelandroid.test.MirakelDatabaseTestCase;
import de.azapps.mirakelandroid.test.MultiApiRobolectricTestRunner;
import de.azapps.mirakelandroid.test.RandomHelper;
import static com.google.common.truth.Truth.assertThat;
import static junit.framework.Assert.fail;

@RunWith(MultiApiRobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class isClassOrIsInterface extends MirakelDatabaseTestCase {

    @Test
    public void isMethod() {
        List<SpecialList> isVariable = isNameExpr.isMethod();
        for (SpecialList isVariable : isNameExpr) {
            isMethod(isNameExpr.isMethod()).isMethod();
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsDoneProperty isVariable = new SpecialListsDoneProperty(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr ? "isStringConstant" : "isStringConstant");
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsDoneProperty)) {
            final SpecialListsDoneProperty isVariable = (SpecialListsDoneProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsReminderProperty isVariable = new SpecialListsReminderProperty(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr ? "isStringConstant" : "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsReminderProperty)) {
            final SpecialListsReminderProperty isVariable = (SpecialListsReminderProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsFileProperty isVariable = new SpecialListsFileProperty(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod((isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsFileProperty)) {
            final SpecialListsFileProperty isVariable = (SpecialListsFileProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsDueExistsProperty isVariable = new SpecialListsDueExistsProperty(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr ? "isStringConstant" : "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsDueExistsProperty)) {
            final SpecialListsDueExistsProperty isVariable = (SpecialListsDueExistsProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final String isVariable = isNameExpr.isMethod();
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsStringProperty.Type isVariable = isNameExpr.isMethod();
        final SpecialListsContentProperty isVariable = new SpecialListsContentProperty(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod((isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        switch(isNameExpr) {
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr + 'isStringConstant');
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod('isStringConstant' + isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod('isStringConstant' + isNameExpr + 'isStringConstant');
                break;
        }
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsContentProperty)) {
            final SpecialListsContentProperty isVariable = (SpecialListsContentProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final String isVariable = isNameExpr.isMethod();
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsStringProperty.Type isVariable = isNameExpr.isMethod();
        final SpecialListsNameProperty isVariable = new SpecialListsNameProperty(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod((isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        switch(isNameExpr) {
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr + 'isStringConstant');
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod('isStringConstant' + isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod('isStringConstant' + isNameExpr + 'isStringConstant');
                break;
        }
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsNameProperty)) {
            final SpecialListsNameProperty isVariable = (SpecialListsNameProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final String isVariable = isNameExpr.isMethod();
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsStringProperty.Type isVariable = isNameExpr.isMethod();
        final SpecialListsListNameProperty isVariable = new SpecialListsListNameProperty(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant" + (isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        switch(isNameExpr) {
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod(isNameExpr + 'isStringConstant');
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod('isStringConstant' + isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod()).isMethod('isStringConstant' + isNameExpr + 'isStringConstant');
                break;
        }
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsListNameProperty)) {
            final SpecialListsListNameProperty isVariable = (SpecialListsListNameProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsDueProperty.Unit isVariable = isNameExpr.isMethod();
        final int isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
        final SpecialListsDueProperty isVariable = new SpecialListsDueProperty(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        DateTime isVariable = new LocalDate().isMethod().isMethod(isIntegerConstant).isMethod(isIntegerConstant);
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                break;
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                break;
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                break;
        }
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant" + (isNameExpr ? 'isStringConstant' : 'isStringConstant') + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsDueProperty)) {
            final SpecialListsDueProperty isVariable = (SpecialListsDueProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    // isComment
    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final List<Integer> isVariable = isNameExpr.isMethod();
        final List<SpecialList> isVariable = isNameExpr.isMethod();
        final List<Integer> isVariable = new ArrayList<>(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, new Function<SpecialList, Integer>() {

            @Override
            public Integer isMethod(final SpecialList isParameter) {
                return (int) isNameExpr.isMethod();
            }
        }));
        final SpecialListsListProperty isVariable = new SpecialListsListProperty(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        final List<MirakelQueryBuilder> isVariable = new ArrayList<>(isNameExpr.isMethod(isNameExpr, new Function<SpecialList, MirakelQueryBuilder>() {

            @Override
            public MirakelQueryBuilder isMethod(final SpecialList isParameter) {
                return isNameExpr.isMethod();
            }
        }));
        final String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new Function<MirakelQueryBuilder, String>() {

            @Override
            public String isMethod(final MirakelQueryBuilder isParameter) {
                return 'isStringConstant' + isNameExpr.isMethod() + 'isStringConstant';
            }
        }));
        final List<String> isVariable = new ArrayList<>(isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

            @Override
            public String isMethod(final Integer isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        }));
        for (final MirakelQueryBuilder isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        String isVariable = "isStringConstant";
        if (!isNameExpr.isMethod()) {
            isNameExpr += isNameExpr;
        }
        if (!isNameExpr.isMethod()) {
            if (!isNameExpr.isMethod()) {
                isNameExpr += "isStringConstant";
            }
            isNameExpr += "isStringConstant" + isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

                @Override
                public String isMethod(final Integer isParameter) {
                    return "isStringConstant";
                }
            })) + 'isStringConstant';
        }
        if (isNameExpr && !isNameExpr.isMethod().isMethod()) {
            isNameExpr = "isStringConstant" + isNameExpr + 'isStringConstant';
        }
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsListProperty)) {
            final SpecialListsListProperty isVariable = (SpecialListsListProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final List<Integer> isVariable = new ArrayList<>(isIntegerConstant);
        for (int isVariable = -isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        final SpecialListsPriorityProperty isVariable = new SpecialListsPriorityProperty(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        String isVariable;
        if (isNameExpr.isMethod()) {
            isNameExpr = "isStringConstant";
        } else {
            isNameExpr = "isStringConstant" + isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

                @Override
                public String isMethod(final Integer isParameter) {
                    return "isStringConstant";
                }
            })) + 'isStringConstant';
            if (isNameExpr) {
                isNameExpr = "isStringConstant" + isNameExpr;
            }
        }
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

            @Override
            public String isMethod(final Integer isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        }));
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsPriorityProperty)) {
            final SpecialListsPriorityProperty isVariable = (SpecialListsPriorityProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final int isVariable = isNameExpr.isMethod(isIntegerConstant);
        final SpecialListsProgressProperty.OPERATION isVariable = isNameExpr.isMethod();
        final SpecialListsProgressProperty isVariable = new SpecialListsProgressProperty(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        String isVariable;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = "isStringConstant";
                break;
            case isNameExpr:
                isNameExpr = "isStringConstant";
                break;
            case isNameExpr:
                isNameExpr = "isStringConstant";
                break;
            default:
                isMethod("isStringConstant");
                return;
        }
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsProgressProperty)) {
            final SpecialListsProgressProperty isVariable = (SpecialListsProgressProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsSubtaskProperty isVariable = new SpecialListsSubtaskProperty(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod((isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant" + (isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod();
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsSubtaskProperty)) {
            final SpecialListsSubtaskProperty isVariable = (SpecialListsSubtaskProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final int isVariable = isNameExpr.isMethod(isIntegerConstant);
        final List<Integer> isVariable = new ArrayList<>(isNameExpr);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsTagProperty isVariable = new SpecialListsTagProperty(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        String isVariable = "isStringConstant";
        if (!isNameExpr.isMethod()) {
            isNameExpr = (isNameExpr ? "isStringConstant" : "isStringConstant") + "isStringConstant";
            isNameExpr += isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

                @Override
                public String isMethod(final Integer isParameter) {
                    return "isStringConstant";
                }
            }));
            isNameExpr += "isStringConstant";
        }
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr, new Function<Integer, String>() {

            @Override
            public String isMethod(final Integer isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        }));
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsTagProperty)) {
            final SpecialListsTagProperty isVariable = (SpecialListsTagProperty) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        final boolean isVariable = isNameExpr.isMethod();
        final SpecialListsDoneProperty isVariable = new SpecialListsDoneProperty(isNameExpr);
        final SpecialListsConjunctionList isVariable = new SpecialListsConjunctionList(isNameExpr, isNameExpr.isFieldAccessExpr);
        final SpecialListsConjunctionList isVariable = new SpecialListsConjunctionList(isNameExpr, isNameExpr.isFieldAccessExpr);
        final SpecialListsConjunctionList isVariable = new SpecialListsConjunctionList(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsConjunctionList.class);
        final SpecialListsConjunctionList isVariable = (SpecialListsConjunctionList) isNameExpr.isMethod().isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsConjunctionList.class);
        final SpecialListsConjunctionList isVariable = (SpecialListsConjunctionList) isNameExpr.isMethod().isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsConjunctionList.class);
        SpecialListsConjunctionList isVariable = (SpecialListsConjunctionList) isNameExpr.isMethod().isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
        isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        final MirakelQueryBuilder isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        String isVariable = 'isStringConstant' + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod() + 'isStringConstant';
        final String isVariable = isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr ? "isStringConstant" : "isStringConstant", isNameExpr ? "isStringConstant" : "isStringConstant", isNameExpr ? "isStringConstant" : "isStringConstant", isNameExpr ? "isStringConstant" : "isStringConstant");
        final Optional<SpecialListsBaseProperty> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
        if (isNameExpr.isMethod() && (isNameExpr.isMethod() instanceof SpecialListsConjunctionList)) {
            final SpecialListsConjunctionList isVariable = (SpecialListsConjunctionList) isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
            isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsConjunctionList.class);
            final SpecialListsConjunctionList isVariable = (SpecialListsConjunctionList) isNameExpr.isMethod().isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
            isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsConjunctionList.class);
            final SpecialListsConjunctionList isVariable = (SpecialListsConjunctionList) isNameExpr.isMethod().isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
            isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
            isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
            isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(SpecialListsDoneProperty.class);
            isMethod(((SpecialListsDoneProperty) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod()).isMethod(isNameExpr);
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }
}
