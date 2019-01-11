// isComment
package com.nilhcem.hostseditor.ui.list;

import android.text.TextUtils;
import android.widget.Filter;
import com.nilhcem.hostseditor.core.Host;
import com.nilhcem.hostseditor.core.HostsManager;
import com.nilhcem.hostseditor.event.RefreshHostsEvent;
import com.squareup.otto.Bus;
import java.util.List;
import javax.inject.Inject;
import timber.log.Timber;

public class isClassOrIsInterface extends Filter {

    private final Bus isVariable;

    private final HostsManager isVariable;

    @Inject
    public isConstructor(Bus isParameter, HostsManager isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @SuppressWarnings("isStringConstant")
    @Override
    protected void isMethod(CharSequence isParameter, FilterResults isParameter) {
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        isNameExpr.isMethod(new RefreshHostsEvent((List<Host>) isNameExpr.isFieldAccessExpr));
    }

    @Override
    protected FilterResults isMethod(CharSequence isParameter) {
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        FilterResults isVariable = new FilterResults();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }
}
