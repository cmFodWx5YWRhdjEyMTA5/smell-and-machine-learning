// isComment
package de.azapps.mirakel.model.list;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.List;
import de.azapps.mirakel.helper.error.ErrorReporter;
import de.azapps.mirakel.helper.error.ErrorType;
import de.azapps.mirakel.model.generic.ModelBase;
import de.azapps.mirakel.model.file.FileMirakel;
import de.azapps.mirakel.model.list.meta.DueDeserializer;
import de.azapps.mirakel.model.list.meta.NegatedDeserializer;
import de.azapps.mirakel.model.list.meta.ProgressDeserializer;
import de.azapps.mirakel.model.list.meta.SetDeserializer;
import de.azapps.mirakel.model.list.meta.SpecialListsBaseProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsConjunctionList;
import de.azapps.mirakel.model.list.meta.SpecialListsContentProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsDoneProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsDueExistsProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsDueProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsFileProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsListNameProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsListProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsNameProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsPriorityProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsProgressProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsReminderProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsSubtaskProperty;
import de.azapps.mirakel.model.list.meta.SpecialListsTagProperty;
import de.azapps.mirakel.model.list.meta.StringDeserializer;
import de.azapps.mirakel.model.tags.Tag;
import de.azapps.mirakel.model.task.Task;
import de.azapps.tools.Log;
import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;

public final class isClassOrIsInterface {

    private static final Gson isVariable = new GsonBuilder().isMethod(SpecialListsDoneProperty.class, new NegatedDeserializer<>(SpecialListsDoneProperty.class)).isMethod(SpecialListsFileProperty.class, new NegatedDeserializer<>(SpecialListsFileProperty.class)).isMethod(SpecialListsReminderProperty.class, new NegatedDeserializer<>(SpecialListsReminderProperty.class)).isMethod(SpecialListsDueExistsProperty.class, new NegatedDeserializer<>(SpecialListsDueExistsProperty.class)).isMethod(SpecialListsListProperty.class, new SetDeserializer<>(SpecialListsListProperty.class)).isMethod(SpecialListsTagProperty.class, new SetDeserializer<>(SpecialListsTagProperty.class)).isMethod(SpecialListsPriorityProperty.class, new SetDeserializer<>(SpecialListsPriorityProperty.class)).isMethod(SpecialListsDueProperty.class, new DueDeserializer()).isMethod(SpecialListsContentProperty.class, new StringDeserializer<>(SpecialListsContentProperty.class)).isMethod(SpecialListsNameProperty.class, new StringDeserializer<>(SpecialListsNameProperty.class)).isMethod(SpecialListsListNameProperty.class, new StringDeserializer<>(SpecialListsListNameProperty.class)).isMethod(SpecialListsProgressProperty.class, new ProgressDeserializer()).isMethod();

    private static final String isVariable = "isStringConstant";

    @NonNull
    public static Optional<SpecialListsBaseProperty> isMethod(@NonNull final String isParameter, final String isParameter) throws IllegalArgumentException {
        if ((isNameExpr == null) || isNameExpr.isMethod(isNameExpr.isMethod())) {
            return isMethod();
        }
        try {
            final JsonElement isVariable = new JsonParser().isMethod(isNameExpr);
            return isMethod(isNameExpr, isIntegerConstant);
        } catch (final JsonSyntaxException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            return isMethod();
        }
    }

    @NonNull
    private static Optional<SpecialListsBaseProperty> isMethod(@NonNull final JsonElement isParameter, final int isParameter) throws IllegalArgumentException {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr);
        } else if (isNameExpr.isMethod()) {
            final List<SpecialListsBaseProperty> isVariable = new ArrayList<>(isNameExpr.isMethod().isMethod());
            for (final JsonElement isVariable : isNameExpr.isMethod()) {
                final Optional<SpecialListsBaseProperty> isVariable = isMethod(isNameExpr, isNameExpr + isIntegerConstant);
                if (isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                }
            }
            return isMethod((SpecialListsBaseProperty) new SpecialListsConjunctionList(((isNameExpr % isIntegerConstant) == isIntegerConstant) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
        } else if (isNameExpr.isMethod()) {
            return isMethod();
        } else {
            throw new IllegalArgumentException("isStringConstant");
        }
    }

    @NonNull
    private static Optional<SpecialListsBaseProperty> isMethod(@NonNull final JsonElement isParameter) {
        final JsonObject isVariable = isNameExpr.isMethod();
        final Class<? extends SpecialListsBaseProperty> isVariable;
        final String isVariable;
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsListProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsNameProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsPriorityProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsDoneProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsDueProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsContentProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsReminderProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsProgressProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsSubtaskProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsFileProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsTagProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + 'isStringConstant' + isNameExpr.isFieldAccessExpr)) {
            isNameExpr = isNameExpr.isFieldAccessExpr + 'isStringConstant' + isNameExpr.isFieldAccessExpr;
            isNameExpr = SpecialListsListNameProperty.class;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant")) {
            isNameExpr = isNameExpr.isFieldAccessExpr + "isStringConstant";
            isNameExpr = SpecialListsDueExistsProperty.class;
        } else if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            return isMethod();
        } else {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod());
        }
        final SpecialListsBaseProperty isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
        return isMethod(isNameExpr);
    }
}
