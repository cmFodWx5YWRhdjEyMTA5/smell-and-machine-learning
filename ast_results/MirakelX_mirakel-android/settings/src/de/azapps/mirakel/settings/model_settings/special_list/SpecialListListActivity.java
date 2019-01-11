// isComment
package de.azapps.mirakel.settings.model_settings.special_list;

import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.google.common.base.Optional;
import de.azapps.mirakel.DefinitionsHelper;
import de.azapps.mirakel.model.DatabaseHelper;
import de.azapps.mirakel.model.list.ListMirakel;
import de.azapps.mirakel.model.list.SpecialList;
import de.azapps.mirakel.model.list.meta.SpecialListsBaseProperty;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.settings.R;
import de.azapps.mirakel.settings.model_settings.generic_list.GenericModelListActivity;
import static com.google.common.base.Optional.of;

public class isClassOrIsInterface extends GenericModelListActivity<SpecialList> {

    @Override
    protected boolean isMethod() {
        return true;
    }

    @NonNull
    @Override
    protected Optional<Fragment> isMethod(@NonNull final SpecialList isParameter) {
        return isMethod((Fragment) new SpecialListDetailFragment());
    }

    @NonNull
    @Override
    protected Class<? extends GenericModelListActivity> isMethod() {
        return SpecialListListActivity.class;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    @NonNull
    @Override
    protected SpecialList isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected void isMethod(@NonNull final Context isParameter) {
        try {
            isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.<SpecialListsBaseProperty>isMethod(), true));
        } catch (final ListMirakel.ListAlreadyExistsException isParameter) {
        // isComment
        }
    }

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected Class<SpecialList> isMethod() {
        return SpecialList.class;
    }

    @Override
    protected Cursor isMethod() {
        return new MirakelQueryBuilder(this).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod();
    }
}
