// isComment
package org.brandroid.openmanager.views;

import org.brandroid.openmanager.R;
import org.brandroid.openmanager.adapters.OpenPathAdapter;
import org.brandroid.openmanager.data.OpenPath;
import org.brandroid.openmanager.interfaces.OpenApp;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.ListView;

public class isClassOrIsInterface extends ListView {

    private OpenPath isVariable = null;

    private OpenPathAdapter isVariable = null;

    private final OpenApp isVariable;

    public isConstructor(OpenPath isParameter, OpenApp isParameter) {
        super(isNameExpr.isMethod());
        isNameExpr = isNameExpr;
        isMethod(isNameExpr);
    }

    public isConstructor(OpenApp isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr.isMethod(), isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public void isMethod(OpenPath isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = new OpenPathAdapter(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod();
    }

    @Override
    public ListAdapter isMethod() {
        if (isNameExpr == null)
            return super.isMethod();
        if (isNameExpr == null)
            isNameExpr = new OpenPathAdapter(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }
}
