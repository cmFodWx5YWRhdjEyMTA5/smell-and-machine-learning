// isComment
package org.quantumbadger.redreader.fragments;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import org.quantumbadger.redreader.R;
import org.quantumbadger.redreader.common.ChangelogManager;

public final class isClassOrIsInterface extends PropertiesDialog {

    public static ChangelogDialog isMethod() {
        return new ChangelogDialog();
    }

    @Override
    protected String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(AppCompatActivity isParameter, LinearLayout isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr, true);
    }
}
