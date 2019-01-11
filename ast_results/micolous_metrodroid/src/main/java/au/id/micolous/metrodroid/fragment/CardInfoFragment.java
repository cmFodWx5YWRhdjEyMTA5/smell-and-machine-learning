// isComment
package au.id.micolous.metrodroid.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import au.id.micolous.metrodroid.activity.CardInfoActivity;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.ui.ListItem;
import au.id.micolous.metrodroid.ui.UriListItem;

public class isClassOrIsInterface extends ListFragment {

    private TransitData isVariable;

    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(View isParameter, Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isMethod(new ListItemAdapter(isMethod(), isNameExpr.isMethod()));
    }

    @Override
    public void isMethod(ListView isParameter, View isParameter, int isParameter, long isParameter) {
        ListItem isVariable = (ListItem) isMethod().isMethod(isNameExpr);
        if (isNameExpr instanceof UriListItem) {
            Uri isVariable = ((UriListItem) isNameExpr).isMethod();
            isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr));
        }
    }
}
