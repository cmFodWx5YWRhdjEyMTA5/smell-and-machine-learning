// isComment
package au.id.micolous.metrodroid.transit.serialonly;

import java.util.ArrayList;
import java.util.List;
import au.id.micolous.farebot.R;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.ui.ListItem;
import au.id.micolous.metrodroid.ui.UriListItem;

public abstract class isClassOrIsInterface extends TransitData {

    @Override
    public final List<ListItem> isMethod() {
        List<ListItem> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod()));
        isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod()));
        List<ListItem> isVariable = isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr);
        switch(isMethod()) {
            case isNameExpr:
                isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                break;
            case isNameExpr:
                isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                break;
            case isNameExpr:
                isNameExpr.isMethod(new ListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                break;
        }
        if (isMethod() != null) {
            isNameExpr.isMethod(new UriListItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod()));
        }
        return isNameExpr;
    }

    protected enum Reason {

        UNSPECIFIED, NOT_STORED, LOCKED, MORE_RESEARCH_NEEDED
    }

    protected List<ListItem> isMethod() {
        return null;
    }

    protected abstract Reason isMethod();
}
