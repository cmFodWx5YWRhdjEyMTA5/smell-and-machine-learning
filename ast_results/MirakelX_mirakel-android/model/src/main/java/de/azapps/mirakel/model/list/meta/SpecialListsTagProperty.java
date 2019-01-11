// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import java.util.ArrayList;
import java.util.List;
import de.azapps.mirakel.model.provider.MirakelInternalContentProvider;
import de.azapps.mirakel.model.generic.ModelBase;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.tags.Tag;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsSetProperty {

    public isConstructor(final boolean isParameter, final List<Integer> isParameter) {
        super(isNameExpr, isNameExpr);
    }

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
        if (isNameExpr instanceof SpecialListsTagProperty) {
            isNameExpr = ((SpecialListsTagProperty) isNameExpr).isMethod();
            isNameExpr = ((SpecialListsTagProperty) isNameExpr).isMethod();
        } else {
            isNameExpr = new ArrayList<>(isIntegerConstant);
            isNameExpr = true;
        }
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        if (isNameExpr.isMethod()) {
            return new MirakelQueryBuilder(isNameExpr);
        }
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new MirakelQueryBuilder(isNameExpr).isMethod().isMethod("isStringConstant").isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull final Context isParameter) {
        if (isNameExpr.isMethod()) {
            return "isStringConstant";
        }
        List<Tag> isVariable = new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod(Tag.class);
        return (this.isFieldAccessExpr ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) : "isStringConstant") + 'isStringConstant' + isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, new Function<Tag, String>() {

            @Override
            public String isMethod(Tag isParameter) {
                return isNameExpr.isMethod();
            }
        }));
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public static final Creator<SpecialListsTagProperty> isVariable = new Creator<SpecialListsTagProperty>() {

        @Override
        public SpecialListsTagProperty isMethod(final Parcel isParameter) {
            return new SpecialListsTagProperty(isNameExpr);
        }

        @Override
        public SpecialListsTagProperty[] isMethod(final int isParameter) {
            return new SpecialListsTagProperty[isNameExpr];
        }
    };
}
