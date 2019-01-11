// isComment
package de.tum.in.tumcampusapp.component.ui.barrierfree;

import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.api.app.TUMCabeClient;
import de.tum.in.tumcampusapp.component.other.generic.activity.ActivityForLoadingInBackground;
import de.tum.in.tumcampusapp.component.ui.barrierfree.model.BarrierfreeContact;
import de.tum.in.tumcampusapp.utils.Utils;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class isClassOrIsInterface extends ActivityForLoadingInBackground<Void, List<BarrierfreeContact>> {

    public StickyListHeadersListView isVariable;

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
    }

    @Override
    protected List<BarrierfreeContact> isMethod(Void... isParameter) {
        isMethod();
        List<BarrierfreeContact> isVariable = new ArrayList<>();
        try {
            isNameExpr = isNameExpr.isMethod(this).isMethod();
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        }
        return isNameExpr;
    }

    @Override
    protected void isMethod(List<BarrierfreeContact> isParameter) {
        isMethod();
        if (isNameExpr == null || isNameExpr.isMethod()) {
            isMethod();
            return;
        }
        BarrierfreeContactAdapter isVariable = new BarrierfreeContactAdapter(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
