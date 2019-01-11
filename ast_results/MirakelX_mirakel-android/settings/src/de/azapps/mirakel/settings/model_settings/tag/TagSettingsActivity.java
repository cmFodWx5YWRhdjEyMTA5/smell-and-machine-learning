// isComment
package de.azapps.mirakel.settings.model_settings.tag;

import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.google.common.base.Optional;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.tags.Tag;
import de.azapps.mirakel.settings.R;
import de.azapps.mirakel.settings.model_settings.generic_list.GenericModelListActivity;
import static com.google.common.base.Optional.of;

public class isClassOrIsInterface extends GenericModelListActivity<Tag> {

    @Override
    protected boolean isMethod() {
        return true;
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    @NonNull
    @Override
    protected Optional<Fragment> isMethod(@NonNull final Tag isParameter) {
        return isMethod((android.app.Fragment) new TagDetailFragment());
    }

    @NonNull
    @Override
    protected Class<? extends GenericModelListActivity> isMethod() {
        return TagSettingsActivity.class;
    }

    @NonNull
    @Override
    protected Tag isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected void isMethod(@NonNull final Context isParameter) {
        isMethod(isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
    }

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected Class<Tag> isMethod() {
        return Tag.class;
    }

    @Override
    protected Cursor isMethod() {
        return new MirakelQueryBuilder(this).isMethod(isNameExpr.isFieldAccessExpr).isMethod();
    }
}
