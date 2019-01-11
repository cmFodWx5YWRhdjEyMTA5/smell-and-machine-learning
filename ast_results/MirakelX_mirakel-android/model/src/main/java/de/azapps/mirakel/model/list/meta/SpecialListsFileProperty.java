// isComment
package de.azapps.mirakel.model.list.meta;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;
import de.azapps.mirakel.model.R;
import de.azapps.mirakel.model.file.FileMirakel;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder.Operation;
import de.azapps.mirakel.model.task.Task;

public class isClassOrIsInterface extends SpecialListsBooleanProperty {

    public isConstructor(boolean isParameter) {
        super(isNameExpr);
    }

    private isConstructor(@NonNull final Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(@NonNull final SpecialListsBaseProperty isParameter) {
        super(isNameExpr);
    }

    @Override
    protected // isComment
    String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @NonNull
    @Override
    public MirakelQueryBuilder isMethod(@NonNull final Context isParameter) {
        final MirakelQueryBuilder.Operation isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
        return new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, new MirakelQueryBuilder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @NonNull
    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod(@NonNull Context isParameter) {
        return isMethod(isNameExpr);
    }

    public static final Creator<SpecialListsFileProperty> isVariable = new Creator<SpecialListsFileProperty>() {

        public SpecialListsFileProperty isMethod(Parcel isParameter) {
            return new SpecialListsFileProperty(isNameExpr);
        }

        public SpecialListsFileProperty[] isMethod(int isParameter) {
            return new SpecialListsFileProperty[isNameExpr];
        }
    };
}
