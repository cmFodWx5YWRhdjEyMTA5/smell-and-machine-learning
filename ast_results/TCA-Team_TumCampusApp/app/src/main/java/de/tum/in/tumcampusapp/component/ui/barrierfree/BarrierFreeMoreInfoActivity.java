// isComment
package de.tum.in.tumcampusapp.component.ui.barrierfree;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.api.app.TUMCabeClient;
import de.tum.in.tumcampusapp.component.other.generic.activity.ActivityForLoadingInBackground;
import de.tum.in.tumcampusapp.component.ui.barrierfree.model.BarrierfreeMoreInfo;
import de.tum.in.tumcampusapp.utils.Utils;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class isClassOrIsInterface extends ActivityForLoadingInBackground<Void, List<BarrierfreeMoreInfo>> implements AdapterView.OnItemClickListener {

    public StickyListHeadersListView isVariable;

    public List<BarrierfreeMoreInfo> isVariable;

    public BarrierfreeMoreInfoAdapter isVariable;

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
    protected void isMethod(List<BarrierfreeMoreInfo> isParameter) {
        isMethod();
        if (isNameExpr == null || isNameExpr.isMethod()) {
            isMethod();
            return;
        }
        isNameExpr = isNameExpr;
        isNameExpr = new BarrierfreeMoreInfoAdapter(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
    }

    @Override
    protected List<BarrierfreeMoreInfo> isMethod(Void... isParameter) {
        isMethod();
        List<BarrierfreeMoreInfo> isVariable = new ArrayList<>();
        try {
            isNameExpr = isNameExpr.isMethod(this).isMethod();
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr);
    }
}
